class PrintFromN {
    public static void printFromN(int n){
        if(n < 1){
            return;
        }

        System.out.printf("%d ", n);
        printFromN(n - 1);
    } 
    
    public static void main(String[] args) {
        printFromN(10);
        System.out.println();
    }
}
