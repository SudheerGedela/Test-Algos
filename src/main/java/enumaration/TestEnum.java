package enumaration;

enum StringEnum {
    VAMSI(31), USHA(29), RAMANI(55), GOPI(63), PONI(27);


    private int age;

    StringEnum(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}

/**
 * Project: algo-test
 * Package: enumaration
 * <p>
 * User: vamshi
 * Date: 4/22/18
 * Time: 6:46 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class TestEnum {
    static public void main(String... args) {
//        String.VAMSI
        System.out.println(StringEnum.GOPI);


    }
}