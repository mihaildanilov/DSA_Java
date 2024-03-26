public class Main {
    public static void main(String[] args) {
        int numOfArrays = 4;
        int[][] arrOfRandomArr = new int[numOfArrays][];

        for (int i = 0; i < numOfArrays; i++) {
            int[] tempArray = GenerateArray.randomArrayOfIntegers(1_000);
            arrOfRandomArr[i] = new int[tempArray.length];
            System.arraycopy(tempArray, 0, arrOfRandomArr[i], 0, tempArray.length);
        }
        System.out.println("Bubble Sort");
        Timer.measureExecutionTime(() -> SortingAlgorithms.bubbleSort(arrOfRandomArr[0]));

        System.out.println("Selection Sort");
        Timer.measureExecutionTime(() -> SortingAlgorithms.selectionSort(arrOfRandomArr[1]));


        System.out.println("Insertion Sort");
        Timer.measureExecutionTime(() -> SortingAlgorithms.insertionSort(arrOfRandomArr[2]));

        System.out.println("Quick Sort");
        Timer.measureExecutionTime(() -> SortingAlgorithms.quickSort(arrOfRandomArr[0]));
        PrintArray.printArray(arrOfRandomArr[3]);


        System.out.println("Linear Search");
        Timer.measureExecutionTime(() -> System.out.println("Element found at index: " + SearchAlgorithms.linearSearch(arrOfRandomArr[2], 50)));
        System.out.println("Binary Search");
        Timer.measureExecutionTime(() -> System.out.println("Element found at index: " + SearchAlgorithms.binarySearch(arrOfRandomArr[2], 50)));

    }
}