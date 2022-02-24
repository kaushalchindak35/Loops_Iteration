package com.etpl.exrerices.collections;

import java.util.Random;

public class GetRandomBasePrice {
    public static void main(String[] args) {

        Random rd = new Random(); // creating Random object
        System.out.println(rd.nextDouble()*1000000);



    }
}
