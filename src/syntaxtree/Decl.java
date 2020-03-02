package syntaxtree;
public class Decl implements AST{
	
	public String printAst(){
		System.out.println(this.getClass().getName());
		return "decl";
	}

}
