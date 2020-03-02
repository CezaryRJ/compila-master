package syntaxtree;
public class Var_decl extends Decl{
	
	
	String name;
	Type type;
	Exp exp;
	
	public Var_decl(String name, Type type, Exp exp) {
		this.name = name;
		this.type = type;
		this.exp = exp;
		
	}
	
	public Var_decl(String name, Type type) {
		this.name = name;
		this.type = type;
		
	}
	
	public Var_decl(String name, Exp exp) {
		this.name = name;
		this.exp = exp;
		
	}

}
