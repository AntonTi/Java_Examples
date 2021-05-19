package com.antonti.java.innerNestedClasses;

public class Main {

    public static void main(String[] args) {

        //Inner
        MyTest myTest = new MyTest();
        myTest.show();
        MyTest.MyInner inner = myTest.new MyInner();
        inner.innerShow();
        System.out.println("~~~~~~~~~~~~~~~~");

        //Nested
        MyTest2.MyNested nested = new MyTest2.MyNested();
        nested.nestedShow();

    }


}
