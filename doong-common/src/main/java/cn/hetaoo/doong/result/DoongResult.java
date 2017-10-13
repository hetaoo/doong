package cn.hetaoo.doong.result;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * <p>service层的返回结果对象
 *
 * @author hetaoo
 */
public class DoongResult<T> implements Serializable{

    private static final long serialVersionUID = 8784944629637226852L;
    /**
     * 服务是否成功，如果成功则为true，否则则为false
     */
    private boolean success = true;
    /**
     * 如果success为false，则包含错误提示信息， 否则为null
     */
    private List<DoongError> errors;

    /**
     * 错误key的set， 防止错误重复
     */
    private Set<Integer> keySet;

    /**
     * 调用service后返回的结果
     */
    private T object;
    
    private boolean needRegister = false;

    /**
     * 创建result对象
     *
     * @param <T>
     * @return
     */
    public static <T> DoongResult<T> newResult() {
        return new DoongResult<T>();
    }

    /**
     * 创建错误result对象
     *
     * @param <T>
     * @return
     */
    public static <T> DoongResult<T> newErrorResult(DoongErrorCode errorCode, T obj) {
        DoongResult<T> result = new DoongResult<T>();
        result.setSuccess(false);
        result.setObject(obj);
        result.addError(errorCode);
        return result;
    }

    /**
     * 创建错误result对象
     *
     * @param <T>
     * @return
     */
    public static <T> DoongResult<T> newErrorResult(DoongErrorCode errorCode) {
        DoongResult<T> result = new DoongResult<T>();
        result.setSuccess(false);
        result.addError(errorCode);
        return result;
    }

    /**
     * 返回出错信息
     *
     * @return
     */
    public String getErrMsg() {
        if (success) {
            throw new UnsupportedOperationException("Result is success");
        }

        List<String> tmpList = Lists.newArrayList();

        for (DoongError error : errors) {
            tmpList.add(error.getErrMsg());
        }
        Joiner joiner = Joiner.on(";").skipNulls();
        return joiner.join(tmpList);
    }

    /**
     * 新增一个错误
     *
     * @param code 错误编码
     * @param msg  错误信息
     */
    public void addError(int code, String msg) {
        if (keySet == null) {//此时表明无错误
            this.setSuccess(false);
            keySet = Sets.newHashSet();
            errors = Lists.newArrayList();
        }

        if (!keySet.contains(code)) {
            keySet.add(code);
            errors.add(new DoongError(code, msg));
        }
    }

    /**
     * 新增一个错误
     *
     * @param errorCode
     */
    public void addError(DoongErrorCode errorCode) {
        if (keySet == null) {//此时表明无错误
            this.setSuccess(false);
            keySet = Sets.newHashSet();
            errors = Lists.newArrayList();
        }

        if (!keySet.contains(errorCode.getErrCode())) {
            keySet.add(errorCode.getErrCode());
            errors.add(new DoongError(errorCode.getErrCode(), errorCode.getErrMsg()));
        }
    }

    /**
     * 增加errors
     *
     * @param errors
     */
    public void addErrors(List<DoongError> errors) {
        for (DoongError error : errors) {
            this.addError(error.getErrCode(), error.getErrMsg());
        }
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<DoongError> getErrors() {
        return errors;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

	public boolean isNeedRegister() {
		return needRegister;
	}

	public void setNeedRegister(boolean needRegister) {
		this.needRegister = needRegister;
	}
}
