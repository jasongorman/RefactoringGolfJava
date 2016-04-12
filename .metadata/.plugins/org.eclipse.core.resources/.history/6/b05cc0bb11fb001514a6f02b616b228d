import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MathsTests {

	private final double number;

	public MathsTests(double input) {
		number = input;
	}	

	@Parameters
	public static List<Object[]> data() {
		return Arrays.asList(new Object[][] { 
				{1}, 
				{4}, 
				{9}, 
				{16}, 
				{0.25} 
			});
	}

	@Test
	public void rootSquaredIsOriginalNumber() {
		assertEquals(number, Maths.sqrroot(number) * Maths.sqrroot(number), 1e-15);
	}

}
