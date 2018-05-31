package softwareTest;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class Example3Test {

	private Example3 aBC;
	
	@Before
	public void setUp() throws Exception {
		aBC = new Example3();
	}

	@SuppressWarnings("unused")
	private static final Object[] parametersProblem3ClassTest () {
		return $(
//					Parameters are: (1,2)
//							1=number of shares, 2=portfolio_amount
//				Test case 1
				$(	 50,	  7_009.50),
//				Test case 2
				$(	299,	 42_375.11),
//				Test case 3
				$(	 750,	107_100.00),
//				Test case 4
				$(	 999,	143_356.50),
//				Test case 5
				$( 2_000,	287_700.00),
//				Test case 6 
				$( 2_001,	289_944.90),
//				Test case 7 
				$(10_000, 1_449_000.00),
//				Test case 8 
				$( 1_000,	143_850.00),
//				Test case 9 
				$(   751,	107_768.50),
//				Test case 10 
				$(   300,	 42_840.00),
//				Test case 11 
				$( 	  51,	  7_186.39),
//				Test case 12 
				$( 	   0,		-50.00)
		);
	}

	@Test
	@Parameters(method="parametersProblem3ClassTest")
	public void test(int number_of_shares, double portfolio_amount) {
	aBC.calculate_balance(number_of_shares, 140.00);
	assertEquals(portfolio_amount,aBC.getPortfolio_amount(),0.01);
	}

}
