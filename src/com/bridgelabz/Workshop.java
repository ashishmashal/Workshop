
package com.bridgelabz;

import java.util.Scanner;

class Student {
    int mark1, mark2, mark3;
    String sub1, sub2, sub3;
    Scanner scanner = new Scanner(System.in);

    public void getdata() {

        System.out.println("Enter 1st Sub name");
        sub1 = scanner.next();
        System.out.println("Enter 1st Sub Marks");
        mark1 = scanner.nextInt();
        System.out.println("Enter 2nd Sub name");
        sub2 = scanner.next();
        System.out.println("Enter 2nd Sub Marks");
        mark2 = scanner.nextInt();
        System.out.println("Enter 3rd Sub name");
        sub3 = scanner.next();
        System.out.println("Enter 3rd Sub Marks");
        mark3 = scanner.nextInt();


    }

}
class Sports extends Student
{
    int mark4;
    String sub4;
     public void getSportsData(){
         getdata();
         Scanner scanner1 = new Scanner(System.in);
         System.out.println("Enter Name for sub4");
         sub4= scanner1.next();
         System.out.println("Enter MArks For Mark4");
         mark4 = scanner1.nextInt();
     }
    public void avgOfsub() {

        System.out.println("Addition of 3 sub");
        int total = mark1 + mark2 + mark3 + mark4;
        System.out.println(total);

        System.out.println("Per of 3 sub");
        int per = total / 4;
        System.out.println(per);
    }
}
 public class Workshop extends Sports{

    public static void main(String[] args) {
        Sports s1 = new Sports();
        s1.getSportsData();
        s1.avgOfsub();


    }
}
