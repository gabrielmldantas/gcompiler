package br.com.ufs.gcompiler;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.Writer;
import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.ufs.gcompiler.extensions.lexer.GCompilerLexer;
import br.com.ufs.gcompiler.lexer.LexerException;
import br.com.ufs.gcompiler.node.EOF;
import br.com.ufs.gcompiler.node.InvalidToken;
import br.com.ufs.gcompiler.node.TBlank;
import br.com.ufs.gcompiler.node.Token;
import br.com.ufs.gcompiler.parser.Parser;
import br.com.ufs.gcompiler.parser.ParserException;

public class GCompiler {
	private static final int PUSHBACK_BUFFER_LENGTH = 1024;
	
	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			System.err.println("Usage: java br.com.ufs.gcompiler.GCompiler <file>");
			System.exit(-1);
		}
		
		PushbackReader reader = new PushbackReader(new FileReader(args[0]), PUSHBACK_BUFFER_LENGTH);
//		String outputFileName = args[0] + "_tokens.txt";
//		FileWriter writer = new FileWriter(outputFileName);
		try {
			GCompilerLexer lexer = new GCompilerLexer(reader);
			parse(lexer);
			System.out.println("Valid syntax!");
//			printTokens(lexer, writer);
//			System.out.println("\n\nSaída gravada no arquivo " + outputFileName);
		} catch (GCompilerLexerException e) {
			String template = "[Line {0}, Pos {1}]: {2}";
			InvalidToken invalidToken = e.getInvalidToken();
			System.err.println(MessageFormat.format(template, invalidToken.getLine(), invalidToken.getPos(), e.getMessage()));
			System.err.println(invalidToken.getText());
		} catch (GCompilerException e) {
			e.printStackTrace();
        } catch (ParserException e) {
        	System.err.println("Invalid syntax!");
			String template = "[Line {0}, Pos {1}]: Found {2}, expecting {3}";
			Pattern pattern = Pattern.compile("\\[.*?\\] expecting: ");
			Matcher matcher = pattern.matcher(e.getMessage());
			String errorMessage = matcher.replaceAll("");
			Token token = e.getToken();
            System.err.println(MessageFormat.format(template, token.getLine(), token.getPos(), token.getText(), errorMessage));
		} finally {
			reader.close();
//			writer.close();
		}
	}
	
	private static void printTokens(GCompilerLexer lexer, Writer writer) throws IOException {
		try {
			Token token = lexer.next();
			Token lastToken = null;
			while (!(token instanceof EOF)) {
				String text;
				if (token instanceof TBlank) {
					text = token.getText();
				} else {
					text = extractTokenName(token.getClass().getSimpleName());
				}
				if (lastToken != null && !(token instanceof TBlank) && !(lastToken instanceof TBlank)) {
					text = " " + text;
				}
				System.out.print(text);
				writer.write(text);
				lastToken = token;
				token = lexer.next();
			}
		} catch (LexerException e) {
			throw new GCompilerLexerException(e.getToken(), "Unknown token");
		}
	}
	
	private static String extractTokenName(String tokenClassName) {
		StringBuilder sb = new StringBuilder(tokenClassName);
		if (sb.charAt(0) == 'T') {
			sb.delete(0, 1);
		}
		sb.replace(0, 1, sb.substring(0, 1).toLowerCase());
		for (int i = 1; i < sb.length(); i++) {
			if (Character.isUpperCase(sb.charAt(i))) {
				String replacement = "_" + Character.toLowerCase(sb.charAt(i));
				sb.replace(i, i+1, replacement);
			}
		}
		return sb.toString();
	}
	
	private static void parse(GCompilerLexer lexer) throws ParserException {
		Parser parser = new Parser(lexer);
		try {
			parser.parse();
		} catch (LexerException e) {
			throw new GCompilerLexerException(e.getToken(), "Unknown token");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
