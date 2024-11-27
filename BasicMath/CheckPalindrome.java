class CheckPalindrome {
    public static int reverse(int n){
        int reverse = 0;

        while(n > 0){
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }

        return reverse;
    }
    
    public static void main(String[] args) {
        int n = 10;
        int reverse = reverse(n);

        if(n == reverse){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
