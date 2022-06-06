package com.vivekjava;

import java.util.LinkedList;

public class LLFrameWork {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("linked");
        list.add("list");//this will at last
        System.out.println(list);

        list.addFirst("this");
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ->");
        }
        System.out.print("null");
    }
}
