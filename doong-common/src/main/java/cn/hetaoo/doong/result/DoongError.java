package cn.hetaoo.doong.result;

import java.io.Serializable;

/**
 * <p>错误对象，包含错误码({@code errCode})和错误信息({@code errMsg})
 *
 * @author hetaoo
 */
public class DoongError implements Serializable {

    private static final long serialVersionUID = -4687089803469657523L;

    /**
     * 错误码
     */
    private int errCode;
    /**
     * 错误信息
     */
    private String errMsg;

    public DoongError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }
}
