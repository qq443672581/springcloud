package cn.dlj1.ec.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

/**
 * Jdbct扩展
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/7
 */
public class Jdbc extends JdbcTemplate {

    public Jdbc() {
    }

    public Jdbc(DataSource dataSource) {
        super(dataSource);
    }

    public Jdbc(DataSource dataSource, boolean lazyInit) {
        super(dataSource, lazyInit);
    }

    /**
     * 查询实体字段
     *
     * @param type
     * @param sql
     * @param params
     * @return
     */
    public <X> X queryEntityField(String sql, Class<X> type, Object... params) {
        return queryForObject(sql, type, params);
    }

    /**
     * 查询实体字段集合
     *
     * @param sql
     * @param type
     * @param params
     * @return
     */
    public <X> List<X> queryEntityFieldList(String sql, Class<X> type, Object... params) {
        return queryForList(sql, type, params);
    }

    /**
     * 插入一条数据并返回主键
     *
     * @param sql
     * @param params
     * @return
     */
    public int insert(final String sql, final Object... params) {
        KeyHolder keyHolder = new GeneratedKeyHolder();

        update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            if (null != params) {
                for (int i = 0; i < params.length; i++) {
                    ps.setObject(i + 1, params[i]);
                }
            }
            return ps;

        }, keyHolder);

        return (int) keyHolder.getKey().longValue();
    }

}
