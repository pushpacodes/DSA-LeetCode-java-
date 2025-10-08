public class subarraysum {
    public static void pairs(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) { // include i itself
                int end = j;
                int sum = 0; // initialize sum for each subarray

                // print elements of the subarray and calculate sum
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }

                // print subarray sum
                System.out.println(" Its Sum = " + sum);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        pairs(numbers);
    }
}
