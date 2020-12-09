package tree;

import java.util.List;

public class ExpressionTree extends ExpressionPart 
{
	private ExpressionPart left;
	private ExpressionPart right;
	private String op;
	
	List <ExpressionPart> expressionParts;
	
	
	
	public List<ExpressionPart> getExpressionParts() {
		return expressionParts;
	}

	public void setExpressionParts(List<ExpressionPart> expressionParts) {
		this.expressionParts = expressionParts;
	}

	public ExpressionTree(ExpressionPart left, String op, ExpressionPart right)
	{
		super("Test Expression");
		this.left = left;
		this.right = right;
		this.op = op;
	}
	
	public String toString()
	{
		return super.toString() + "\n\t" + this.left.toString() + " "
				+ this.op + " " + this.right.toString();
	}

	public ExpressionPart getLeft() {
		return left;
	}

	public ExpressionPart getRight() {
		return right;
	}

	public String getOp() {
		return op;
	}

	
	
}
