package calculator;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator c = new Calculator();
		int r = c.divideInt("-456", "-76");
		assertEquals(6, r, 0);

	}

	@Test
	public void testDivide() {
		Calculator c = new Calculator();
		int r = c.divideInt("456", "-76");
		assertEquals(-6, r, 0);
	}

	@Test
	public void testDivideS() {
		Calculator c = new Calculator();
		String s = c.divideS("500", "76");
		assertEquals("6(44)", s);
	}

	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		int r = c.add("456", "0");
		assertEquals(456, r, 0);
	}

	@Test
	public void testMult() {
		Calculator c = new Calculator();
		int r = c.mult("456", "1");
		assertEquals(456, r, 0);
	}

	@Test(expected = DivideByZeroException.class)
	public void testDivideByZero() {
		Calculator c = new Calculator();
		c.divide("4", "0");

	}

	@Test
	public void testDivideWithPrecision() {
		Calculator c = new Calculator();
		assertEquals("59.461538461", c.divide("773", "13", 9));
	}

	@Test
	public void testTwoNeg() {
		Calculator c = new Calculator();
		assertEquals(2, c.twoNeg("-10", "-5"));
	}

	@Test
	public void testAPosBNeg() {
		Calculator c = new Calculator();
		assertEquals(1, c.aPositiveBNegative("10", "-5"));
	}

	@Test
	public void testBPosANeg() {
		Calculator c = new Calculator();
		assertEquals(1, c.bPositiveANegative("-10", "5"));
	}

	@Test
	public void testTwoPositive() {
		Calculator c = new Calculator();
		assertEquals(2, c.twoPositive("100", "5"));
	}

	@org.junit.Test
	public void testSub() {
		Calculator calculator = new Calculator();
		double result = calculator.sub("10", "4");
		assertEquals(6, result, 0);

	}

	@Test
	public void testEncodeToString() {
		Calculator test = new Calculator();
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(5);
		assertEquals("2.5", test.encodeToString(list));

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(59);
		list2.add(4);
		list2.add(6);
		list2.add(1);
		list2.add(5);
		list2.add(4);
		assertEquals("59.46154", test.encodeToString(list2));
	}

	@Test
	public void testCountSubstractionIrrational() {
		Calculator c = new Calculator();
		List<Integer> expected = Arrays.asList(59, 4, 6, 1, 5, 3);
		assertEquals(expected, c.countSubstraction(773, 13, 5));
	}

	@Test
	public void testSquareRoot() {
		Calculator c = new Calculator();
		assertEquals("3.0", c.squareRoot("9.0"));
	}

	@Test
	public void testSqrt() {
		Calculator c = new Calculator();
		assertEquals("5.0", c.squareRoot("25.0"));
	}

	@Test
	public void testSqr() {
		Calculator c = new Calculator();
		assertEquals(1024.0, c.square(2.0, 10.0), 0);
	}

	@Test(expected = DoubleZeroException.class)
	public void testSqr1() {
		Calculator c = new Calculator();
		c.square(0.0, 0.0);
	}
	
	
	//Dio na popravnom kolokvijumu

	@Test
	public void testQuadraticEquationX() {
		Calculator c = new Calculator();
		ArrayList<String> x = new ArrayList<String>();
//		x.add("2x");
//		x.add("5x");
		x.add("2");
		x.add("5");
		assertEquals(x, c.quadraticEquationX("4x^2 - 2x + 5x = 0"));
	}
	
	@Test
	public void testConvertedX() {
		Calculator c = new Calculator();
		ArrayList<Double> x = new ArrayList<Double>();
		x.add(2.0);
		x.add(5.0);
		assertEquals(x, c.conversion("4x^2 - 2x + 5x = 0"));
	}
	
	@Test
	public void testQuadraticEquationX2() {
		Calculator c = new Calculator();
		ArrayList<String> x = new ArrayList<String>();
//		x.add("4x^2");
//		x.add("2x^2");
		x.add("4");
		x.add("2");
		assertEquals(x, c.quadraticEquationX2("4x^2 -2x +5x +2x^2 = 0"));
	}

	@Test
	public void testSplit() {
		Calculator c = new Calculator();
		String[] parts = { "4x^2", "-2x", "=", "0" };
		assertArrayEquals(parts, c.splitEquation("4x^2 -2x = 0"));
	}
	
	@Test(expected=IllegalXValueException.class)
	public void testSplitWithException() {
		Calculator c = new Calculator();
        c.splitEquation("4x^3 - 2x = 0");
	}

}
