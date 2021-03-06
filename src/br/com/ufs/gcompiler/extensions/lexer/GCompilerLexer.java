package br.com.ufs.gcompiler.extensions.lexer;

import java.io.IOException;
import java.io.PushbackReader;

import br.com.ufs.gcompiler.GCompilerLexerException;
import br.com.ufs.gcompiler.lexer.Lexer;
import br.com.ufs.gcompiler.lexer.LexerException;
import br.com.ufs.gcompiler.node.EOF;
import br.com.ufs.gcompiler.node.InvalidToken;
import br.com.ufs.gcompiler.node.TBlkComment;
import br.com.ufs.gcompiler.node.TBlkCommentEnd;

public class GCompilerLexer extends Lexer {
	
	private int count;
	private StringBuffer text;
	private TBlkComment blkComment;
	
	public GCompilerLexer(PushbackReader in) {
		super(in);
	}
	
	@Override
	protected void filter() throws LexerException, IOException {
		if (state.equals(State.COMMENT)) {
			if (blkComment == null) {
				blkComment = (TBlkComment) token;
				text = new StringBuffer(blkComment.getText());
				count = 1;
				token = null;
			} else if (token instanceof EOF) {
				throw new GCompilerLexerException(new InvalidToken(text.toString(), blkComment.getLine(), blkComment.getPos()), "Unbalanced block comment");
			} else {
				text.append(token.getText());
				if (token instanceof TBlkComment) {
					count++;
				} else if (token instanceof TBlkCommentEnd) {
					count--;
				} 
				if (count != 0) {
					token = null;
				} else {
					blkComment.setText(text.toString());
					token = blkComment;
					state = State.NORMAL;
					blkComment = null;
				}
			}
		} else if (state.equals(State.NORMAL)) {
			if (token instanceof TBlkCommentEnd) {
				throw new GCompilerLexerException(new InvalidToken(token.getText(), token.getLine(), token.getPos()), "Invalid block comment end");
			}
		}
	}
}
