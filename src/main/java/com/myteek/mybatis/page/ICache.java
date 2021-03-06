package com.myteek.mybatis.page;

public interface ICache<K, V> {

    V get(K key);

    void put(K key, V value);

}
