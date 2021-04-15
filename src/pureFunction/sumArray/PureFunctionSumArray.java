package pureFunction.sumArray;

public class PureFunctionSumArray {
    public static void main(String[] args) {
        int[] arr0 = {3, 4, 5, 6, 7};
        int[] arr1 = {2, 3, -2, -4};
        int[] arr2 = {-4, -5, -6};

        System.out.println(pureSumArray(arr0, arr0.length));
        System.out.println(pureSumArray(arr1, arr1.length));
        System.out.println(pureSumArray(arr2, arr2.length));
    }

    public static int pureSumArray (int[] arr, int size) {
        return size <= 0 ? 0 : pureSumArray(arr, size-1) + arr[size-1];
    }
}
