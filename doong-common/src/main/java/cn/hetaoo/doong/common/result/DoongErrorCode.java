package cn.hetaoo.doong.common.result;

/**
 * <p>错误码
 *
 * @author hetaoo
 */
public enum DoongErrorCode {
		OK(1000,"操作成功"),
		PROTOCOL_ERR(2001,"请求协议错误"),
		SYSTEM_ERR(2002, "系统错误，请稍后再试"),
	    UPDATE_ERR(2003, "数据更新失败，请稍后再试"),
	    ADD_ERR(2004, "数据插入失败，请稍后再试"),
	    PARAM_ERR(2005, "参数错误"),
	    USER_NOT_LOGIN(2006, "用户未登录"),
	    USER_NOT_EXIST(2007, "用户不存在"),
	    USER_EXIST(2008, "用户已存在"),
	    USER_FORBID(2009, "用户已被封"),
	    USER_PASSWORD_ERR(2010, "账号或密码错误"),
		PHONE_ERR(2011, "对方手机号不存在"),
	    USER_OLD_PASSWORD_ERR(2012, "旧密码错误"),
		DELETE_ERR(2013, "数据插入失败，请稍后再试"),
	    TOKEN_ERR(2014, "token校验错误"),
	    CHECK_CODE_LESS_THAN_MINUTES(2015, "请求验证码太频繁"),
	    CAN_NOT_GET_CHECK_CODE(2016, "无法获取验证码"),
	    CHECK_CODE_ERR(2017, "验证码错误"),
	    CHECK_CODE_NOT_EXIST(2018,"验证码已过期"),
		USER_INFO_NOT_COMPLETE(2022, "请完善个人信息"),
	    NO_RECORD_ERR(2023, "没有相关的记录"),
		SIGN_ERROR(2027,"签名错误"),
		NO_PERM(2028,"超出权限范围"),
		ENCRYPT_ERR(2029,"加密失败"),
		PASSWORD_VERIFY_FAIL(2030,"密码验证失败"),
		DB_EXIST_RECORD(2031,"数据库已存在该条记录"),
		UNKNOWN_ERROR(3000,"未知错误"),
		SYSTEM_EXC(3001,"系统异常"),
	;
	/**
	 * 错误码
	 */
	private int errCode;
	/**
	 * 错误信息
	 */
	private String errMsg;

	DoongErrorCode(int errCode, String errMsg) {
		this.errCode = errCode;
		this.errMsg = errMsg;
	}

	public int getErrCode() {
		return errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	/**
	 * 根据错误消息获取枚举
	 * @param errMsg
	 * @return
	 */
	public static DoongErrorCode getByErrMsg(String errMsg) {
		for (DoongErrorCode doongErrorCode : DoongErrorCode.values()) {
			if (doongErrorCode.getErrMsg().equals(errMsg)) {
				return doongErrorCode;
			}
		}
		throw new IllegalArgumentException("illegal DoongErrorCode: " + errMsg);
	}

}
