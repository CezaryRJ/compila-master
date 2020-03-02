package syntaxtree;

import java.util.LinkedList;

public class Struct implements AST {

	
	String name;
	LinkedList<Param> param;
	
	@Override
	public String printAst() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public Struct(String name, LinkedList<Param> param) {
		this.name = name;
		this.param = param;
		
	}

}
