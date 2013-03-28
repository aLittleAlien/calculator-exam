package calculator;

import static org.junit.Assert.assertEquals;

import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ParametrizedTest {

	private double expected;
	private double valueOne;

	@Parameters
	public static List<String[]> getTestParameters() {
		return Arrays.asList(new String[][] { { "3", "3x^2" },
				{ "14", "14x^2" }, });
	}

	public ParametrizedTest(double expected, double valueOne) {
		this.expected = expected;
		this.valueOne = valueOne;
	}

	@Test
	public void sum() {
		Calculator c = new Calculator();
		//assertEquals(expected, c.quadraticEquationX(valueOne), 0);
	}

}
