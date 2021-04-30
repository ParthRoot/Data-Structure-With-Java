package Data_Structure;

import java.util.*;

public class linear_search {
    public static void main(String[] args) {
        // create scanner class object
        Scanner sc = new Scanner(System.in);

        // user input for size of array
        System.out.println("Enter the array size here:");
        int n = sc.nextInt();

        // declare the array
        int a[] = new int[10];

        // user input for array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        while (true) {
            //user input for searching element
            System.out.println("Enter the searching element here:");
            int s = sc.nextInt();

            // create object of this class
            linear_search p = new linear_search();
            p.ls(a, s, n);
        }
    }

    void ls(int[] a1, int s1, int n1) {
        int flag = 0;
        for (int j = 0; j < a1.length; j++) {
            if (a1[j] == s1) {
                flag = 1;
                System.out.println("Search Successfully, Searching element found at " + (j+1) + " position");
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Element not found in this array");
        }
    }
}
