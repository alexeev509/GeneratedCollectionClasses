package org.huawei;

import java.util.Collection;

public class GeneratedLinkedList<E> {

    private Object[] elementData;
    private int size = 0;

    public GeneratedLinkedList() {
    }

    public GeneratedLinkedList(Collection<? extends E> c) {
        Object[] objects = c.toArray();
        //+100 this is hack; I don't want to think about dynamic resizing of the array;
        elementData = new Object[objects.length + 100];
        size = objects.length;
        for (int i = 0; i < objects.length; i++) {
            elementData[i] = objects[i];
        }
    }

    public boolean add(E e) {
        System.out.println("------THIS IS IMPLEMENTATION OF THE MINE \"add\" method of the \"LinkedList\" class");
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        //System.out.println("It was invoked in the class: " + stackTrace[3].getClassName());

        //I want to increment Integer value for test's in class "LinkedListTest";
        if ("LinkedListTest".equals(stackTrace[3].getClassName())) {
            System.out.println("NOW WE WERE ENTERED IN THE TEST CASE IN CLASS \"LinkedListTest\"");
        }

        elementData[size++] = e;
        return true;
    }
}
