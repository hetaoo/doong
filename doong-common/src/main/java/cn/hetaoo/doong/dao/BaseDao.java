package cn.hetaoo.doong.dao;

import java.util.List;
import java.util.Map;

/**
 * 基础Dao(还需在XML文件里，有对应的SQL语句)
 * @param <S,T>
 */
public interface BaseDao<S,T> {
	// 插入
	Integer insert(T t);

	Integer insert(Map<String, Object> map);

	/**
	 * 批量插入
	 * @param list
	 * @return
	 */
	Integer insertBatch(List<T> list);

	// 更新
	Integer update(T t);

	Integer update(Map<String, Object> map);

	// 删除
	Integer deleteById(Object id);

	Integer delete(Map<String, Object> map);

	Integer deleteBatchByIds(List<Object> id);

	//查询
	S selectObjectById(Object id);

	List<S> selectList(Map<String, Object> map);
	
	List<S> selectList(T t);

	// 查询总数
	Integer queryTotal(Map<String, Object> map);

	Integer queryTotal(T t);

	Integer queryTotal();
}
