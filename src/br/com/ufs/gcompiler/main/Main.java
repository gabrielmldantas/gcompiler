package br.com.ufs.gcompiler.main;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

import br.com.ufs.gcompiler.lexer.Lexer;
import br.com.ufs.gcompiler.lexer.LexerException;
import br.com.ufs.gcompiler.node.EOF;
import br.com.ufs.gcompiler.node.TBlank;
import br.com.ufs.gcompiler.node.Token;

public class Main {
	public static void main(String[] args) throws LexerException, IOException {
		Lexer lexer = new Lexer(new PushbackReader(new FileReader(args[0]), 1024));
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
			System.out.print(text.trim() + " <<" + token.getClass().getSimpleName() + ">>");
			token = lexer.next();
		}
	}
}
