package cn.hetaoo.doong.common.ex;

import cn.hetaoo.doong.common.result.DoongErrorCode;

/**
 * 自定义异常
 * Created by hetaoo on 2017/6/6.
 */
public class DoongException extends RuntimeException {

    private static final long serialVersionUID = -2299556937834778577L;

    private DoongErrorCode doongErrorCode;
    private String message;
    private Object result;

    public DoongException(String message) {
        super(message);
        this.message = message;

    }
    public DoongException(Throwable message) {
        super(message);
    }

    public DoongException(DoongErrorCode doongErrorCode) {
        super(doongErrorCode.getErrMsg());
        this.message = doongErrorCode.getErrMsg();
        this.doongErrorCode = doongErrorCode;
    }

    public DoongException(String message, Throwable e) {
        super(message,e);
        this.message = message;
    }

    public DoongException(DoongErrorCode doongErrorCode, Object result) {
        super(doongErrorCode.getErrMsg());
        this.message = doongErrorCode.getErrMsg();
        this.doongErrorCode = doongErrorCode;
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public DoongErrorCode getDoongErrorCode() {
        return doongErrorCode;
    }

    public void setDoongErrorCode(DoongErrorCode doongErrorCode) {
        this.doongErrorCode = doongErrorCode;
    }
}
