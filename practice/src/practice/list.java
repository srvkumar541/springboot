package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class list {

	public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i = 0;
        System.out.println("enter the length of array");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        System.out.println("enter array elements");
        while(i < len){
            Scanner val = new Scanner(System.in);
            int j = val.nextInt();
            arr.add(j);
            i++;
        }
        System.out.println("Array is ");
        System.out.println(arr);
        System.out.println("For inserting insert position and element");
        Scanner z = new Scanner(System.in);
        int pos = z.nextInt();
        Scanner w = new Scanner(System.in);
        int ele = w.nextInt();
        arr.add(pos,ele);
        System.out.println(arr);
        System.out.println("enter position for deleting the element");
        Scanner t = new Scanner(System.in);
        int del = t.nextInt();
        arr.remove(del);
        System.out.println(arr);
        
	}

}
