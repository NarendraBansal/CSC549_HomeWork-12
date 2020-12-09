package tree;

import java.util.List;

public class StatementTree extends StatementPart
{
	private ExpressionPart expression_to_print;
	
	List <PartTree> partTrees;
	
	public List<PartTree> getPartTrees() {
		return partTrees;
	}

	public void setPartTrees(List<PartTree> partTrees) {
		this.partTrees = partTrees;
	}

	public StatementTree(ExpressionPart expression_to_print)
	{
		super("Print Statement");
		this.expression_to_print = expression_to_print;
	}

	public String toString()
	{
		return super.toString() + "\n\t" + 
				this.expression_to_print.toString();
	}

	public ExpressionPart getExpression_to_print() {
		return expression_to_print;
	}
}


