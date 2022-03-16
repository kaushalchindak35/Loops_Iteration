package com.etpl.exrerices.collections;

import java.util.ArrayList;

public class ThreadType1 implements Runnable {

    int start,end;
    ArrayList arrayList ;

    public ThreadType1(int start, int end, ArrayList arrayList) {
        this.start = start;
        this.end = end;
        this.arrayList = arrayList;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
        try {
            System.out.print(arrayList.get(i)+"\t");
            Thread.sleep(1000);

            System.out.println();
        }catch (Exception ex){

        }
        }

    }
}
