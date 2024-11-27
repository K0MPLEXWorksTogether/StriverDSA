class PrintName {
    public static void printName(String name, int n, int i){
        if(i > n){
            return;
        }

        System.out.println(name);
        i++;
        printName(name, n, i);
    }   
    
    public static void main(String[] args) {
        printName("Abhiram", 10, 1);
    }
}
