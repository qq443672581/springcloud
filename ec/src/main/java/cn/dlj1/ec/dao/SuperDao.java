package cn.dlj1.ec.dao;

import cn.dlj1.ec.db.Jdbc;
import cn.dlj1.ec.db.condition.Cnd;
import cn.dlj1.ec.pojo.entity.Entity;

import java.util.List;
import java.util.Map;

/**
 * 数据接口
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/7
 */
public interface SuperDao<T extends Entity> {

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
     *
     *
     * @param clazz
     * @param sql
     * @param cnds
     * @return
     */
    long queryVOCount(Class<T> clazz, String sql, Cnd... cnds);

    /**
     *
     *
     * @param clazz
     * @param sql
     * @param sortField
     * @param sortType
     * @param nowPage
     * @param pageSize
     * @param cnds
     * @return
     */
    List<Map<String, Object>> queryVOTableData(
            Class<T> clazz,
            String sql,
            String sortField,
            String sortType,
            int nowPage,
            int pageSize,
            Cnd... cnds
    );

    /*
     * ============下边都是定义的普通查询Dao接口===================
     */

    /**
     * 通过Cnd查询实体
     *
     * @param clazz
     * @param cnds
     * @return
     */
    T queryEntity(Class<T> clazz, Cnd... cnds);

    /**
     * 通过ID查询实体
     *
     * @param clazz
     * @param id
     * @return
     */
    T queryEntity(Class<T> clazz, int id);

    /**
     * 查询实体集合通过cnd
     *
     * @param clazz
     * @param cnds
     * @return
     */
    List<T> queryEntitys(Class<T> clazz, Cnd... cnds);

    /**
     * 查询一个实体的某个字段集合
     * 通过cnd
     *
     * @param clazz
     * @param fieldType
     * @param field
     * @param cnds
     * @param <X>
     * @return
     */
    <X> List<X> queryEntityFields(Class<T> clazz, Class<X> fieldType, String field, Cnd... cnds);

    /**
     * 查询一个实体的某个字段
     * 通过cnd
     *
     * @param clazz
     * @param fieldType
     * @param field
     * @param cnds
     * @param <X>
     * @return
     */
    <X> X queryEntityField(Class<T> clazz, Class<X> fieldType, String field, Cnd... cnds);

    /**
     * 查询一个实体的某个字段
     * 通过ID
     *
     * @param clazz
     * @param fieldType
     * @param field
     * @param id
     * @param <X>
     * @return
     */
    <X> X queryEntityField(Class<T> clazz, Class<X> fieldType, String field, int id);

    /**
     * 判断数据是否存在
     * 通过cnd
     * 查询结果条数 > 0,那么返回true
     *
     * @param clazz
     * @param cnds
     * @return
     */
    boolean isExist(Class<T> clazz, Cnd... cnds);

    /**
     * 查询实体数据
     * 通过sql
     * 返回键值对形式
     *
     * @param sql
     * @param params
     * @return
     */
    Map<String, Object> queryMap(String sql, Object... params);

    /**
     * 查询实体数据
     * 通过sql
     * 返回键值对集合形式
     *
     * @param sql
     * @param params
     * @return
     */
    List<Map<String, Object>> queryMaps(String sql, Object... params);

    /**
     * 查询实体中一个字段集合
     * 通过sql
     *
     * @param clazz
     * @param sql
     * @param params
     * @param <X>
     * @return
     */
    <X> List<X> queryList(Class<X> clazz, String sql, Object... params);

    /**
     * 查询一个数据字段
     * 通过sql
     *
     * @param clazz
     * @param sql
     * @param params
     * @param <X>
     * @return
     */
    <X> X queryObject(Class<X> clazz, String sql, Object... params);

    /**
     * 数据新增修改
     * 返回影响条数
     *
     * @param sql
     * @param params
     * @return
     */
    int update(String sql, Object... params);

    /**
     * 多条数据新增修改
     * 返回影响条数
     *
     * @param sql
     * @param params
     * @return
     */
    int[] batchUpdate(String sql, List<Object[]> params);

}
