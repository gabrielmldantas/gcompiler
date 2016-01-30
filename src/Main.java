import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import gcompiler.lexer.Lexer;
import gcompiler.lexer.LexerException;
import gcompiler.node.EOF;
import gcompiler.node.TBlank;
import gcompiler.node.Token;

public class Main {
	public static void main(String[] args) throws LexerException, IOException {
		Lexer lexer = new Lexer(new PushbackReader(new FileReader(args[0])));
		Token token = lexer.next();
		int lastLine = token.getLine();
		System.out.print("Linha " + lastLine + ":");
		while (!(token instanceof EOF)) {
			if (token.getLine() != lastLine) {
				lastLine = token.getLine();
				System.out.println();
				System.out.print("Linha " + lastLine + ": ");
			} else {
				System.out.print(" ");
			}
			String text = token.getText();
			if (token instanceof TBlank) {
				text = "";
			}
			System.out.print(text + " <<" + token.getClass().getSimpleName() + ">>");
			token = lexer.next();
		}
	}
}
