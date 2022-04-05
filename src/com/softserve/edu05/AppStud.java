package com.softserve.edu05;

public class AppStud {
    
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 25);
        Student st2 = new Student("Ivan", 25);
        //
        //f (st1 == st2) {
        if ( st1.equals(st2) ) {
            System.out.println("Equal");
        } else {
            System.out.println("NOT Equal");
        }
        System.out.println("st1 = " + st1); // st1.toString()
        System.out.println("st2 = " + st2.toString());
        //
        System.out.println("st1.hashCode() = " + st1.hashCode());
        System.out.println("st2.hashCode() = " + st2.hashCode());
    }
}
