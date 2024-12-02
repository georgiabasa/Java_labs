package algorithms;

import java.util.Stack;




public class InfixToPostFix {
	
	private String infixExpression;
	private  Stack<String> inFix = new Stack<>();
	private  Stack<String> postFix = new Stack<>();
	
	public InfixToPostFix(String InfixToPostFix){		
		this.infixExpression=new String(InfixToPostFix);
		createInFixExpression();
		convertToPostfix();
	}
	
	
	private int precedence(String op)  
	{
	 if(op.equalsIgnoreCase("+") ||op.equalsIgnoreCase("-")) return 1;
	 else if(op.equalsIgnoreCase("*") ||op.equalsIgnoreCase("/")) return 2;                      
	 else if(op.equalsIgnoreCase("^")) return 3;
	 return 0;
	}
	
	private void convertToPostfix() {
		 Stack<String> operators = new Stack<>();
		 inFix.forEach(elem -> { 
			 if(elem.equalsIgnoreCase("("))
				   operators.push(elem);
			 else if(elem.equalsIgnoreCase(")")) {
				 while(!operators.peek().equalsIgnoreCase("("))
				   {
					 postFix.push(operators.pop());
				   }
				 operators.pop();     // pop '(' from stack.
			 }
			 else if(elem.equalsIgnoreCase("+") ||elem.equalsIgnoreCase("-") ||elem.equalsIgnoreCase("*") || elem.equalsIgnoreCase("/") ||elem.equalsIgnoreCase("^")) {
				
				 while(operators.size()>0  && precedence(elem) <= precedence(operators.peek()))
				   {
					 postFix.push(operators.pop());
				   }
				 operators.push(elem);
			 }else  postFix.push(elem); //operand
	       });
		 
		 while(operators.size()>0)  postFix.push(operators.pop());		 
	}
	
	
	private void createInFixExpression() {
		String operand="";
		for(int i=0;i<infixExpression.length();i++)
		 {
		    char ch=infixExpression.charAt(i);         // current character.
		    System.out.println(ch);
		    if(Character.isDigit(ch) || ch=='.')operand=operand+ch; //re-generate the number
		    else {
		    	if(operand!="")inFix.push(operand); //push previous operand
		    	inFix.push(Character.toString(ch));
		    	operand="";
		        
		    }
		    
		   }
		inFix.push(operand); //push final operand
		
	}
	
	
	
	public void print_infix() {
		 System.out.println("infix:"+inFix);
	}
	public void print_postfix() {
		 System.out.println("postfix:"+postFix);
	}
}
