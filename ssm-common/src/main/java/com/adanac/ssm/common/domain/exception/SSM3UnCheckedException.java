package com.adanac.ssm.common.domain.exception;

import com.adanac.ssm.common.domain.enums.SSMExceptionCode;

/**
 * @author maoewi
 * @date 2016-12-03
 * @desc 集成运行时异常
 */
public class SSM3UnCheckedException extends RuntimeException {

	private static final long serialVersionUID = 7471328974250045016L;

	private String code;

	public String getOutMsg() {
		if (code.equals("00")) {
			return getMessage();
		}
		SSMExceptionCode mcode = SSMExceptionCode.getByCode(code);
		if (mcode != null) {
			return mcode.getDesout();
		}
		return getMessage();
	}

	public String getInMsg() {
		SSMExceptionCode mcode = SSMExceptionCode.getByCode(code);
		if (mcode != null) {
			return mcode.getDesin();
		}
		return getMessage();
	}

	public SSM3UnCheckedException() {
		super();
	}

	public SSM3UnCheckedException(Throwable e) {
		super(e);
	}

	public SSM3UnCheckedException(String errorCode) {
		super();
		this.code = errorCode;
	}

	public SSM3UnCheckedException(SSMExceptionCode mcode, Throwable e) {
		super(mcode.getDesin(), e);
		this.code = mcode.getCode();
	}

	public SSM3UnCheckedException(String code, Throwable e) {
		super(SSMExceptionCode.getInMsg(code), e);
		this.code = code;
	}

	public SSM3UnCheckedException(String code, String message) {
		super(message);
		this.code = code;
	}

	public SSM3UnCheckedException(String code, String message, Throwable e) {
		super(message, e);
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}
