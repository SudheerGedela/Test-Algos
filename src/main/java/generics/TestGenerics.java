package generics;

/**
 * Project: Test-Algos
 * Package: generics
 * <p>
 * User: vthalapu
 * Date: 4/9/18
 * Time: 11:04 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class TestGenerics {

    public static void main(String... args) {
        System.out.println(new TestGenerics().testingGenerics(10));
        System.out.println(new TestGenerics().testingGenerics("Hello Vamsi"));
        System.out.println(new TestGenerics().testingGenerics('C'));
        System.out.println(new TestGenerics().testingGenerics(new String("New Object")));

    }

    //wrong
//    public void testGen1(<T> t){
//
//    }

    public <T> T testGen() {
        return null;
    }

    public <T> T testGen2(T t) {
        return null;
    }

    public <T> T testingGenerics(T t) {
        if (t instanceof Integer)
            System.out.println("T is a Integer -> " + t);
        if (t instanceof String)
            System.out.println("T is a String -> " + t);
        if (t instanceof Character)
            System.out.println("T is a Character -> " + t);

        return t;
    }


}
