package syntaxtree;

public class Arith_exp extends Exp{
	Exp left;
	
	Exp right;
	
	String sym;
	
	public Arith_exp(Exp left,String sym, Exp right) {
		this.left = left;
		this.sym = sym;
		this.right = right;
	}
}
