/**
 * The program implements the solution of quadratic equations of the form ax^2 + bx + c = 0,
 * a != 0 (Otherwise, issue {@link IllegalArgumentException} is thrown)
 */

package QuadraticEquation;

import java.util.Objects;

public class QuadraticEquation {
    /**
     * Class of quadratic equation.
     * private fields are equation coefficients
     */
    private double a;
    private double b;
    private double c;

    class Discriminant {
        /**
         * When creating an instance of a class the constructor is called
         * in which the discriminant is calculated and stored in a private field d
         *
         *
         * The nested class allows you to save the result of calculating the discriminant for later use.
         * It would be possible to create a private field in the <code>class QuadraticEquation</code>
         * but then the logic would be broken, since it describes our equation,
         * and the discriminant is part of the solution.
         */
        private double d;
        Discriminant() {
            d = b*b - 4*a*c;
        }
    }

    public QuadraticEquation(double a, double b, double c) {
        if(Objects.equals(a, 0.))
            throw new IllegalArgumentException("It's not a quadratic equation");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Roots Solve() {
        Discriminant disc = new Discriminant();       //Calculate the discriminant
        if(disc.d > 0) {
            double x1 = (-b + Math.sqrt(disc.d)) * 0.5 / a;   //General view of the root
            double x2 = (-b - Math.sqrt(disc.d)) * 0.5 / a;
            return new Roots(x1, x2);
        }
        else if(disc.d < 0) {    //No decision
            return new Roots();
        }
        double x = -b * 0.5 / a; //Discriminant = 0 => the root is 1
        return new Roots(x);
    }

}
