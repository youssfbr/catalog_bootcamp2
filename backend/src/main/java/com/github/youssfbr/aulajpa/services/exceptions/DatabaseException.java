package com.github.youssfbr.aulajpa.services.exceptions;

public class DatabaseException extends RuntimeException {	
	private static final long serialVersionUID = 1L;

	public DatabaseException(final String message) {
		super(message);
	}
}
