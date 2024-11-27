class Palindrome {
    public static boolean palindrome(String str, int left, int right){
        if(left < right){
            if(str.charAt(left) == str.charAt(right)){
                palindrome(str, left + 1, right - 1);
            }
            else{
                return false;
            }
        }

        return true;
    }    

    public static void main(String[] args) {
        System.out.println(palindrome("madam", 0, 4));
    }
}
