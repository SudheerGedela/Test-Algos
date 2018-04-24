package inner.classes;

/**
 * Project: Test-Algos
 * Package: inner.classes
 * <p>
 * User: vamshi
 * Date: 4/24/18
 * Time: 1:30 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class AnanamouseWithInter {

    static public void main(String...args){ //Very interesting
        Flyable bird = new Flyable() {
            //        Use new to instantiate interface.
            public void fly() {
                System.out.println("Flying high in the sky");
            }
        };

        bird.fly();
    }
}


interface Flyable {
    void fly();

//    default void fly(){
//        System.out.println("Inside the interface");
//    }
}
