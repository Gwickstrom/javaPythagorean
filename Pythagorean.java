import java.lang.System;
public class Pythagorean {
    public double calculateHypotenuse(double legA, double legB) {
        // the hypotenuse is the side across the right angle.
        // calculate the value of c given legA and legB.
        double leg1 = Math.sqrt(legB);
        double leg2 = Math.sqrt(legA);
        double squareRootLegA = leg1;
        double squareRootLegB = leg2;
        double h = squareRootLegA + squareRootLegB;
        return h;
    }
}
