package syntaxtree;

public class Var_exp extends Exp{
	Exp inn;
	
	String name;
	
	public Var_exp(Exp inn) {
		this.inn = inn;
	}
	
	public Var_exp(Exp inn,String name) {
		this.inn = inn;
		this.name = name;
	}
	
	public Var_exp(String inn) {
		this.name = inn;
	}

}
