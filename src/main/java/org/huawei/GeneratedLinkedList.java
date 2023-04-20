package org.huawei;

import java.util.*;

public class GeneratedLinkedList<E> extends AbstractSequentialList<E>
        implements List<E>, Deque<E>, Cloneable, java.io.Serializable {

    private ArrayList<E> arrayList = new ArrayList<>();
    int size = 0;

    public GeneratedLinkedList() {
        System.out.println("Generated GeneratedLinkedList()");
    }

    public GeneratedLinkedList(Collection<? extends E> c) {
        System.out.println("GeneratedLinkedList(Collection<? extends E> c)");
        Object[] objects = c.toArray();
        for (int i = 0; i < objects.length; i++) {
            arrayList.add((E) objects[i]);
        }
    }

    @Override
    public void addFirst(E e) {

    }

    @Override
    public void addLast(E e) {

    }

    @Override
    public boolean offerFirst(E e) {
        return false;
    }

    @Override
    public boolean offerLast(E e) {
        return false;
    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    public E remove(int index) {
        System.out.println("Generated remove(int index)");
        E elem = arrayList.remove(index);
        return elem;
    }

    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
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
        arrayList.add(e);
        return true;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public int size() {
        return arrayList.size();
    }

    @Override
    public Iterator<E> descendingIterator() {
        return null;
    }

    @Override
    public E get(int index) {
        System.out.println("GET GENERATED");
        return (E) arrayList.get(index);
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }
}
