/**
 * The class that contains information about the roots
 *
 * set of constructors:
 * <code>public Roots(double x1, double x2);</code>
 * <code>public Roots(double x);</code>
 * <code>public Roots();</code>
 *
 * The method <code>public void printRoots();</code>
 * prints the result of solving the equation (roots)
 */

package QuadraticEquation;

public class Roots {
    private Double root1 = null;
    private Double root2 = null;

    public Roots(double x1, double x2) {
        root1 = x1;
        root2 = x2;
    }
    public Roots(double x) {
        root1 = x;
    }

    public Roots() {}

    public void printRoots() {
        if(root2 != null)
            System.out.printf("Root1 = %f\nRoot2 = %f\n", root1, root2);
        else if(root1 != null)
            System.out.printf("Root = %f multiplicity 2\n", root1);
        else
            System.out.printf("There is no decision\n");
    }
}
