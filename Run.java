package QuadraticEquation;

import java.util.Objects;

public class Run {
    public static void main(String[] args) {
        QuadraticEquation example1 = new QuadraticEquation(1, 2, 1);
        QuadraticEquation example3 = new QuadraticEquation(1, -5, 6);
        QuadraticEquation example4 = new QuadraticEquation(1, 1, 1);

        example1.Solve().printRoots();
        example3.Solve().printRoots();
        example4.Solve().printRoots();

        Integer x = 30;
        System.out.println(" " + x);
        Object c = "1";
        c.equals("1");
       // QuadraticEquation example2 = new QuadraticEquation(0, 2, 1);
      //  example2.Solve().printRoots();
    }
}
