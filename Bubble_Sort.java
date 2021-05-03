package Data_Structure;

import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {

        //object of scanner class
        Scanner sc = new Scanner(System.in);

        //declare the size of array
        int n;

        // declare the array
        int a[] = new int[10];

        // initialize the size of array by user
        System.out.println("Enter the size of array: ");
        n = sc.nextInt();

        // initialize the array element by user
        System.out.println("Enter the array element: ");
        for(int i=0; i<=n;i++){
            a[i] = sc.nextInt();
        }

        //bubble_sort method call
        bubble__Sort(a,n);

        //display_Array method call
        display_Array(a,n);


    }


    // method for bubble sort algorithm
    static void bubble__Sort(int arr[], int n) {
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j<=n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // method for display array
    static void display_Array(int arr[],int n){
        System.out.print("Display Sorting Array: ");
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
