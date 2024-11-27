class PrintToN {
    public static void printToN(int n, int count){
        if(count > n){
            return;
        }
        System.out.printf("%d ", count);
        count++;
        printToN(n, count);
    }   
    
    public static void main(String[] args) {
        printToN(10, 1);
        System.out.println();
    }
}
