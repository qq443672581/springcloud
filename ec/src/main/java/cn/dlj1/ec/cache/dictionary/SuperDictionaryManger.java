package cn.dlj1.ec.cache.dictionary;

import org.springframework.cache.Cache;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/7
 */
public interface SuperDictionaryManger {

    /**
     * 设置字典名
     *
     * @return 返回字典名
     */
    String getName();

    /**
     * 获取cache管理器
     *
     * @return
     */
    Cache get();

    /**
     * 添加字典项
     *
     * @param key
     * @param arrayList
     */
    void put(String key, ArrayList<HashMap<String, Object>> arrayList);

    /**
     * 根据字典名
     * 自动查询放入字典项
     *
     * @param key
     */
    void put(String key);

    /**
     * 通过字典id
     * 自动查询放入字典项
     *
     * @param dictionaryId
     */
    void put(int dictionaryId);

    /**
     * 通过key获取字典项
     *
     * @param key
     * @return
     */
    ArrayList<HashMap<String, Object>> get(String key);

    /**
     * 删除一个字典项
     * 通过字典名
     *
     * @param key
     */
    void remove(String key);


    /**
     * 删除字典项
     * 通过字典ID
     *
     * @param dictionaryId
     */
    void remove(int dictionaryId);

    /**
     * 初始化所有字典项
     * 查询数据库中所有字典项 进行初始化
     */
    void initAll();

}
