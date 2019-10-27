import java.util.Random;

public class SortingAlgorithms {

    private static void bubbleSort(int[] array) {
        boolean wasChanged = true;
        while (wasChanged) {
            wasChanged = false;
            for (int i = 0; i < array.length - 1; i++) {
                int a = array[i];
                int b = array[i + 1];
                if (b < a) {
                    array[i] = b;
                    array[i + 1] = a;
                    wasChanged = true;
                }
            }
        }
    }

    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int front, int back) {
        int storedFront = front, storedBack = back;
        if (back <= front)
            return;
        int middle = (front + back) / 2;
        int pivot = arr[middle];
        while (front <= back) {
            while (arr[front] < pivot)
                front++;

            while (arr[back] > pivot)
                back--;

            if (front <= back) {
                int temp = arr[front];
                arr[front] = arr[back];
                arr[back] = temp;
                front++;
                back--;
            }
        }

        if (storedFront < back)
            quickSort(arr, storedFront, back);
        if (storedBack > front)
            quickSort(arr, front, storedBack);
    }

    private static void insertionSort(int[] arr) {
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            int j = 0;
            int k = i - j;
            int value = arr[i];
            while (k > 0 && arr[k - 1] > value) {
                arr[k] = arr[k - 1];
                j++;
                k--;
            }
            arr[k] = value;
        }
    }

    private static void outputArray(int[] arr) {
        for (int n : arr)
            System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int[] arr1, arr2, arr3;
        arr1 = new int[55];

        Random r = new Random();
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = r.nextInt(100);

        outputArray(arr1);
        System.out.println();

        arr2 = new int[55];
        System.arraycopy(arr1, 0, arr2, 0, 55);

        arr3 = new int[55];
        System.arraycopy(arr1, 0, arr3, 0, 55);

        int start = (int) System.nanoTime();
        bubbleSort(arr1);
        int end = (int) System.nanoTime();

        System.out.printf("Bubble sorted in %d ns: \n", end - start);
        outputArray(arr1);
        System.out.println();

        start = (int) System.nanoTime();
        quickSort(arr2);
        end = (int) System.nanoTime();

        System.out.printf("Quick sorted in %d ns: \n", end - start);
        outputArray(arr2);
        System.out.println();

        start = (int) System.nanoTime();
        insertionSort(arr3);
        end = (int) System.nanoTime();

        System.out.printf("Insertion sorted in %d ns: \n", end - start);
        outputArray(arr3);
    }
}