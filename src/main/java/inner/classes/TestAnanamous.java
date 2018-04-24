package inner.classes;

/**
 * Project: Test-Algos
 * Package: inner.classes
 * <p>
 * User: vamshi
 * Date: 4/24/18
 * Time: 1:21 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class TestAnanamous {


    static public void main(String...args){
        TestAna testAna = new TestAna(){
            public void helloWorld() {
                System.out.println("Override :: Printing hello world");
            }
        };
        testAna.helloWorld();

    }

}

class TestAna{

    public void helloWorld() {
        System.out.println("Actual :: Printing hello world");
    }
}
