package StatsLibrary;


public class StatsLibrary {
    public double getMean(int [] userInputNumbers){
        int total = 0;
        for(int singleNumber: userInputNumbers){
            total = total + singleNumber;
        }
        double result = (double)total/ userInputNumbers.length;
        return result;
    }

    public double getMode(int [] userInputNumbers, int n) {
        int maxValue = 0;
        int maxCount = 0;
        for(int i = 0; i<n;i++){
            int count = 0;
            for(int j = 0; j<n; j++){
                if(userInputNumbers[j] == userInputNumbers[i]){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount = count;
                maxValue = userInputNumbers[i   ];
            }
        }
        return maxValue;

    }

    public double median(int [] userInputNumbers) {
        int x = userInputNumbers.length;
        double result = 0;
        for (int i = 0; i < userInputNumbers.length; i++) {
            if (x % 2 != 0) {
                return userInputNumbers[x/ 2];
            } else {
                int middle1 = userInputNumbers[(x / 2)];
                int middle2 = userInputNumbers[(x / 2) - 1];
                result = (double) (middle1 + middle2) / 2;
                return result;
            }

        }
        return result;
    }

    public double standardDeviation(int [] userInputNumbers){
        //square root varience to get standard deviation
        return Math.sqrt(varience(userInputNumbers));
    }
    // When P(Y = y)
    public double geometricDistribution(double p, double y){
        double q = 1-p;
        double result = Math.pow(q,y-1)*p;
        return result;
    }
    //When P(Y >= y)
    public double geometricDistribution2(double p){
        double q = 1-p;
        double result = 1-p-q*p;
        return result;
    }
    public double binomialDistribution(double p, double n, double y){
        //q is always equal to 1-p which is the probability of fails
        double q = 1-p;
        double result = combination((int)n,(int)y) * Math.pow(p,y)*Math.pow(q,n-y);
        return result;
    }
    public double factorial(int n){
        double result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
    public double permutations(int n, int r){
        double result = factorial(n) / factorial(n-r);
        return result;
    }
    public double combination(int n, int r){
        double result = factorial(n)/(factorial(r)*factorial(n-r));
        return result;
    }
    public double varience(int [] userInputData){
        double mean = getMean(userInputData);
        double sumSquaredDifferences = 0;
        for(double singleNumber: userInputData){
            sumSquaredDifferences += Math.pow(singleNumber - mean, 2);
        }
        return sumSquaredDifferences / userInputData.length;
    }
    public double hyperGeo(int N,int n,int y,int r){
        int result = (int) ((combination(r,y) * combination(N-r,n-y))/combination(N,n));
        return result;
    }
    public double negbinomial(int p, int y, int r){
        int q = 1-p;
        double result = combination(y-1,r-1)*Math.pow(p,r)*Math.pow(q,y-r);
        return result;
    }
}
