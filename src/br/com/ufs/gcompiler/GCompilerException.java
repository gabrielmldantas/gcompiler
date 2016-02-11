package br.com.ufs.gcompiler;

public class GCompilerException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public GCompilerException() {
	}

	public GCompilerException(String message) {
		super(message);
	}

	public GCompilerException(String message, Throwable cause) {
		super(message, cause);
	}

	public GCompilerException(Throwable cause) {
		super(cause);
	}
}
