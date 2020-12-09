package Parser;

import java.util.ArrayList;

public class BlockStatement extends Statement
{

	private ArrayList<Statement> statement_to_execute;
	
	public BlockStatement(ArrayList<Statement> statement_to_execute)
	{
		super("Block Statement");
		this.statement_to_execute = statement_to_execute;
	}

	public String toString()
	{
		return super.toString(); //+ "\n\t" + 
				//this.test_expression.toString() + " " + this.statement_to_execute.toString();
	}

	public ArrayList<Statement> getStatement_to_execute() {
		return statement_to_execute;
	}

	public void setStatement_to_execute(ArrayList<Statement> statement_to_execute) {
		this.statement_to_execute = statement_to_execute;
	}

	
	
}

