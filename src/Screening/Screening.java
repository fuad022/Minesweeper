package Screening;

public class Screening {
    public static void main(String[] args) {
        int N = 100;
        Primes primes = new Primes(N);
        for(int i = 0; i < N; i++) {
            if (primes.check(i)) {
                System.out.println(i + " ");
            }
        }
    }
}
