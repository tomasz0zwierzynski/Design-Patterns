package strategy;

public class OperationContext {
	
	private Operation operation;
	private double arg1 = 0;
	private double arg2 = 0;
	private double value = 0;
	private boolean operationValid = false;
	
	public OperationContext(Operation op){
		operation = op;
	}
	
	public void setInput(double argument1, double argument2){
		arg1 = argument1;
		arg2 = argument2;
		operationValid = operation.isOperationValid(this);
	}
	
	public double getResult() throws Exception{
		if (operationValid){
			return value;
		}else{
			throw new ArithmeticException("Operation is not valid");
		}		
	}
	
	public double getArg1(){
		return arg1;
	}
	
	public double getArg2(){
		return arg2;
	}
	
	public void setValue(double val){
		value = val;
	}
	
	public double performOperation() throws Exception{
		if (operationValid){
			operation.operate(this);
			return value;
		}else{
			throw new ArithmeticException("Operation is not valid");
		}
	}
	
	public double performOperation(double argument1, double argument2) throws Exception{
		setInput(argument1, argument2);
		try{
			return performOperation();
		}catch(Exception ex){
			throw ex;
		}
	}
	
	@Override
	public String toString(){
		if (operationValid){
			operation.operate(this);
			return String.valueOf(arg1) + operation.getOperationSymbol() + String.valueOf(arg2) + "=" + value;
		}else{
			return "Operation " + String.valueOf(arg1) + operation.getOperationSymbol()+ String.valueOf(arg2) + " is not valid";
		}
	}
	
}
