package FullStack;
import java.util.*;

public class RearrangeArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements!");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " Numbers!");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       
        int posCount = 0, negCount = 0;
        for (int num : arr) {
            if (num >= 0) posCount++;
            else negCount++;
        }

       
        int positives[] = new int[posCount];
        int negatives[] = new int[negCount];

        int pi = 0, ni = 0;
        for (int num : arr) {
            if (num >= 0) positives[pi++] = num;
            else negatives[ni++] = num;
        }

      
        int i = 0, p = 0, ne = 0;
        while (p < posCount && ne < negCount) {
            arr[i++] = positives[p++];
            arr[i++] = negatives[ne++];
        }

   
        while (p < posCount) {
            arr[i++] = positives[p++];
        }

      
        while (ne < negCount) {
            arr[i++] = negatives[ne++];
        }

       
        System.out.print("Array after Rearrange: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}


