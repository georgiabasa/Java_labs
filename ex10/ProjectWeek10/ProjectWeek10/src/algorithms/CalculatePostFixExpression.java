package algorithms;

import java.math.BigDecimal;
import java.util.Stack;

public class CalculatePostFixExpression {
	private  Stack<String> postFix = new Stack<>();
	private double result;
	public CalculatePostFixExpression(Stack<String> postFix) {
		
		this.postFix = (Stack<String>) postFix.clone();
		calculate() ;
	}
	
	
	private boolean isNumeric(String str) {
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }
	
	
	
	
	private void calculate() {
		
		
		 Stack<Double> st = new Stack<>();
		 postFix.forEach(elem -> { 
			 switch(elem) {
				 case "+": {st.push(st.pop() + st.pop());break;}
				 case "-": {Double d1 = st.pop(); st.push(st.pop() - d1); break;}
				 case "*": {st.push(st.pop() * st.pop()); break;}
				 case "/": {Double d1 = st.pop(); if(Double.valueOf(d1)!=0)st.push(st.pop() / d1); 
				            else System.out.println("Throw Excpetion");break;}
				 case "^": {Double x = st.pop(); st.push(Math.pow(st.pop(),x)); break;}
				 default: {
					 if(isNumeric(elem))
					 st.push(Double.parseDouble(elem));
				  }
			 }
			
	       });
		
		result=st.pop();
		System.out.println(result);
		result = (double)Math.round(result * 1000) / 1000;			
	}
	
	public double getResult() {return result;}
	
}
