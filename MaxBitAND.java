public class MaxBitAND {
    static int MaxValue(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int bitwiseAnd = arr[i] & arr[j];
                if (max < bitwiseAnd) {
                    max = bitwiseAnd;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 8, 10, 12 };
        int res = MaxValue(arr);
        System.out.println(res);
    }
}