package syntaxtree;
public class Exp implements AST{
	
	String name;
	
	Exp left;
	
	Exp right;
	
	
	public String printAst() {
		return "Exp";
	}
}
