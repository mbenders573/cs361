public class ParserDemo {

	public static void main(String[] args) {

		// TO COMPLETE
		// Change the path!
		TokenStream tStream = new TokenStream("C:\\Users\\bende\\OneDrive\\Desktop\\cs361\\cs361\\TokenReader\\prog1.kay");

		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.println(p.display());

	}

}