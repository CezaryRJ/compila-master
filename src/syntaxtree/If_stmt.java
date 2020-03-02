package syntaxtree;

import java.util.LinkedList;

public class If_stmt extends Stmt{
	
	Exp a;
	
	LinkedList<Stmt> b;
	LinkedList<Stmt> c;
	
	public If_stmt(Exp a,LinkedList<Stmt> b,LinkedList<Stmt> c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	

}
