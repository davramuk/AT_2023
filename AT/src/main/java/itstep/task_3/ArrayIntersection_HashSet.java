package itstep.task_3;

import java.util.*;

// Варіант 6
// Array Intersection: Write a Java program that takes two arrays of integers
// and finds their intersection. Your program should prompt the user to enter the size
// and the elements of both arrays, and then output the common elements between them.

// Make HashSet of doubles from the result array and performs the following operations:
// a)Add an element to the end of the list; b)Remove an element from the list;
// c)Replace an element in the list; d)Sort the list in alphabetical order;
// e)Print the elements of the list;
// Make up the situation for NumberFormatException.
// Catch it and display the explanation for your custom case.


public class ArrayIntersection_HashSet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int sizeArr1 = scan.nextInt();

        int[] arr1 = new int[sizeArr1];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < sizeArr1; i++) {
            arr1[i] = scan.nextInt();
        }

        System.out.println("Enter the size of the second array: ");
        int sizeArr2 = scan.nextInt();

        int[] arr2 = new int[sizeArr2];
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < sizeArr2; i++) {
            arr2[i] = scan.nextInt();
        }
    }
}
