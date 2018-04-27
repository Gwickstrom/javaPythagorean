public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean py = new Pythagorean();
        double hypotenuse = py.calculateHypotenuse(9.0,100.0);
        String hypotenuse2 = String.valueOf(hypotenuse);
        System.out.println(hypotenuse);
    }
}
