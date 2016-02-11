package br.com.ufs.gcompiler;

import br.com.ufs.gcompiler.node.InvalidToken;

public class GCompilerLexerException extends GCompilerException {
	private static final long serialVersionUID = 1L;

	private InvalidToken invalidToken;
	
	public GCompilerLexerException(InvalidToken invalidToken, String message) {
		super(message);
		this.invalidToken = invalidToken;
	}

	public InvalidToken getInvalidToken() {
		return invalidToken;
	}
}
