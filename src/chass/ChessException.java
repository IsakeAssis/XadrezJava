package chass;

import boardgame.BoardException;

public class ChessException extends BoardException {

	private static final long serialVersionUID = 1l;
	
	public ChessException(String msg) {
		super(msg);
	}
}
