// Inspiration for oblig1, for oblig2 there will be an update

package compiler;

import java.io.*;
import syntaxtree.*;
import parser.*;

public class Compiler {
    private String inFilename = null;
    private String outFilename = null;
    public Compiler(String inFilename, String outFilename){  // 
	this.inFilename = inFilename;
	this.outFilename = outFilename;
    }
    public void compile() throws Exception {
		
	System.out.println("Input file = " + inFilename);
	InputStream inputStream = null;
	inputStream = new FileInputStream(this.inFilename);
	Lexer lexer = new Lexer(inputStream);
	parser parser = new parser(lexer);
	System.out.println(lexer.next_token().toString());
	/*
	Program program = (Program)parser.parse().value;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.outFilename));
        bufferedWriter.write(program.printAst());
        bufferedWriter.close();
	*/
    }
    public static void main(String[] args) {
	Compiler compiler = new Compiler(args[0], args[1]);
	try {
	    compiler.compile();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
