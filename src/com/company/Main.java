package com.company;

public class Main {
    public static boolean itsPrime(int numberIWantToKnowIfItsPrime){
    int counter = 0;

    for (int i = 1; i <= numberIWantToKnowIfItsPrime; i++) {

        if (numberIWantToKnowIfItsPrime % i == 0){
            counter++;
        }
    }
    if (counter <= 2) {
        return true;
    }
    counter = 0;
    return false;
    }

    public static void primePrinter(){

        for (int i = 1; i <= 100; i++) {

            if (itsPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("All prime numbers to 100 are: ");
        primePrinter();

    }
}
