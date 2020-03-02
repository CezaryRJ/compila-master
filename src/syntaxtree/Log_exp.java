package syntaxtree;

public class Log_exp extends Exp{
	
	Exp left;
	
	Exp right;
	
	String sym;
	
	boolean negate = false;
	
	public Log_exp(Exp left,String sym, Exp right) {
		this.left = left;
		this.sym = sym;
		this.right = right;
	}
	
	public Log_exp(String negate, Exp exp) {
		this.negate = Boolean.parseBoolean(negate);
		left = exp;
	}
}


