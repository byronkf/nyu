// Java Bubble Sort program - floats
class dm439{
    /* Method to sort the array */
    void bubbleSort(float arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]){
                    // swap arr[j+1] and arr[j]
                    float temp = arr[j]; arr[j] = arr[j+1]; arr[j+1] = temp;
                }
    }
    /* Method to print the array */
    void printArray(float arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    // Driver method
    public static void main(String args[]){
        dm439 myobj = new dm439();
        float array[] = {-47f, 34f, 9f, +8f, -8f, 1.1f};
        System.out.print("Unsorted array: ");
        myobj.printArray(array);
        myobj.bubbleSort(array);
        System.out.print("  Sorted array: ");
        myobj.printArray(array);
    }
}
