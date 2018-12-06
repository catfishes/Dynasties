package jy.dao;

import com.ibatis.sqlmap.client.SqlMapClient;

import java.sql.SQLException;

public class DaoDbUtils {

    private SqlMapClient sqlMap;


    public void setSqlMap(SqlMapClient sqlMap) {
        this.sqlMap = sqlMap;
    }

    public Object select (Object object) throws SQLException {
        return this.sqlMap.queryForObject(null,object);
    }

    public Object update (Object object) throws SQLException{
        return this.sqlMap.update(null,object);
    }

    public Object insert (Object object) throws SQLException{
        return this.sqlMap.insert(null,object);
    }

    public Object delete(Object object)throws SQLException{
        return this.sqlMap.delete(null,object);
    }
}
