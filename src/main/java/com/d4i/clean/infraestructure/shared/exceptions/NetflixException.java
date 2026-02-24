package com.d4i.clean.infraestructure.shared.exceptions;

import java.io.Serial;

public abstract class NetflixException extends Exception {

	@Serial
	private static final long serialVersionUID = -7482635401716007171L;

	private final int code;


	public NetflixException(int code, String message) {
		super(message);
		this.code = code;
	}

	public int getCode() {
		return this.code;
	}

}
