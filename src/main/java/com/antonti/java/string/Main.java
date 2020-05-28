package com.antonti.java.string;

public class Main {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String(); // empty string
        String str3 = ""; // empty string
        String str4 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        String str5 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);

        System.out.println(str1); // Java
        System.out.println(str2); //
        System.out.println(str3); //
        System.out.println(str4); // hello
        System.out.println(str5); // come (3 - start index, 4 - characters)
        System.out.println(str1.length()); // 4 (length of the string)

        if (str3.isEmpty()) {
            System.out.println("String is empty");
        } else System.out.printf("String str3 has %d symbols", str3.length());

        if (str3 != null && str3.length() == 0) {
            System.out.println("String is empty");
        }

        // toCharArray()
        char[] arr = str1.toCharArray();
        System.out.println(arr[2]); // v

        // String Concatenation
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);// John Doe
        System.out.println(firstName.concat(lastName)); // JohnDoe
        String nickName = firstName + 777;
        System.out.println(nickName); // John777
        String name = String.join("_", firstName, lastName); // John_Doe
        System.out.println(name);

        // charAt(int index)
        String str6 = "Java";
        char c = str6.charAt(2);
        System.out.println(c); // v

        // getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        String str7 = "Hello world!";
        int start = 6;
        int end = 11;
        char[] dst = new char[end - start];
        str7.getChars(start, end, dst, 0);
        System.out.println(dst); // world

        // equals(), equalsIgnoreCase()
        String str8 = "Hello";
        String str9 = "hello";
        System.out.println(str8.equals(str9)); // false
        System.out.println(str8.equalsIgnoreCase(str9)); // true

        // regionMatches()
        String str10 = "Hello world";
        String str11 = "I work";
        boolean result = str10.regionMatches(6, str11, 2, 3);
        System.out.println(result); // true

        // int compareTo(String str), int compareToIgnoreCase(String str)
        String str12 = "hello";
        String str13 = "world";
        String str14 = "hell";
        System.out.println(str12.compareTo(str13)); // -15 (str12 < str13)
        System.out.println(str12.compareTo(str14)); // 1 (str12 > str14)

        // indexOf(), lastIndexOf()
        String str15 = "Hello world";
        int index1 = str15.indexOf('l'); // 2
        int index2 = str15.indexOf("wo"); //6
        int index3 = str15.lastIndexOf('l'); //9

        // startsWith(), endsWith()
        String str16 = "myfile.exe";
        boolean start_ = str16.startsWith("my"); //true
        boolean end_ = str16.endsWith("exe"); //true

        // replace()
        String str17 = "Hello world";
        String replStr1 = str17.replace('l', 'd'); // Heddo wordd
        String replStr2 = str17.replace("Hello", "Bye"); // Bye world

        // trim()
        String str18 = "  hello world  ";
        str18 = str18.trim(); // hello world

        // substring()
        String str19 = "Hello world";
        String substr1 = str19.substring(6); // world
        String substr2 = str19.substring(3, 5); // lo

        // toLowerCase(), toUpperCase()
        String str20 = "Hello World";
        System.out.println(str20.toLowerCase()); // hello world
        System.out.println(str20.toUpperCase()); // HELLO WORLD

        // split()
        String text = "FIFA will never regret it";
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

    }
}
