package recursions;

/**
 * Project: algo-lambdas
 * Package: recursions
 * <p>
 * User: vthalapu
 * Date: 3/21/18
 * Time: 11:04 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class TestRecursions {

    static public void main(String... args) {
        TestRecursions testRecursions = new TestRecursions();
        System.out.println(testRecursions.factRecursion(10));

    }

    int factRecursion(int n) {

        if (n == 1) {
            return 1;
        }

        return n * factRecursion(n - 1);

    }


}
