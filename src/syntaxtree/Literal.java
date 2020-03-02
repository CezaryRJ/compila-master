package syntaxtree;

public class Literal extends Exp{

	Boolean bool;
	
	String str;
	
	Integer num;
	
	Double dob;
	
	public Literal(Boolean bool) {
		this.bool = bool;
	}
	
	public Literal(String str) {
		this.str = str;
	}
	
	public Literal(Integer num) {
		this.num = num;
	}

	public Literal(Double dob) {
		this.dob = dob;
	}
}
