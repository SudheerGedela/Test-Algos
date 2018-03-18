package alogos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Project: algo-test
 * Package: alogos
 * <p>
 * User: vthalapu
 * Date: 3/11/18
 * Time: 5:52 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Lambdas {
    static public void main(String...args){
        Empl empl = new Empl();

        CheckCode c = emp -> emp.getRating() > 2;
        System.out.println(c.checkCode(empl));

        c = emp -> emp.getSalary() > 10000;
        if(c.checkCode(empl)){
            System.out.println("A manager");
        }
    }
}


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Empl {

    int salary = 100000;
    int rating = 5;

}

interface CheckCode {
    boolean checkCode(Empl empl);
}
