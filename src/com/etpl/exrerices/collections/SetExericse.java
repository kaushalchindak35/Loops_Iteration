package com.etpl.exrerices.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExericse {
    public static void main(String[] args) {
        SetExericse hse=new SetExericse();

        Set set=hse.getSampleSet();
        hse.printMySet(set);
    }

    private void printMySet(Set<String> set) {




      // for(String:)
    }

    private Set getSampleSet() {
        Set set=new HashSet();

        set.add("abc");
        set.add("def");
        set.add("xyz");

        return set;
    }
}
