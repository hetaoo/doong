package cn.hetaoo.doong.common.utils;

import cn.hetaoo.doong.common.xss.SQLFilter;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 查询参数
 *
 * @author hetaoo
 */
public class Query extends LinkedHashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	//当前页码
    private int currentPage;
    //每页条数
    private int pageSize;

    public Query(Map<String, Object> params){
        this.putAll(params);

        //分页参数
        this.currentPage = Integer.parseInt(params.get("currentPage").toString());
        this.pageSize = Integer.parseInt(params.get("pageSize").toString());
        this.put("offset", (currentPage - 1) * pageSize);
        this.put("currentPage", currentPage);
        this.put("pageSize", pageSize);

        //防止SQL注入（因为sidx、order是通过拼接SQL实现排序的，会有SQL注入风险）
//        String sidx = params.get("sidx").toString();
//        String order = params.get("order").toString();
//        this.put("sidx", SQLFilter.sqlInject(sidx));
//        this.put("order", SQLFilter.sqlInject(order));
    }


    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
