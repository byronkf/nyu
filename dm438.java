// Java Bubble Sort program - integers
class dm438{
    /* Method to sort the array */
    void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]){
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j]; arr[j] = arr[j+1]; arr[j+1] = temp;
                }
    }
    /* Method to print the array */
    void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    // Driver method
    public static void main(String args[]){
        dm438 myobj = new dm438();
        int array[] = {-47, 34, 9, +8, -8, 11};
        System.out.print("Unsorted array: ");
        myobj.printArray(array);
        myobj.bubbleSort(array);
        System.out.print("  Sorted array: ");
        myobj.printArray(array);
    }
}
