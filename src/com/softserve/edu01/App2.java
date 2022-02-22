package com.softserve.edu01;

public class App2 {
    private int i = 123; // = 0; by default

//    public App2(int k) {
//        System.out.println("Constructor k = " + k);
//    }

    public void myPrint() {
        System.out.println("myPrint() i = " + i); // i.toString()
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        // i = 12; // Error
        int i = 456;
        // int i;
        //
        App2 app = new App2(); // Call Constructor
        App2 app2 = new App2(); // Call Constructor
        app2.i = 321;
        System.out.println("app.i = " + app.i);    // 123
        System.out.println("app2.i = " + app2.i);  // 321
        System.out.println("i = " + i);
        app.myPrint(); // 123
        app2.myPrint(); // 321
        //app2 = null;
        //
        i = 49;
        System.out.println("i = " + i); // 49
        System.out.println("(char) i = " + (char) i); // 1
    }

}
