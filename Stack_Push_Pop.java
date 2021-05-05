package Data_Structure;

import java.util.Scanner;


public class Stack_Push_Pop {


    public static void main(String[] args) {
        //object of scanner class
        Scanner sc = new Scanner(System.in);

        //size of array and inserting or deleting element
        int n, ins;
        int f = -1, r = -1; // f is front pointer, r is rear pointer
        int ch; //select operation

        //initialize the size of array
        System.out.println("Enter the size of array: ");
        n = sc.nextInt();

        //Declare array
        int a[] = new int[n];
        while (true) {
            //selecting operation
            System.out.println("Enter the operation here:\n1.Push, 2.Pop, 3.Display");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Perform Push Operation: ");
                    System.out.println("Enter the element you want to insert in this stack: ");
                    ins = sc.nextInt();
                    if (r == n-1) {
                        System.out.println("Stack is Overflow");
                    } else {
                        if (f == -1) {
                            f = 0;
                        }
                        r += 1;
                        System.out.println(r);
                        a[r] = ins;
                    }
                    break;
                case 2:
                    System.out.println("Perform Pop Operation: ");
                    System.out.println("Enter the element you want to delete in this stack: ");
                    ins = sc.nextInt();
                    if(f == -1 || f > r){
                        System.out.println("Stack is underflow");
                    }
                    else{
                        System.out.println(r+" Deleted Succesfully");
                        r -= 1;
                    }
                    break;
                case 3:
                    System.out.println("Perform Display Operation: ");
                    for (int i = f; i <= r; i++) {
                        System.out.print(a[i] + " ");
                    }
                    System.out.println("");
                    break;

                default:
                    System.out.println("Wrong Choice");
            }
        }


    }

}
