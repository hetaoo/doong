package cn.hetaoo.doong.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.PropertyFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * gson的工具类
 * @author hetaoo
 */
public class FastJsonUtil {
    private final static Logger log = LoggerFactory.getLogger(FastJsonUtil.class);

    private static final DefaultPrimitiveValueFilter DEFAULT_PRIMITIVE_VALUE_FILTER = new DefaultPrimitiveValueFilter();


    /**
     * @return
     */
    public static <T> T jsonToObject(String json, Class<T> clazz) {
        return JSON.parseObject(json, clazz);
    }

    public static <T> List<T> jsonToList(String json, Class<T> clazz) {
        return JSON.parseArray(json, clazz);
    }

    /**
     * @param source
     * @return
     */
    public static Map<String, String> jsonToMap(String source) {
        @SuppressWarnings("unchecked")
        Map<String, String> map = (Map<String, String>) JSON.parse(source);
        return map;

    }

    public static Map<String, Object> jsonToMapObject(String source) {
        @SuppressWarnings("unchecked")
        Map<String, Object> map = (Map<String, Object>) JSON.parse(source);
        return map;

    }

    /**
     * 将对象o转换成json格式数据
     * @param o
     * @return
     */
    public static String Object2JsonCompress(Object o){
        try {
            return JSON.toJSONString(o,DEFAULT_PRIMITIVE_VALUE_FILTER);
        } catch (Throwable e) {
            log.error("Object2JsonCompress", e);
            return null;
        }
    }

    /**
     * @param t
     * @return
     */
    public static <T> String toJson(T t) {
        return JSON.toJSON(t).toString();
    }

    private static final class DefaultPrimitiveValueFilter implements PropertyFilter {

        public boolean apply(Object source, String name, Object value) {
            if (null != value && isBaseDataType(value.getClass()) && ("0".equals(value.toString()) || "0.0".equals(value.toString()))) {
                return false;
            } else {
                return true;
            }
        }

        private boolean isBaseDataType(Class clazz) {
            return
                    (
                            clazz.equals(Integer.class) ||
                                    clazz.equals(Byte.class) ||
                                    clazz.equals(Long.class) ||
                                    clazz.equals(Double.class) ||
                                    clazz.equals(Float.class) ||
                                    clazz.equals(Short.class) ||
                                    clazz.isPrimitive()
                    );
        }
    }
}
