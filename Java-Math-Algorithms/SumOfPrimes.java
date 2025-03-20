public class SumOfPrimes {
    public static void main(String[] args) {
        int count = 0, sum = 0, num = 2;
        while (count < 100) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
            num++;
        }
        System.out.println("Sum of first 100 prime numbers: " + sum);
    }
    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
