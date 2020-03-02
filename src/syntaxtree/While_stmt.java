package syntaxtree;

import java.util.LinkedList;

public class While_stmt extends Stmt{

		Exp a;
		
		LinkedList<Stmt> b;
		
		public While_stmt(Exp a,LinkedList<Stmt> b) {
			this.a = a;
			this.b = b;
		}
}
