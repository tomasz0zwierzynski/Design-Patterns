package strategy.operations;

import strategy.Operation;
import strategy.OperationContext;

public class ExponentiationOperation implements Operation{

	@Override
	public void operate(OperationContext context) {
		context.setValue( Math.pow(context.getArg1(),context.getArg2()) );	
	}

	@Override
	public boolean isOperationValid(OperationContext context) {
		if ( (context.getArg1() == 0) && (context.getArg2() == 0) ){
			return false;
		}		
		return true;
	}

	@Override
	public String getOperationSymbol() {

		return "^";
	}
	
}
