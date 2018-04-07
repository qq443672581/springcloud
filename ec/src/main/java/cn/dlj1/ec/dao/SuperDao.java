package cn.dlj1.ec.dao;

import cn.dlj1.ec.db.Jdbc;
import cn.dlj1.ec.db.condition.Cnd;
import cn.dlj1.ec.pojo.entity.SuperEntity;

import java.util.List;
import java.util.Map;

/**
 * 数据接口
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/7
 */
public interface SuperDao<T extends SuperEntity> {

    /**
     * 获取jdbc模版<br>
     *
     * @return
     */
    Jdbc getJdbc();

    /**
     * 设置数据源
     *
     * @param jdbc
     */
    void setJdbc(Jdbc jdbc);

    /**
     * 持久化一个实体。<br>
     * 持久化前会过滤掉当中为null的字段<br>
     * 返回持久化后的ID<br>
     *
     * @param entity
     * @return
     */
    int save(T entity);

    /**
     * 保存多个实体
     *
     * @param entitys
     * @return
     */
    int[] save(List<T> entitys);

    /**
     * 删除
     *
     * @param clazz
     * @param cnds
     * @return
     */
    int delete(Class<T> clazz, Cnd... cnds);

    /**
     * 删除记录
     *
     * @param clazz
     * @param ids
     * @return
     */
    int delete(Class<T> clazz, int... ids);

    /**
     * 更新entity数据通过cnd
     *
     * @param entity
     * @param cnds
     * @return
     */
    boolean update(T entity, Cnd... cnds);

    /**
     * 通过实体 ID 更新
     *
     * @param entity
     * @return
     */
    boolean update(T entity);

    /**
     * 查询实体属性
     *
     * @param clazz
     * @param returns
     * @param isRelation  是否关联数据
     * @param isCascading 是否级联数据
     * @param cnds
     * @return
     */
    Map<String, Object> query(Class<T> clazz, String[] returns, boolean isRelation, boolean isCascading, Cnd... cnds);

    /**
     * 通过 ID 查询实体属性
     *
     * @param clazz
     * @param returns
     * @param isRelation  是否关联数据
     * @param isCascading 是否级联数据
     * @param id
     * @return
     */
    Map<String, Object> query(Class<T> clazz, String[] returns, boolean isRelation, boolean isCascading, int id);

    /**
     * 查询实体 数据总条数
     *
     * @param clazz
     * @param cnds
     * @return
     */
    long queryCount(Class<T> clazz, Cnd... cnds);

    /**
     * 分页查询
     *
     * @param clazz
     * @param returns
     * @param sortField
     * @param sortType
     * @param nowPage
     * @param pageSize
     * @param isRelation  是否关联数据
     * @param isCascading 是否级联数据
     * @param cnds
     * @return
     */
    List<Map<String, Object>> queryTableData(
            Class<T> clazz,
            String[] returns,
            String sortField,
            String sortType,
            int nowPage,
            int pageSize,
            boolean isRelation,
            boolean isCascading,
            Cnd... cnds
    );

    /**
     * @param clazz
     * @param sql
     * @param returns
     * @param groups
     * @param cnds
     * @return
     */
    long queryCount(Class<T> clazz, String sql, String[] returns, String[] groups, Cnd... cnds);

    /**
     * @param clazz
     * @param sql
     * @param returns
     * @param groups
     * @param sortField
     * @param sortType
     * @param nowPage
     * @param pageSize
     * @param cnds
     * @return
     */
    List<Map<String, Object>> queryTableData(
            Class<T> clazz,
            String sql,
            String[] returns,
            String[] groups,
            String sortField,
            String sortType,
            int nowPage,
            int pageSize,
            Cnd... cnds
    );


    /*
     * 用于表格的方法End
     */

    /*
     * ============下边都是定义的普通查询Dao接口===================
     */

    /**
     * 通过Cnd查询实体
     */
    T queryEntity(Class<T> type, Cnd... cnds);

    /**
     * 通过ID查询实体
     */
    T queryEntity(Class<T> type, int id);

    /**
     * 查询实体list
     */
    List<T> queryEntityList(Class<T> type, Cnd... cnds);

    /**
     * 查询一个实体的某个字段list
     */
    <X> List<X> queryEntityFieldList(Class<T> type, String field, Class<X> fieldType, Cnd... cnds);

    /**
     * 查询一个实体的一个字段通过Cnd
     */
    <X> X queryEntityField(Class<T> type, String returnField, Class<X> fieldType, Cnd... cnds);

    /**
     * 查询一个实体的一个字段通过ID
     */
    <X> X queryEntityField(Class<T> type, String returnField, Class<X> fieldType, int id);

    /**
     * 通过Cnd 判断次条件下的数据是否存在<br>
     * 只要 查询结果条数 > 0,那么返回true
     */
    boolean isExist(Class<T> type, Cnd... cnds);

    /**
     * 通过sql语句返回一个实体的键值对
     */
    Map<String, Object> queryMap(String sql, Object... params);

    /**
     * 通过sql语句返回一个实体的 KV List
     */
    List<Map<String, Object>> queryMapList(String sql, Object... params);

    /**
     * 查询实体中一个字段的list
     */
    <X> List<X> queryList(String sql, Class<X> type, Object... params);

    /**
     * 用于统计返回字段
     */
    <X> X queryObject(String sql, Class<X> type, Object... params);

    /**
     * update
     *
     * @param sql
     * @param params
     * @return
     */
    int update(String sql, Object... params);

    /**
     * 多条修改
     *
     * @param sql
     * @param params
     * @return
     */
    int[] batchUpdate(String sql, List<Object[]> params);

}
