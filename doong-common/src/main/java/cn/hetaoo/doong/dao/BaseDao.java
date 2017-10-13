package cn.hetaoo.doong.dao;

import java.util.List;
import java.util.Map;

/**
 * 基础Dao(还需在XML文件里，有对应的SQL语句)
 * @param <T>
 */
public interface BaseDao<T> {
	
	void insert(T t);
	
	void insert(Map<String, Object> map);
	
	void insertBatch(List<T> list);
	
	Integer update(T t);

	Integer update(Map<String, Object> map);

	Integer delete(Object id);

	Integer delete(Map<String, Object> map);

	Integer deleteBatch(List<Object> id);

	T queryObject(Object id);
	
	List<T> queryList(Map<String, Object> map);
	
	List<T> queryList(Object id);

	Integer queryTotal(Map<String, Object> map);

	Integer queryTotal();
}
