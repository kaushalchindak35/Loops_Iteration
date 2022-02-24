package com.etpl.exrerices.collections;

public class StringFunctionTest {
    public static void main(String[] args) {
        String str="My Name is Kaushal.I stay in Bhavani Peth,Solapur";
       // str="abc.xyz";
        String s[]=str.split("\\.");
        System.out.println(s.length);
        for (String a:s)
              {
                  System.out.println(a);
              }
    }
}
