import java.util.ArrayList;

class Divisors {
    public static ArrayList<Integer> divisors(int n){
        ArrayList<Integer> divisors = new ArrayList<>();
        
        for(int i = 1; i <= (int)Math.sqrt(n); i++){
            if(n % i == 0){
                divisors.add(i);

                if(i != n / i){
                    divisors.add(n / i);
                }
            }
        }

        return divisors;
    }

    public static void main(String[] args) {
        ArrayList<Integer> answer = divisors(100);
        for(int num : answer){
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
}
