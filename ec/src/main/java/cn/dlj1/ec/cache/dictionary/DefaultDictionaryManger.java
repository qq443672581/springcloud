package cn.dlj1.ec.cache.dictionary;

import org.springframework.cache.Cache;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 默认字典实现
 *
 * @author: fivewords(443672581 @ qq.com)
 * @dateTime: 2018/4/7
 */
@Component
@Order(1)
public class DefaultDictionaryManger implements SuperDictionaryManger {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Cache get() {
        return null;
    }

    @Override
    public void put(String key, ArrayList<HashMap<String, Object>> arrayList) {

    }

    @Override
    public void put(String key) {

    }

    @Override
    public void put(int dictionaryId) {

    }

    @Override
    public ArrayList<HashMap<String, Object>> get(String key) {
        return null;
    }

    @Override
    public void remove(String key) {

    }

    @Override
    public void remove(int dictionaryId) {

    }

    @Override
    public void initAll() {

    }
}
