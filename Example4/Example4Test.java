package softwareTest;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class Example4Test {

	Example4 ship;
	
	@Before
	public void setUp() throws Exception {
		ship = new Example4();
	}

	@SuppressWarnings("unused")
	private static final Object[] parametersProblem4ClassTest () {
		return $(
//					Parameters are: (1,2,3,4,5)
//							1=total, 2=shippingCost, 3=numItems, 4=yearsCust,5=a (exp_out)
//				Test case 1
				$(	50_000.01,	49.99,	9,	11,	true),
//				Test case 2
				$(  50_000.00,	49.99,	9,	11,	false),
//				Test case 3
				$(  50_000.01,	50.00,	9,	11,	false),
//				Test case 4
				$(  50_000.01,	49.99,	8,	11,	false),
//				Test case 5
				$(  50_000.01,	49.99,	9,	10,	false),
//				Test case 6 
				$(       0.00,	49.99,	9,	10,	false),
//				Test case 7 
				$( 100_000.00,	49.99,	9,	11,	true),
//				Test case 8 
				$(  50_000.01,	 0.00,	9,	11,	true),
//				Test case 9 
				$(  50_000.01, 100.00,	9,	11,	false),
//				Test case 10 
				$(  50_000.01,	49.99,	0,	11,	false),
//				Test case 11 
				$(  50_000.01,	49.99, 20,	11,	true),
//				Test case 12 
				$(  50_000.01,	49.99,	9,	 0,	false),
//				Test case 13 
				$(  50_000.01,  49.99,	9,	50,	true)
		);
	}

	@Test
	@Parameters(method="parametersProblem4ClassTest")
	public void test(double total, double shippingCost, int numItems, int yearsCust, boolean a) {
	assertEquals(a,ship.isPrimeShipper(numItems, yearsCust, total, shippingCost));
	}

}
