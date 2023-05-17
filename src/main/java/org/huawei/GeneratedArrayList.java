package org.huawei;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class GeneratedArrayList <E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable {

    private ArrayList<E> list;

    public GeneratedArrayList(int initialCapacity) {
//        System.out.println("Generated GeneratedArrayList(int initialCapacity)");
        list = new ArrayList<>(initialCapacity);
    }

    public GeneratedArrayList() {
        list = new ArrayList<>();
//        System.out.println("Generated GeneratedArrayList()");
    }

    public GeneratedArrayList(Collection<? extends E> c) {
//        System.out.println("Generated GeneratedArrayList(Collection<? extends E> c)");
        list = new ArrayList<>(c);
    }

    public void trimToSize() {
//        System.out.println("Generated GeneratedArrayList trimToSize()");
        list.trimToSize();
    }

    public void ensureCapacity(int minCapacity) {
//        System.out.println("Generated GeneratedArrayList ensureCapacity(int minCapacity)");
        list.ensureCapacity(minCapacity);
    }

    @Override
    public int size() {
//        System.out.println("Generated GeneratedArrayList size()");
        return list.size();
    }

    public boolean isEmpty() {
//        System.out.println("Generated GeneratedArrayList isEmpty()");
        return list.isEmpty();
    }

    public boolean contains(Object o){
//        System.out.println("Generated GeneratedArrayList contains(Object o)");
        return list.contains(o);
    }

    public int indexOf(Object o) {
//        System.out.println("Generated GeneratedArrayList indexOf(Object o)");
        return list.indexOf(o);
    }

    public int lastIndexOf(Object o) {
//        System.out.println("Generated GeneratedArrayList lastIndexOf(Object o)");
        return list.lastIndexOf(o);
    }

    public Object clone() {
//        System.out.println("Generated GeneratedArrayList clone()");
        return list.clone();
    }

    public Object[] toArray(){
//        System.out.println("Generated GeneratedArrayList toArray()");
        return list.toArray();
    }

    public <T> T[] toArray(T[] a) {
//        System.out.println("Generated GeneratedArrayList toArray(T[] a)");
        return list.toArray(a);
    }

    @Override
    public E get(int index) {
//        System.out.println("Generated GeneratedArrayList get(int index)");
        return list.get(index);
    }

    public E set(int index, E element) {
//        System.out.println("Generated GeneratedArrayList set(int index, E element)");
        return list.set(index,element);
    }

    public boolean add(E e) {
//        System.out.println("Generated GeneratedArrayList add(E e)");
        return list.add(e);
    }

    public void add(int index, E element) {
//        System.out.println("Generated GeneratedArrayList add(int index, E element)");
        list.add(index, element);
    }

    public E remove(int index) {
//        System.out.println("Generated GeneratedArrayList remove(int index)");
        return list.remove(index);
    }

    public boolean equals(Object o) {
//        System.out.println("Generated GeneratedArrayList equals(Object o)");
        return list.equals(o);
    }

    public int hashCode() {
//        System.out.println("Generated GeneratedArrayList hashCode()");
        return list.hashCode();
    }

    public boolean remove(Object o) {
//        System.out.println("Generated GeneratedArrayList remove(Object o)");
        return list.remove(o);
    }

    public void clear() {
//        System.out.println("Generated GeneratedArrayList clear()");
        list.clear();
    }

    public boolean addAll(Collection<? extends E> c) {
//        System.out.println("Generated GeneratedArrayList addAll(Collection<? extends E> c)");
        return list.addAll(c);
    }

    public boolean addAll(int index, Collection<? extends E> c) {
//        System.out.println("Generated GeneratedArrayList addAll(int index, Collection<? extends E> c)");
        return list.addAll(index, c);
    }

    public boolean removeAll(Collection<?> c) {
//        System.out.println("Generated GeneratedArrayList removeAll(Collection<?> c)");
        return list.removeAll(c);
    }

    public boolean retainAll(Collection<?> c) {
//        System.out.println("Generated GeneratedArrayList retainAll(Collection<?> c)");
        return list.retainAll(c);
    }

    public ListIterator<E> listIterator(int index) {
//        System.out.println("Generated GeneratedArrayList listIterator(int index)");
        return list.listIterator(index);
    }

    public ListIterator<E> listIterator() {
//        System.out.println("Generated GeneratedArrayList listIterator()");
        return list.listIterator();
    }

    public Iterator<E> iterator() {
//        System.out.println("Generated GeneratedArrayList iterator()");
        return list.iterator();
    }

    public List<E> subList(int fromIndex, int toIndex) {
//        System.out.println("Generated GeneratedArrayList subList(int fromIndex, int toIndex)");
        return list.subList(fromIndex, toIndex);
    }

    @Override
    public void forEach(Consumer<? super E> action) {
//        System.out.println("Generated GeneratedArrayList forEach(Consumer<? super E> action)");
        list.forEach(action);
    }

    @Override
    public Spliterator<E> spliterator() {
//        System.out.println("Generated GeneratedArrayList spliterator()");
        return list.spliterator();
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
//        System.out.println("Generated GeneratedArrayList Predicate<? super E> filter");
        return list.removeIf(filter);
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
//        System.out.println("Generated GeneratedArrayList replaceAll(UnaryOperator<E> operator)");
        list.replaceAll(operator);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void sort(Comparator<? super E> c) {
//        System.out.println("Generated GeneratedArrayList sort(Comparator<? super E> c)");
        list.sort(c);
    }
}
