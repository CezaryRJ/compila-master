package syntaxtree;

public class Assign_stmt extends Stmt{
	Exp a;
	
	Exp b;
	
	public Assign_stmt(Exp a, Exp b){
		this.a = a;
		this.b = b;
		
	}
}
