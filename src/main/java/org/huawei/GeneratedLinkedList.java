package org.huawei;

import java.util.*;

public class GeneratedLinkedList<E> extends AbstractSequentialList<E>
        implements List<E>, Deque<E>, Cloneable, java.io.Serializable {

    private LinkedList<E> list = new LinkedList<>();
    int size = 0;

    public GeneratedLinkedList() {
        System.out.println("Generated GeneratedLinkedList()");
    }

    public GeneratedLinkedList(Collection<? extends E> c) {
        System.out.println("GeneratedLinkedList(Collection<? extends E> c)");
        Object[] objects = c.toArray();
        for (int i = 0; i < objects.length; i++) {
            list.add((E) objects[i]);
        }
    }

    @Override
    public void addFirst(E e) {
        System.out.println("Generated addFirst(E e)");
        list.addFirst(e);
    }

    @Override
    public void addLast(E e) {
        System.out.println("Generated addLast(E e)");
        list.addLast(e);
    }

    @Override
    public boolean offerFirst(E e) {
        System.out.println("Generated offerFirst(E e)");
        return list.offerFirst(e);
    }

    @Override
    public boolean offerLast(E e) {
        System.out.println("Generated offerLast(E e)");
        return list.offerLast(e);
    }

    @Override
    public E removeFirst() {
        System.out.println("Generated removeFirst()");
        return list.removeFirst();
    }

    @Override
    public E removeLast() {
        System.out.println("Generated removeLast()");
        return list.removeLast();
    }

    public E remove(int index) {
        System.out.println("Generated remove(int index)");
        E elem = list.remove(index);
        return elem;
    }

    @Override
    public E pollFirst() {
        System.out.println("Generated pollFirst()");
        return list.pollFirst();
    }

    @Override
    public E pollLast() {
        System.out.println("Generated pollLast()");
        return list.pollLast();
    }

    @Override
    public E getFirst() {
        System.out.println("Generated getFirst()");
        return list.getFirst();
    }

    @Override
    public E getLast() {
        System.out.println("Generated getLast()");
        return list.getLast();
    }

    @Override
    public E peekFirst() {
        System.out.println("Generated peekFirst()");
        return list.peekFirst();
    }

    @Override
    public E peekLast() {
        System.out.println("Generated peekLast()");
        return list.peekLast();
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        System.out.println("Generated removeFirstOccurrence(Object o)");
        return list.removeFirstOccurrence(o);
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        System.out.println("Generated removeLastOccurrence(Object o)");
        return list.removeLastOccurrence(o);
    }

    @Override
    public boolean add(E e) {
//        System.out.println("------THIS IS IMPLEMENTATION OF THE MINE \"add\" method of the \"LinkedList\" class");
//        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
//        System.out.println("It was invoked in the class: " + stackTrace[3].getClassName());
//
//        //I want to increment Integer value for test's in class "LinkedListTest";
//        if ("LinkedListTest".equals(stackTrace[3].getClassName())) {
//            System.out.println("NOW WE WERE ENTERED IN THE TEST CASE IN CLASS \"LinkedListTest\"");
//        }
        System.out.println("Generated add(E e)");
        return list.add(e);
    }

    @Override
    public boolean offer(E e) {
        System.out.println("Generated offer(E e)");
        return list.offer(e);
    }

    @Override
    public E remove() {
        System.out.println("Generated remove()");
        return list.remove();
    }

    @Override
    public E poll() {
        System.out.println("Generated poll()");
        return list.poll();
    }

    @Override
    public E element() {
        System.out.println("Generated element()");
        return list.element();
    }

    @Override
    public E peek() {
        System.out.println("Generated peek()");
        return list.peek();
    }

    @Override
    public void push(E e) {
        System.out.println("Generated push(E e)");
        list.push(e);
    }

    @Override
    public E pop() {
        System.out.println("Generated pop()");
        return list.pop();
    }

    @Override
    public int size() {
        System.out.println("Generated size()");
        return list.size();
    }

    @Override
    public Iterator<E> descendingIterator() {
        System.out.println("Generated descendingIterator()");
        return list.descendingIterator();
    }

    @Override
    public E get(int index) {
        System.out.println("GET GENERATED");
        return list.get(index);
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        System.out.println("Generated listIterator(int index)");
        return list.listIterator(index);
    }

    public boolean addAll(Collection<? extends E> c){
        System.out.println("Generated addAll(Collection<? extends E> c)");
        return list.addAll(c);
    }
}
