// Java Bubble Sort program - strings
class dm440{
    /* Method to sort the array */
    void bubbleSort(String arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j].compareTo(arr[j+1])>0){
                    // swap arr[j+1] and arr[j]
                    String temp = arr[j]; arr[j] = arr[j+1]; arr[j+1] = temp;
                }
    }
    /* Method to print the array */
    void printArray(String arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    // Driver method
    public static void main(String args[]){
        dm440 myobj = new dm440();
        String array[] = {"-47"," 34","9","+8","-8","1.1"};
        System.out.print("Unsorted array: ");
        myobj.printArray(array);
        myobj.bubbleSort(array);
        System.out.print("  Sorted array: ");
        myobj.printArray(array);
    }
}
