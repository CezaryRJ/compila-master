package syntaxtree;

import java.util.LinkedList;

public class Proc_decl extends Decl{
	
	LinkedList<Param> params;
	LinkedList<Decl> decls;
	
	String name;
	Type type;
	
	public Proc_decl(String name, LinkedList<Param> params, Type type, LinkedList<Decl> decls) {
		this.name = name;
		this.params = params;
		this.type = type;
		this.decls = decls;
		
	}
	
	public Proc_decl(String name, LinkedList<Param> params, LinkedList<Decl> decls) {
		this.name = name;
		this.params = params;
		this.decls = decls;
		
	}

}
