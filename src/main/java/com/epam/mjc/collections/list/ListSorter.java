package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator comparator = new ListComparator();
        sourceList.sort(comparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);

        int x = 5*aInt*aInt + 3;
        int y = 5*bInt*bInt + 3;
        if (x == y){
            if (aInt > bInt){
                return 1;
            }else return -1;
        } else if (x > y) {
            return 1;
        }else return -1;
    }
}
