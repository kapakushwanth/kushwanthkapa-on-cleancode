package intrestTest;


import org.junit.Assert;
import org.junit.Test;
import calculator.SimpleInterest;
public class SimpleIntrestTest {
	SimpleInterest simpleIntrestObj=new SimpleInterest();
	@Test
	public void test() {
		Assert.assertEquals(360, simpleIntrestObj.simpleIntrest(2000.0, 3.0, 6.0),0);
	}

}
