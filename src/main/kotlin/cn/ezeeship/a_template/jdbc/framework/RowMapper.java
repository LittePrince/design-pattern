package cn.ezeeship.a_template.jdbc.framework;

import java.sql.ResultSet;

/**
 * lxc
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs,int rowNum) throws Exception;

}
