package Parser;

import java.util.ArrayList;

public class WhileStatement extends Statement
{
	private Expression test_expression;
	private Statement statement_to_execute;
	
	private ArrayList<Statement> multiStatements;
	
	
	
	public WhileStatement( Expression test_expression, ArrayList<Statement> multiStatements) {
		super("While Statement block");
		this.test_expression = test_expression;
		this.multiStatements = multiStatements;
	}

	public WhileStatement(Expression test_expression, Statement statement_to_execute)
	{
		super("While Statement");
		this.test_expression = test_expression;
		this.statement_to_execute = statement_to_execute;
	}

	public String toString()
	{
		return super.toString() + "\n\t" + 
				this.test_expression.toString() + " " + this.statement_to_execute.toString();
	}

	public Expression getTest_expression() {
		return test_expression;
	}

	public Statement getStatement_to_execute() {
		return statement_to_execute;
	}

	public ArrayList<Statement> getMultiStatements() {
		return multiStatements;
	}

	public void setMultiStatements(ArrayList<Statement> multiStatements) {
		this.multiStatements = multiStatements;
	}
	
	
}

