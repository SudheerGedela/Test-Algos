package comparable.comparator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Project: Test-Algos
 * Package: comparable.comparator
 * <p>
 * User: vamshi
 * Date: 5/4/18
 * Time: 10:22 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class TestCompare {

    static public void main(String...args){
        List<Employee> empl = new ArrayList<>();

        empl.add(0, new Employee("Vamsi","Brown","Chittoor",31));
        empl.add(1, new Employee("Usha","Black","Chittoor",32));
        empl.add(2, new Employee("Ramani","White","Chittoor",33));
        empl.add(3, new Employee("Gopi","Brown","Chittoor",34));
        empl.add(4, new Employee("Poni","Gold","Chittoor",35));


        empl.forEach(e -> System.out.println("Name: "+e.getName()+"\t SkinColor: "
                +e.getSkinColor()+"\t\t PlaceOfBirth: "
                +e.getPlaceOfBirth()+"\t\t Age:"+e.getAge()));

        Collections.sort(empl);
        System.out.println("Hello");

        empl.forEach(e -> System.out.println("Name: "+e.getName()+"\t SkinColor: "
                +e.getSkinColor()+"\t\t PlaceOfBirth: "
                +e.getPlaceOfBirth()+"\t\t Age:"+e.getAge()));


    }

}


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@JsonIgnoreProperties
class Employee implements Comparable<Employee>{
    private String name;
    private String skinColor;
    private String placeOfBirth;
    private int age;

    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.name);
    }
}
