import java.util.*;
public class bubble {

    public static void sort(int arr[]) {
        int n = arr.length;

        for (int turns = 0; turns < n - 1; turns++) {
            for (int j = 0; j < n - 1 - turns; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " is " + arr[i]);
        }
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 2, 3, 1};
        sort(arr);
    }
}
