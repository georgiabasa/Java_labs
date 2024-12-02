package algorithms;
//prepei oles oi parenteseis pou anigoun na kleinoun 
	//prepei metaksi parenteseon na iparxoun sintelestes
	//na elegxetai an o dairetis einai <>0 auto mporei na ginei mono sto runtime otan tha ginei evaluate i timi tou diareti
	//apagoreyontai sti seira 2 h perissoteroi telestes *,+,-,/,^
//an to proihoumeno ine operator to epomeno prepei na einai aritmos i parentsei
// anapodes parentheseis p.x.  )(
import java.util.Stack;

public class CompileInFixExpression {
	private  Stack<String> inFix = new Stack<>();
	public CompileInFixExpression(Stack<String> inFix) {
		this.inFix = (Stack<String>) inFix.clone();
		
	}

	public boolean parseErrors(){
		boolean res=false;
		String prev_elem="";
		for(int i=0;i<inFix.size();i++) {
			String elem=inFix.get(i);
			//System.out.println("parse errors"+elem);
			if(isOperator(elem)&& isOperator(prev_elem)) {
				System.out.println("2 subsequent operators");
				res=true;
			}
			
			if(isOperator(prev_elem) && (! (isNumeric(elem) || elem.equalsIgnoreCase("(") )) ){
				System.out.println("after an operand only operator or (  is allowed");
				//System.out.println("prev_elem"+prev_elem);
				//System.out.println("elem"+elem);
				res=true;
			}
			
			if( elem.equalsIgnoreCase(")") && prev_elem.equalsIgnoreCase("(") ){
				System.out.println("empty expression in parenthesis");
				res=true;
			}
			
			
			if(elem.equalsIgnoreCase("(") && (! (isOperator(prev_elem) || prev_elem.equalsIgnoreCase("(") ))) {
				System.out.println("before opening a ( only operator or ( is allowed");
				res=true;
				
			}
			
			prev_elem=elem;
		}
		
		if(count("(")!=count(")")) {
			System.out.println("uneven ( )");
			res=true;
			
		}
		 
		return res;
	}
	
	private int count(String v) {
		int res=0;
		for(int i=0;i<inFix.size();i++) {
			String elem=inFix.get(i);
			if( elem.equalsIgnoreCase(v)) res++;
		}
		//System.out.println("count"+v+" res="+res);
		return res;
		
	}
	
	private static boolean isNumeric(String str) {
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }
	private boolean isOperator(String elem) {
		if(elem.equalsIgnoreCase("+") ||elem.equalsIgnoreCase("-") ||elem.equalsIgnoreCase("*") || elem.equalsIgnoreCase("/") ||elem.equalsIgnoreCase("^") ) 
		{return true;}
		else return false;
		
			
		
	}
}
