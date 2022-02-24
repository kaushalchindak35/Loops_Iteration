//package com.etpl.exrerices.collections;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class ListToMap {
//
//   /* static ArrayList<Carp> carpArrayList = new ArrayList<Carp>();
//
//    static  HashMap<String, ArrayList<String>> carpHashMap = new HashMap<>();
//
//    static HashMap<String,HashMap<String,Long>> typeCount=new HashMap<>();
//
//    static HashMap<String,Float> transportationFees=new HashMap<String, Float>();*/
//
////    public static void setTypeCount()
////    {
////        for(Carp cp : carpArrayList)
////        {
////           // System.out.println(cp);
////            typeCount.put(cp.getMake(), new HashMap<String,Long>());
////        }
////
////        for (Carp cp : carpArrayList) {
////            typeCount.get(cp.getMake()).put(cp.getType(), 0L);
////        }
////
////        for (Carp cp : carpArrayList) {
////            Long typeCounts =typeCount.get(cp.getMake()).get(cp.getType());
////            typeCount.get(cp.getMake()).put(cp.getType(),++typeCounts);
////        }
////    }
////
////    public Map<String,Float> getSampleDataTransportationFees()
////    {
////        Map<String,Float> transportationFees = new HashMap<String, Float>();
////        transportationFees.put("Pune",2f);
////        transportationFees.put("Delhi",1f);
////        transportationFees.put("Solapur",3f);
////        transportationFees.put("Chennai",2.5f);
////        transportationFees.put("Mumbai",1.5f);
////
////        return transportationFees;
////
////    }
//
//
//    public static void main(String args[])
//    {
//        ListToMap hm=new ListToMap();
//        List<Carp> sampledata= hm.getSampleCarData();
//        System.out.println("car by make");
//        Map<String,List<Carp>> carsByMake = hm.getCarsByMake(sampledata);
//        System.out.println(carsByMake);
//
//        Map<String,HashMap<String,Long>> typeCount=hm.getTypeCount(sampledata);
//        System.out.println("Type Count");
//        System.out.println(typeCount);
//
////        Map<String,List<Carp>> carsByType = hm.getCarsByType(sampledata);
////        Map<String,Float> transportationFees= hm.getSampleDataTransportationFees();
////        hm.printMyMap(carsByMake);
////        hm.printMyMap(carsByType);
//        /*Map<String, ArrayList<String>> map = hm.getSampleCarData();
//
//
//
//
//        setTypeCount();
//
//        System.out.println("\n"+typeCount);
//
//        getSampleDataTransportationFees();
//        System.out.println(transportationFees);
//        printOnRoadPrice();*/
//
//
//    }
//
//    private Map<String, HashMap<String, Long>> getTypeCount(List<Carp> sampledata) {
//        Map<String, HashMap<String, Long>> typeCount= new HashMap<>();
//
//        sampledata.stream().forEach(carp -> typeCount.put(carp.getMake(),new HashMap<>()));
////        for(Carp cp : carpArrayList)
////        {
////           // System.out.println(cp);
////            typeCount.put(cp.getMake(), new HashMap<String,Long>());
////        }
////
//        sampledata.stream().forEach(carp -> typeCount.get(carp.getMake()).put(carp.getType(),0L));
////        for (Carp cp : carpArrayList) {
////            typeCount.get(cp.getMake()).put(cp.getType(), 0L);
////        }
////
//        //Long coutn=0L;
//        sampledata.stream().forEach(carp ->
//                typeCount.get(carp.getMake()).put(carp.getType(),1+typeCount.get(carp.getMake()).get(carp.getType())));
////        for (Carp cp : carpArrayList) {
////            Long typeCounts =typeCount.get(cp.getMake()).get(cp.getType());
////            typeCount.get(cp.getMake()).put(cp.getType(),++typeCounts);
////        }
//
//        return typeCount;
//    }
//
//    private Map<String, List<Carp>> getCarsByMake(List<Carp> sampledata) {
//
//          HashMap<String, List<Carp>> carpHashMap = new HashMap<>();
//
//          sampledata.stream().forEach(carp -> carpHashMap.put(carp.getMake(),new ArrayList<>()));
////                for(Carp cp : sampledata)
////        {
//////             System.out.println(cp);
////            carpHashMap.put(cp.getMake(), new ArrayList<>());
////        }
//        sampledata.stream().forEach(carp -> carpHashMap.get(carp.getMake()).add(carp));
////        for (Carp cp : sampledata) {
////            carpHashMap.get(cp.getMake()).add(cp);
////        }
////        for (String key : carpHashMap.keySet()) {
////            System.out.println("Value in Key [" + key + "] is = " + carpHashMap.get(key) + "");
////        }
//
//        return carpHashMap;
//    }
//
////    private Map<String, List<Carp>> getCarsByType(List<Carp> sampledata) {
////    }
////
////    private Map<String, List<Carp>> getCarsByMake(List<Carp> sampledata) {
////    }
//
////    public static void printOnRoadPrice()
////    {
////       // for (Carp cp: carpArrayList)
////       // {
////           // transportationFees.keySet().stream().forEach(transportationFees.get()-> System.out.println(tf));
////            transportationFees.entrySet().stream().forEach(System.out::println);
////       // }
////    }
//
////    private void printMyMap(Map<String, ArrayList<String>> map )
////    {
////        for(Carp cp : carpArrayList)
////        {
////             System.out.println(cp);
////            carpHashMap.put(cp.getMake(), new ArrayList<>());
////        }
////        for (Carp cp : carpArrayList) {
////            carpHashMap.get(cp.getMake()).add(cp.name);
////        }
////        for (String key : carpHashMap.keySet()) {
////            System.out.println("Value in Key [" + key + "] is = " + carpHashMap.get(key) + "");
////        }
////    }
//
//    private List<Carp> getSampleCarData() {
//        List<Carp> carpArrayList=new ArrayList<Carp>();
//
//        Carp c1 = new Carp("Maruti", "Zen", "Hashback",3000);
//        Carp c2 = new Carp("Maruti", "Eritga", "Hashback",3001);
//        Carp c3 = new Carp("Maruti", "Ciaz", "Sedan",3002);
//        Carp c4 = new Carp("Maruti", "Omni", "MiniVan",3003);
//        Carp c5 = new Carp("Hyundai", "Alcazar", "Suv",4000);
//        Carp c6 = new Carp("Hyundai", "Creta", "Suv",4001);
//        Carp c7 = new Carp("Hyundai", "Venue", "Suv",4002);
//        Carp c8 = new Carp("Tata", "Indica", "HashBack",5000);
//        Carp c9 = new Carp("Tata", "nano", "MiniVan",5001);
//        Carp c10 = new Carp("Tata", "Indigo", "Sedan",5002);
//        Carp c11 = new Carp("Maruti", "Celerio", "SUV",3004);
//        Carp c12 = new Carp("Maruti", "Alto", "SUV",3005);
//        Carp c13 = new Carp("Tata", "Nexon", "SUV",5003);
//        Carp c14 = new Carp("Tata", "Harrier", "SUV",5004);
//        Carp c15 = new Carp("Tata", "Safari", "SUV",5005);
//        Carp c16 = new Carp("Hyundai", "KIA", "MiniVan",4003);
//        Carp c17 = new Carp("Hyundai", "Staria", "MiniVan",4004);
//        Carp c18 = new Carp("Hyundai", "Santro", "Sedan",4005);
//        Carp c19 = new Carp("Hyundai", "Grand i10 NIOS", "Sedan",4006);
//        Carp c20 = new Carp("Hyundai", "i20", "HashBack",4007);
//        Carp c21 = new Carp("Hyundai", "Magna", "HashBack",4008);
//        Carp c22 = new Carp("Hyundai", "Asta", "HashBack",4009);
//
//        carpArrayList.add(c1);
//        carpArrayList.add(c2);
//        carpArrayList.add(c3);
//        carpArrayList.add(c4);
//        carpArrayList.add(c5);
//        carpArrayList.add(c6);
//        carpArrayList.add(c7);
//        carpArrayList.add(c8);
//        carpArrayList.add(c9);
//        carpArrayList.add(c10);
//        carpArrayList.add(c11);
//        carpArrayList.add(c12);
//        carpArrayList.add(c13);
//        carpArrayList.add(c14);
//        carpArrayList.add(c15);
//        carpArrayList.add(c16);
//        carpArrayList.add(c17);
//        carpArrayList.add(c18);
//        carpArrayList.add(c19);
//        carpArrayList.add(c20);
//        carpArrayList.add(c21);
//
//        return      carpArrayList;
//    }
//}