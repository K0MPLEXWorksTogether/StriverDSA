class PrimeNumber {
    public static boolean primeNumber(int n){
        boolean isPrime = true;
        for(int i = 2; i <= (int)Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }    

    public static void main(String[] args) {
        System.out.println(primeNumber(13));
    }
}
