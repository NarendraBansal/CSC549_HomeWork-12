package tree;

public abstract class StatementPart extends PartTree
{
	protected String statementType;
	
	public StatementPart(String statementType)
	{
		this.statementType = statementType;
	}
	
	public String toString()
	{
		return "Statement: " + this.statementType;
	}
}
