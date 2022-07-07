package com.bridgelabz;


import java.util.Arrays;
import java.util.Scanner;

public class Workshop3 {
    public static int search(int[] arr, int a)
    {
        int n=arr.length;
        for(int i=0;i<=n;i++)
        {
            if (arr[i] == a)
               return  i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,10,20};
        Scanner scanner=new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter Element to find");
        int x= scanner.nextInt();
        int res = search(arr , x);
        if(res == -1)
        {
            System.out.println("Element not present ");
        }
        else
            System.out.println("Element Present at " + res);

    }
}

//2,5,7,8,10,20
//
//10