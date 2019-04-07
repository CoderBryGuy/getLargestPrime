package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(45));
    }

    static public int getLargestPrime(int number){
        if(number < 2)
            return -1;

       boolean isPrimeFactor = true;
       boolean numberIsPrime = true;


        for (int i = number/2; i > 1 ; i--) {
            System.out.println("i = " + i);

            if(number % i == 0){
                isPrimeFactor = true;

                numberIsPrime = false;


                for (int j = i - 1; j > 1 ; j--) {
                    System.out.println("j = " + j);

                    if(i % j == 0) {
                        isPrimeFactor = false;
                    }

                }

                if(isPrimeFactor)
                    return  i;


            }
        }

        if(numberIsPrime)
            return number;

        return -1;
    }
}
