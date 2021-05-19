package com.antonti.java.innerNestedClasses;

public class MyTest2 {
    public String outerField = "Test class 2 (outer)";

    public static class MyNested {
        public String nestedField = "Test class 2 (nested)";

        public void nestedShow() {
            System.out.println(nestedField);
        }

    }

    public void show() {
        System.out.println(outerField);
    }

}
