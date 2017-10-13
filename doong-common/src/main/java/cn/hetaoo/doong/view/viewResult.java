package cn.hetaoo.doong.view;

import java.util.HashMap;
import java.util.Map;

/**
 * web返回返回前端结果类
 * 
 * @author hetaoo
 */
public class viewResult extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	
	public viewResult() {
		put("code", 0);
	}
	
	public static viewResult error() {
		return error(500, "未知异常，请联系管理员");
	}
	
	public static viewResult error(String msg) {
		return error(500, msg);
	}
	
	public static viewResult error(int code, String msg) {
		viewResult r = new viewResult();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static viewResult ok(String msg) {
		viewResult r = new viewResult();
		r.put("msg", msg);
		return r;
	}
	
	public static viewResult ok(Map<String, Object> map) {
		viewResult r = new viewResult();
		r.putAll(map);
		return r;
	}
	
	public static viewResult ok() {
		return new viewResult();
	}

	public viewResult put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
