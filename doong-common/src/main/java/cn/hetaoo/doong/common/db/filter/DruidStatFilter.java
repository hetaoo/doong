package cn.hetaoo.doong.common.db.filter;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Created by hetaoo on 2017/6/29.
 */
@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",
        // 忽略资源
        initParams={@WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")}
    )
public class DruidStatFilter extends WebStatFilter {

}
