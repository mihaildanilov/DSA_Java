public class SearchAlgorithms {
    public static int linearSearch(int[] arr, int valueToFind) {
        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i] == valueToFind) {
                System.out.println("Steps taken by linear search: " + steps);
                return i;
            }
        }
        System.out.println("Steps taken by linear search: " + steps);
        return -1;
    }

    public static int binarySearch(int[] arr, int valueToFind) {
        int left = 0;
        int right = arr.length - 1;
        int steps = 0;
        while (left <= right) {
            steps++;
            int middle = left + (right - left) / 2;
            if (arr[middle] == valueToFind) {
                System.out.println("Steps taken by linear search: " + steps);
                return middle;
            } else if (arr[middle] < valueToFind) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
