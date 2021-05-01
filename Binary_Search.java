package Data_Structure;

import java.util.*;

public class Binary_Search {
    public static void main(String[] args) {
        //create object of current class
        Binary_Search bs = new Binary_Search();

        //scanner class object
        Scanner sc = new Scanner(System.in);

        //array size by user
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        //array declaration
        int a[] = new int[n];

        //array initialization by user
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        //search element by user
        System.out.print("Enter the element you want to search: ");
        int s = sc.nextInt();

        //call sort method
        bs.sort(a);

//        //call print_array
//        bs.print_array(a);

        //call binary_Search Function
        bs.binary_Search(a, s);

    }

    //Binary_Search function
    void binary_Search(int arr[],int s) {
        int low = 0, high = arr.length-1, mid , flag = 0;

        while(low<=high){
            mid = (high - low) / 2;
            if(s > arr[mid]){
                low = mid + 1;
            }
            else if(s < arr[mid]){
                high = mid - 1;
            }
            else{
                flag = 1;
                System.out.println("Search Successfully, and searching element found "+ mid +" position");
                break;
            }

        }

        if(flag == 0){
            System.out.println("Searching element not found");
        }

    }

    //sorting array in ascending order
    void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

//
//    //print array
//    void print_array(int arr[]){
//        for(int i=0; i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//
//    }


}
