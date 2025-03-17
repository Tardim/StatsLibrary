package StatsLibrary;

import MonteHall.ThreeDoors;

public class Main {

    public static void main(String[] args) {
        StatsLibrary test = new StatsLibrary();
        ThreeDoors test2 = new ThreeDoors();
        int[] someNumbers = {1, 2, 4, 5, 5};
        /*
        System.out.println(test2.montyHall());
         */


        System.out.println("Mean: " + test.getMean(someNumbers));
        System.out.println("median: " + test.median(someNumbers));
        System.out.println("Mode: " + test.getMode(someNumbers, 5));
        System.out.println("factorial: " + test.factorial(5));
        System.out.println("Permutation: " + test.permutations(5, 4));
        System.out.println("combination: " + test.combination(5, 3));
        System.out.println("Geometric Distribution(P(Y>=y): " + test.geometricDistribution2(.5));
        System.out.println("Geometric Distribution(P(Y=y): " + test.geometricDistribution(.3, 5));
        System.out.println("Binomial Distribution: " + test.binomialDistribution(.8, 10, 7));
        System.out.println("Standard Deviation: " + test.standardDeviation(someNumbers));
        System.out.println("HyperGeometric Distribution: "+ test.hyperGeo(20,10,15,5));
        System.out.println("Negative Binomial Distribution: " + test.negbinomial((int) 0.2,5,3));
    }
}

