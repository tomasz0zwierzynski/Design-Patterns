package strategy;

public interface Operation {
	public void operate(OperationContext context);
	public boolean isOperationValid(OperationContext context);
	public String getOperationSymbol();
	public String toString();
}
