
public class Maths {

	private static final double ERROR_TOLERANCE = 1e-15;

	public static double sqrroot(double number) {
        double guess = number;
        while (Math.abs(guess - number/guess) > ERROR_TOLERANCE*guess) {
            guess = (number/guess + guess) / 2.0;
        }
        return guess;
	}

}
