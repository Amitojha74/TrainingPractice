import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateFromArray {

    public static void main(String[] args) {

        int arr[] = {1,4,5,4,4,4,5,5,3,3,2,2,2,23,3,3,2,2,3,4,};
        HashSet<Integer> set = new HashSet<Integer>();

        System.out.print("Original Array: [");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+",");
        System.out.print("]");

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println();
        System.out.print("After Remove duplicate element from Array: ");
        System.out.print(set);
    }
}
