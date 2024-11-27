class ArmstrongNumber {
    public static int countDigits(int n){
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }

        return count;
    }

    public static boolean armstrongNumber(int n){
        int count = countDigits(n);
        int armstrong = 0;
        int copy = n;

        while(n > 0){
            int rem = n % 10;
            armstrong += Math.pow(rem, count);
            n /= 10;
        }

        if(armstrong == copy){
            return true;
        }
        return false;
    }    

    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
    }
}
