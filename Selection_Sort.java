package Data_Structure;

import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        // object of scanner class
        Scanner sc = new Scanner(System.in);

        //size of array
        int n;

        //initialize size of array
        System.out.println("Enter the size of array: ");
        n = sc.nextInt();

        // declare array here
        int a[] = new int[n];

        //initialize the array
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        //call selection__Sort method
        selection__Sort(a, n);

        //call display_Array method
        display_Array(a);


    }

    static void selection__Sort(int arr[], int n) {
        int s;
        for(int i=0;i<arr.length;i++){
            s = arr[i];
            for(int j=i+1;j< arr.length;j++){
                if(s>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    static void display_Array(int a[]) {
        System.out.print("Array After Sorting: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
