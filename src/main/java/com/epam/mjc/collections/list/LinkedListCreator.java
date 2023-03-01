package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> res = new LinkedList<>();
        for (Integer integer : sourceList) {
            if (integer % 2 == 1){
                res.addFirst(integer);
            }else {
                res.addLast(integer);
            }
        }
        return res;
    }
}
