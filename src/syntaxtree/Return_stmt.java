package syntaxtree;

public class Return_stmt extends Stmt{
	
	Exp a;
	
	public Return_stmt(Exp a) {
		this.a = a;
	}
	
	public Return_stmt() {
		this.a = null;
	}

}
