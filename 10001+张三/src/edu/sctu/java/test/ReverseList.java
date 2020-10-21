package edu.sctu.java.test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReverseList<E> {

    private List<E> _list = new ArrayList<>();

    public void add(E e) {
        _list.add(e);
    }

    public Iterator<E> iterator() {
        return new ReverseListIter(_list.size() - 1);
    }

    private class ReverseListIter implements Iterator<E> {
        private int _cursor;

        ReverseListIter(int index) {

            _cursor = index;
        }

        @Override
        public boolean hasNext() {
            return _cursor >= 0;
        }

        @Override
        public E next() {
            int i = _cursor;
            --_cursor;

            return _list.get(i);
        }
    }


    public static void main(String[] args) {

        ReverseList<String> list = new ReverseList<>();
        list.add("hello");
        list.add("world");

        for (Iterator<String> iter = list.iterator(); iter.hasNext();){
            String s = iter.next();
            System.out.println(s);
        }

    }
}


