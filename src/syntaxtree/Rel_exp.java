package syntaxtree;

public class Rel_exp extends Exp{

	Exp left;
	
	Exp right;
	
	String sym;
	
	public Rel_exp(Exp left,String sym, Exp right) {
		this.left = left;
		this.sym = sym;
		this.right = right;
	}
}
