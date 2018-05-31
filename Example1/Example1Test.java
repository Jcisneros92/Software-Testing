package softwareTest;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class Example1Test {

	Example1 warn;
	
	@Before
	public void setUp() throws Exception {
		warn = new Example1();
	}

	@SuppressWarnings("unused")
	private static final Object[] parametersProblem1ClassTest () {
		return $(
//					Parameters are: (1,2,3,4,5,6)
//							1=distance, 2=redLight, 3=yellowLight, 4=greenLight,5=buzzer, 6=brakes
//				Test case 1
				$(	200.0,	false,	false,	true,	false,	false),
//				Test case 2
				$(	 75.1,	false,	true,	false,	false,	false),
//				Test case 3
				$(	 25.0,	true,	true,	false,	false,	false),
//				Test case 4
				$(	 24.9,	true,	true,	false,	true,	true),
//				Test case 5
				$(	300.0,	false,	false,	true,	false,	false),
//				Test case 6 
				$(	199.9,	false,	true,	false,	false,	false),
//				Test case 7 
				$(	 75.0,	true,	true,	false,	false,	false),
//				Test case 8 
				$(	 -0.1,	true,	true,	false,	true,	true)
		);
	}

	@Test
	@Parameters(method="parametersProblem1ClassTest")
	public void test(double distance,boolean red,boolean yellow,boolean green,boolean buzzer,boolean brakes) {
		warn.setRedLight(!red); warn.setYellowLight(!yellow); warn.setGreenLight(!green); warn.setBuzzer(!buzzer); warn.setBrakes(!brakes);
		warn.setWarnings(distance);
		assertEquals(red,warn.isRedLight());
		assertEquals(yellow,warn.isYellowLight());
		assertEquals(green,warn.isGreenLight());
		assertEquals(buzzer,warn.isBuzzer());
		assertEquals(brakes,warn.isBrakes());
	}
}