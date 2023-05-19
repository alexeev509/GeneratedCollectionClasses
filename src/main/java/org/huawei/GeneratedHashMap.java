package org.huawei;

import java.io.Serializable;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class GeneratedHashMap <K,V> extends AbstractMap<K,V>
        implements Map<K,V>, Cloneable, Serializable {

    private HashMap<K,V> map;

    public GeneratedHashMap(int initialCapacity, float loadFactor){
        map = new HashMap<>(initialCapacity, loadFactor);
    }

    public GeneratedHashMap(int initialCapacity){
        map = new HashMap<>(initialCapacity);
    }


    public GeneratedHashMap(){
        map = new HashMap<>();
    }

    public GeneratedHashMap(Map<? extends K, ? extends V> m) {
        map = new HashMap<>(m);
    }

    public int size(){
        return map.size();
    }

    public boolean isEmpty(){
        return map.isEmpty();
    }

    public V get(Object key) {
        return map.get(key);
    }

    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    public V put(K key, V value){
        return map.put(key, value);
    }

    public void putAll(Map<? extends K, ? extends V> m) {
        map.putAll(m);
    }

    public V remove(Object key) {
        return map.remove(key);
    }

    public void clear() {
        map.clear();
    }

    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    public Set<K> keySet() {
        return map.keySet();
    }

    public Collection<V> values() {
        return map.values();
    }

    public Set<Map.Entry<K,V>> entrySet() {
        return map.entrySet();
    }

    @Override
    public V getOrDefault(Object key, V defaultValue) {
        return map.getOrDefault(key, defaultValue);
    }

    @Override
    public V putIfAbsent(K key, V value) {
        return map.putIfAbsent(key, value);
    }

    @Override
    public boolean remove(Object key, Object value) {
        return map.remove(key, value);
    }

    @Override
    public boolean replace(K key, V oldValue, V newValue) {
        return map.replace(key, oldValue, newValue);
    }

    @Override
    public V replace(K key, V value) {
        return map.replace(key, value);
    }

    @Override
    public V computeIfAbsent(K key,
                             Function<? super K, ? extends V> mappingFunction) {
        return map.computeIfAbsent(key, mappingFunction);
    }

    @Override
    public V computeIfPresent(K key,
                              BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        return map.computeIfPresent(key,remappingFunction);
    }

    @Override
    public V compute(K key,
                     BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        return map.compute(key, remappingFunction);
    }

    @Override
    public V merge(K key, V value,
                   BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        return map.merge(key, value, remappingFunction);
    }

    @Override
    public void forEach(BiConsumer<? super K, ? super V> action) {
        map.forEach(action);
    }

    @Override
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
        map.replaceAll(function);
    }

    @Override
    public Object clone() {
        return map.clone();
    }
}
