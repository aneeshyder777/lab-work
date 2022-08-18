//Program to group students into four groups according to roll number.

import java.util.*; //imports required libraries. 


class GroupingStudents {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter Your Roll No. ");  
        int a= sc.nextInt();// taking input
        Sapphire(a);
        Perl(a);
        Ruby(a);
        Emerald(a);
    }
    // logic for sapphire group
    public static void Sapphire(int a){
        for (int i = 1; i < 100; i+=4) {
            if(a==i){
                System.out.println(a+" is in Sapphire group");
            }
        }
    }
    // logic for Pearl group
    public static void Perl(int a){
        for (int i = 2; i < 100; i+=4) {
            if(a==i){
                System.out.println(a+" is in Perl group");
            }
        }
    }
    // logic for Ruby group
    public static void Ruby(int a){
        for (int i = 3; i < 100; i+=4) {
            if(a==i){
                System.out.println(a+" is in Ruby group");
            }
        }
    }
    // logic for Emerald group
    public static void Emerald(int a){
        for (int i = 4; i < 100; i+=4) {
            if(a==i){
                System.out.println(a+" is in Emerald group");
            }
        }
    }
}