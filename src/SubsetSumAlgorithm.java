public class SubsetSumAlgorithm {
    private static boolean hasSubsetSumEqualToTarget(int[] arr, int target) {
        return doSummation(arr, target, arr.length);
    }

    private static boolean doSummation(int[] arr, int target, int length) {
        for (int i = length - 1; i >= 0; i--) {
            if (arr[i] == target)
                return true;
            if (arr[i] < target)
                if (doSummation(arr, target, i))
                    return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 3, 4, 15};
        int n = 7;
        System.out.println(hasSubsetSumEqualToTarget(array, n));
    }
}
