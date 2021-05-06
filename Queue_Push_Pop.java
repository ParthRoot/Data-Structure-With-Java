package Data_Structure;

import java.util.Scanner;

public class Queue_Push_Pop {
    public static void main(String[] args) {

        //create object of scanner class
        Scanner sc = new Scanner(System.in);

        //declare n for size of array
        int n;

        //initialize the size of array
        System.out.println("Enter ths size of array here: ");
        n = sc.nextInt();

        //declare array
        int a[] = new int[n];

        // declare ch for user choice operarion
        int ch;

        int f = -1, r = -1, ins;

        while (true) {
            // initialize of user choice
            System.out.println("Enter your choice: 1.Push 2.Pop 3.Display");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Perform Push Operation: ");

                    if (f == n - 1) {
                        System.out.println("Queue is overflow");
                    } else {
                        if (f == -1) {
                            f = 0;
                        }
                        System.out.println("Enter the element you want to insert in queue: ");
                        ins = sc.nextInt();
                        r += 1;
                        a[r] = ins;

                    }

                    break;
                case 2:
                    System.out.println("Perform Pop Operation: ");
                    if(f == -1 || f > r){
                        System.out.println("Stack is underflow");
                    }
                    else{
                        System.out.println(a[f]+" Deleted Successfully");
                        f += 1;

                    }
                    break;
                case 3:
                    System.out.println("Display Queue: ");
                    for (int i = f; i <= r; i++) {
                        System.out.print(a[i] + " ");
                    }
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("NOT FOUND ANY OPERATION...........!");
            }
        }
    }
}
