/*
package com.etpl.exrerices.collections;


import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayListExercise ae=new ArrayListExercise();

        List mySampleList=ae.getSampleList();
        ae.printArrayListObjectDetails(mySampleList);

        List randomObjectList=ae.getrandomObjectSampleList();
        ae.printArrayListObjectDetails(randomObjectList);

      List myCarList=ae.getSampleList();
       ae.printArrayListObjectDetails(myCarList);

     //   List myCarList2=ae.getSampleCarWithoutKnowingElseAllowed();
      //  ae.printArrayListObjectDetails(myCarList2);


    }

    */
/*  private List getSampleCarWithoutKnowingElseAllowed() {
        List<Carp> carpList =new ArrayList<Carp>();
        Carp c1=new Carp("Maruti","Zen","Hashback");
        Carp c2=new Carp("Maruti","Eritga","Hashback");
        Carp c3=new Carp("Maruti","Ciaz","Sedan");
        Carp c4=new Carp("Maruti","Omni","MiniVan");
        carpList.add(c1);
        carpList.add(c2);
        carpList.add(c3);
        carpList.add(c4);
        return carpList;*//*




       //   for (Carp item:CarList2)
        //{
       //     System.out.println(item);
      //  }


    }

  //  private List getCarList() {
   ////     List list=new ArrayList();
    //}

    private List getrandomObjectSampleList() {
        List list= new ArrayList();

        list.add("Abc");
      //  list.add(new Integer());
        list.add("xyz");
        list.add(Boolean.TRUE);
        list.add(null);

        return list;

    }

    private List getSampleList() {
        List list= new ArrayList();

        list.add("Abc");
        list.add("Def");
        list.add("xyz");

        return list;

    }

    public void printArrayListObjectDetails(List list){

        System.out.println("Number of Objects in the List--->"+list.size());
        System.out.println("m List Contais text abc?-->"+list.contains("Abc"));
        System.out.println("\n\n==============");
        for(int i=0;i<list.size();i++){
            System.out.println("Object at "+i+"is-->"+list.get(i));
        }
        System.out.println("\n\n==============");
    }

}
*/
