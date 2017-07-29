package com.adanac.ssm.common.domain.exception;

import com.adanac.ssm.common.domain.enums.SSMExceptionCode;

/**
 * @author Jimmy Shan
 * @date 2016-09-03
 * @desc 集成异常基类
 */
public class SSM3CheckedException extends Exception {

	private static final long serialVersionUID = 3239257809614865978L;

	private String code;

	public String getOutMsg() {
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

	public SSM3CheckedException() {
		super();
	}

	public SSM3CheckedException(Throwable e) {
		super(e);
	}

	public SSM3CheckedException(String errorCode) {
		super();
		this.code = errorCode;
	}

	public SSM3CheckedException(SSMExceptionCode mcode, Throwable e) {
		super(mcode.getDesin(), e);
		this.code = mcode.getCode();
	}

	public SSM3CheckedException(String code, Throwable e) {
		super(SSMExceptionCode.getInMsg(code), e);
		this.code = code;
	}

	public SSM3CheckedException(String code, String message) {
		super(message);
		this.code = code;
	}

	public SSM3CheckedException(SSMExceptionCode exceptionCode) {
		super(exceptionCode.getDesout());
		this.code = exceptionCode.getCode();
	}

	public SSM3CheckedException(String code, String message, Throwable e) {
		super(message, e);
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}
