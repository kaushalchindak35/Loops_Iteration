package com.etpl.exrerices.collections;

import java.util.*;

public class CarRecords {

    enum carMake {
        Maruti, Hyundia, Kia, Tata, Mnm, Honda, Nissan, Audi, BMW, Mercedes;
    };

    enum carType {
        SUV, Sedan, MiniVan, Hatchback, Coupe;
    };

    enum carTrim {
        XS, XT, XE, SE, ST;
    };

    public static void main(String args[]) {


        List<Carp> carRecords=new ArrayList<>();
        carRecords = getCarRecords();
        System.out.println(carRecords.size());

    }

    private static String getRandomString(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

//        System.out.println(generatedString);

        return generatedString;
    }

    private static List<Carp> getCarRecords() {

        Carp carp = new Carp();
        Random random = new Random();

        List<Carp> carRecords = new ArrayList<>();
//        for (long i = 0; i < 100000; i++) {

//        while(carRecords.size()<100){
//            carp.setName(getRandomString());
//            carp.setBasePrice(getRandomBasePrice());
//            carp.setMake(String.valueOf(carMake.values()[random.nextInt(carMake.values().length)]));
//            carp.setTrim(String.valueOf(carTrim.values()[random.nextInt(carTrim.values().length)]));
//            carp.setType(String.valueOf(carType.values()[random.nextInt(carType.values().length)]));
//
//            System.out.println(carRecords.size());
//            System.out.println(carp);
////            carRecords.add(carp);
//
//            try {
//                if (carRecords.size()>0) {
//                    for (int l = 0; l <= carRecords.size(); l++) {
//                        if (carp.getMake().equals(carRecords.get(l).getMake())//make maruti same
//                                && carp.getName().equals(carRecords.get(l).getName()) /// abc same
//                                && !carp.getType().equals(carRecords.get(l).getType())
//                            && carp.getTrim().equals(carRecords.get(l).getTrim())) {// hatchback ! but sedan
//                            break;
//                        } else {
//                            System.out.println("1adding--------------------------------------");
//                            carRecords.add(carp);
//                            break;
//                        }
//                    }
//                }else {
//                    System.out.println("2adding--------------------------------------");
//                    carRecords.add(carp);
//                }
//            }catch (Exception ex){
//                ex.printStackTrace();
//            }
//}


/*        Integer i = 0;
        while (i != 1) {

            Scanner sc = new Scanner(System.in);
            try {


                System.out.println("Enter Make");
                carp.setMake(sc.nextLine());
                System.out.println(carp.make);
                System.out.println("Enter name");
                carp.setName(sc.nextLine());
                System.out.println("Enter type");
                carp.setType(sc.nextLine());
                System.out.println("Enter trim");
                carp.setTrim(sc.nextLine());


                if (carRecords.size() > 0) {
                    for (int l = 0; l <= carRecords.size(); l++) {
                        if (carp.getMake().equals(carRecords.get(l).getMake())//make maruti same
                                && carp.getName().equals(carRecords.get(l).getName()) // abc same
                                && !(carp.getType().equals(carRecords.get(l).getType()))
                                && carp.getTrim().equals(carRecords.get(l).getTrim())) {// hatchback ! but sedan
                            break;
                        } else {
                            System.out.println("1 adding--------------------------------------");
                            carRecords.add(carp);
                            break;
                        }
                    }
                } else {
                    System.out.println("2 adding--------------------------------------");
                    carRecords.add(carp);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("0 for continue 1 for exit");
            i=sc.nextInt();

        }
        for (Carp c:carRecords) {

            System.out.println(c);
        }*/
            return carRecords;

    }


//    private static float getRandomBasePrice() {
//        Random rd = new Random(); // creating Random object
//        return rd.nextFloat()*1000000;
//    }


    static String usingRandom() {

            String alphabetsInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String alphabetsInLowerCase = "abcdefghijklmnopqrstuvwxyz";

            Random random = null;
            String numbers = "0123456789";
            // create a super set of all characters
            String allCharacters = alphabetsInLowerCase + alphabetsInUpperCase + numbers;
            // initialize a string to hold result
            StringBuffer randomString = new StringBuffer();
            // loop for 10 times
            for (int i = 0; i < 10; i++) {
                try {

                // generate a random number between 0 and length of all characters
                int randomIndex = random.nextInt(allCharacters.length());
                // retrieve character at index and add it to result
                randomString.append(allCharacters.charAt(randomIndex));

                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }


            return randomString.toString();
        }
    }
