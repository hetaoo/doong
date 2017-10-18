package cn.hetaoo.doong.common.dao;

import java.util.List;
import java.util.Map;

/**
 * 基础Dao(还需在XML文件里，有对应的SQL语句)
 * @param <S,T>
 */
public interface BaseDao<T,S> {
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
	Integer updateById(Object id);

	Integer update(T t);

	Integer update(Map<String, Object> map);

	// 删除
	Integer deleteById(Object id);

	Integer delete(Map<String, Object> map);

	Integer deleteBatchByIds(Object[] id);

	//查询
	T selectObjectById(Object id);

	List<T> selectList(Map<String, Object> map);
	
	List<T> selectList(S s);

	// 查询总数
	Integer selectTotal(Map<String, Object> map);

	Integer selectTotal(S s);

	Integer selectTotal();
}
