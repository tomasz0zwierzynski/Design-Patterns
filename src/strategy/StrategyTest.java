package strategy;

import static org.junit.Assert.*;

import org.junit.*;

import strategy.operations.*;

public class StrategyTest {

	@Test
	public void testTemp(){
		
		OperationContext oc = new OperationContext(new DivisionOperation() );
		
		try {
			oc.performOperation(1, 0.001);
			System.out.println(oc);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		fail("failed!");
	}
	
}
