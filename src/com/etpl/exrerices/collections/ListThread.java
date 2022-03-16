package com.etpl.exrerices.collections;

import java.util.ArrayList;

public class ListThread {

    public static void main(String[] args) {

      ArrayList arrayList=getArraylist();

        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread. currentThread() .getName()) ;
        System.out.println(Thread.currentThread().getStackTrace());
        Thread t1=new Thread (new ThreadType1(0,10,arrayList)) ;
        Thread t2=new Thread (new ThreadType1(10,20,arrayList)) ;

//        Thread t2=new Thread (new ThreadType1()) ;
//        Thread t2=new Thread (new ThreadType1()) ;
//        Thread t2=new Thread (new ThreadType1()) ;
//        Thread t2=new Thread (new ThreadType1()) ;
//        Thread t2=new Thread (new ThreadType1()) ;
//        Thread t2=new Thread (new ThreadType1()) ;
//        Thread t2=new Thread (new ThreadType1()) ;
//        Thread t2=new Thread (new ThreadType1()) ;
        try {

//            Thread.sleep(10000);
            t1.start();
            t2.start();
//            Thread.sleep(10000);
        }catch (Exception ex){

        }


    }

    private static ArrayList getArraylist() {
        int i;
        ArrayList Random1 = new ArrayList();
        for (i = 0; i < 20; i++) {
            Random1.add(i);
        }
        return  Random1;
    }
}
