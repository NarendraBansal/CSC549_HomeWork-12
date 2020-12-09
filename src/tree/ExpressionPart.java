package tree;

public abstract class ExpressionPart extends PartTree
{
	protected String expressionType;
	
	public ExpressionPart(String expressionType)
	{
		this.expressionType = expressionType;
	}
	
	public ExpressionPart() {
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
		return "Expression: " + this.expressionType;
	}

	public String getExpressionType() {
		return expressionType;
	}
	
	
}
