package syntaxtree;

import java.util.LinkedList;

public class Call_stmt extends Exp{
	
	String name;
	
	LinkedList<Exp> list;

	public Call_stmt(String name, LinkedList<Exp> list) {
		this.name = name;
		this.list = list;
	}
	
	public Call_stmt(String name) {
		this.name = name;
	}

}
