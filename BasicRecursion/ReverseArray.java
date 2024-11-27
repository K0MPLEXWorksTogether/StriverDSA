class ReverseArray {
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr, int left, int right){
        if(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            reverseArray(arr, left + 1, right - 1);
        }
    }    

    public static void main(String[] args) {
        int[] sample = {1, 2, 3, 4, 5};
        reverseArray(sample, 0, 4);
        printArray(sample);
    }
}
