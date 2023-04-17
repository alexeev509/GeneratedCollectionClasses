package org.huawei;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class GenLinkedList<E> extends LinkedList<E> {

    public GenLinkedList() {
        super();
        System.out.println("Generated GenLinkedList()");
    }

    public GenLinkedList(Collection<? extends E> c) {
        super(c);
        System.out.println("Generated GenLinkedList(Collection<? extends E> c)");
    }

    @Override
    public E getFirst() {
        System.out.println("Generated getFirst()");
        return super.getFirst();
    }

    @Override
    public E getLast() {
        System.out.println("Generated getLast()");
        return super.getLast();
    }

    @Override
    public E removeFirst() {
        System.out.println("Generated removeFirst()");
        return super.removeFirst();
    }

    @Override
    public E removeLast() {
        System.out.println("Generated removeLast()");
        return super.removeLast();
    }

    @Override
    public void addFirst(E e) {
        System.out.println("Generated addFirst(E e)");
        super.addFirst(e);
    }

    @Override
    public void addLast(E e) {
        System.out.println("Generated addLast(E e)");
        super.addLast(e);
    }

    @Override
    public boolean contains(Object o) {
        System.out.println("Generated contains(Object o)");
        return super.contains(o);
    }

    @Override
    public int size() {
        System.out.println("Generated size()");
        return super.size();
    }

    @Override
    public boolean add(E e) {
        System.out.println("Generated add(E e)");
        return super.add(e);
    }

    @Override
    public boolean remove(Object o) {
        System.out.println("Generated remove(Object o)");
        return super.remove(o);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        System.out.println("addAll(Collection<? extends E> c)");
        return super.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        System.out.println("addAll(int index, Collection<? extends E> c)");
        return super.addAll(index, c);
    }

    @Override
    public void clear() {
        System.out.println("Generated clear()");
        super.clear();
    }

    @Override
    public E get(int index) {
        System.out.println("Generated get(int index)");
        return super.get(index);
    }

    @Override
    public E set(int index, E element) {
        System.out.println("Generated set(int index, E element)");
        return super.set(index, element);
    }

    @Override
    public void add(int index, E element) {
        System.out.println("Generated add(int index, E element)");
        super.add(index, element);
    }

    @Override
    public E remove(int index) {
        System.out.println("Generated remove(int index)");
        return super.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        System.out.println("Generated indexOf(Object o)");
        return super.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        System.out.println("Generated lastIndexOf(Object o)");
        return super.lastIndexOf(o);
    }

    @Override
    public E peek() {
        System.out.println("Generated peek()");
        return super.peek();
    }

    @Override
    public E element() {
        System.out.println("Generated element()");
        return super.element();
    }

    @Override
    public E poll() {
        System.out.println("Generated poll()");
        return super.poll();
    }

    @Override
    public E remove() {
        System.out.println("Generated remove()");
        return super.remove();
    }

    @Override
    public boolean offer(E e) {
        System.out.println("Generated offer(E e)");
        return super.offer(e);
    }

    @Override
    public boolean offerFirst(E e) {
        System.out.println("Generated offerFirst(E e)");
        return super.offerFirst(e);
    }

    @Override
    public boolean offerLast(E e) {
        System.out.println("Generated offerLast(E e)");
        return super.offerLast(e);
    }

    @Override
    public E peekFirst() {
        System.out.println("Generated peekFirst()");
        return super.peekFirst();
    }

    @Override
    public E peekLast() {
        System.out.println("Generated peekLast()");
        return super.peekLast();
    }

    @Override
    public E pollFirst() {
        System.out.println("Generated pollFirst()");
        return super.pollFirst();
    }

    @Override
    public E pollLast() {
        System.out.println("Generated pollLast()");
        return super.pollLast();
    }

    @Override
    public void push(E e) {
        System.out.println("Generated push(E e)");
        super.push(e);
    }

    @Override
    public E pop() {
        System.out.println("Generated pop()");
        return super.pop();
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        System.out.println("Generated removeFirstOccurrence(Object o)");
        return super.removeFirstOccurrence(o);
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        System.out.println("Generated removeLastOccurrence(Object o)");
        return super.removeLastOccurrence(o);
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        System.out.println("Generated listIterator(int index)");
        return super.listIterator(index);
    }

    @Override
    public Iterator<E> descendingIterator() {
        System.out.println("Generated descendingIterator()");
        return super.descendingIterator();
    }

    @Override
    public Object clone() {
        System.out.println("Generated clone()");
        return super.clone();
    }

    @Override
    public Object[] toArray() {
        System.out.println("Generated toArray()");
        return super.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        System.out.println("Generated toArray(T[] a)");
        return super.toArray(a);
    }

    @Override
    public Spliterator<E> spliterator() {
        System.out.println("Generated spliterator()");
        return super.spliterator();
    }

    @Override
    public Iterator<E> iterator() {
        System.out.println("Generated iterator()");
        return super.iterator();
    }

    @Override
    public ListIterator<E> listIterator() {
        System.out.println("Generated listIterator()");
        return super.listIterator();
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        System.out.println("Generated subList(int fromIndex, int toIndex)");
        return super.subList(fromIndex, toIndex);
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Generated equals(Object o)");
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        System.out.println("Generated hashCode()");
        return super.hashCode();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        System.out.println("Generated removeRange(int fromIndex, int toIndex)");
        super.removeRange(fromIndex, toIndex);
    }

    @Override
    public boolean isEmpty() {
        System.out.println("Generated isEmpty()");
        return super.isEmpty();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        System.out.println("Generated containsAll(Collection<?> c)");
        return super.containsAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        System.out.println("Generated removeAll(Collection<?> c)");
        return super.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        System.out.println("Generated retainAll(Collection<?> c)");
        return super.retainAll(c);
    }

    @Override
    public String toString() {
        System.out.println("Generated toString()");
        return super.toString();
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        System.out.println("Generated replaceAll(UnaryOperator<E> operator)");
        super.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super E> c) {
        System.out.println("Generated sort(Comparator<? super E> c)");
        super.sort(c);
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        System.out.println("Generated toArray(IntFunction<T[]> generator)");
        return super.toArray(generator);
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        System.out.println("Generated removeIf(Predicate<? super E> filter)");
        return super.removeIf(filter);
    }

    @Override
    public Stream<E> stream() {
        System.out.println("Generated removeIf(Predicate<? super E> filter)");
        return super.stream();
    }

    @Override
    public Stream<E> parallelStream() {
        System.out.println("Generated parallelStream()");
        return super.parallelStream();
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        System.out.println("Generated forEach(Consumer<? super E> action)");
        super.forEach(action);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Generated finalize()");
        super.finalize();
    }
}
