package com.antonti.java.innerNestedClasses;

public class MyTest {
    public String outerField = "Test class (outer)";

    public class MyInner {
        public String innerField = "Test class (inner)";

        public void innerShow() {
            System.out.println(innerField);
        }

    }

    public void show() {
        System.out.println(outerField);
    }

}
