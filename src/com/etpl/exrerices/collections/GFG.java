package com.etpl.exrerices.collections;

public class GFG {
    // Java program to demonstrate working of split()

        public static void main(String args[])
        {
            String str = "GeeksforGeeks.A Computer Science Portal";
            String[] arrOfStr = str.split("\\.");

            for (String a : arrOfStr)
                System.out.println(a);
        }
    }

