package com.antonti.java.enumType;

public class Main {
    public static void main(String[] args) {

        Day current = Day.MONDAY;
        System.out.println(current);    // MONDAY

        Book b1 = new Book("War and Peace", "L. Tolstoy", Type.BELLETRE);
        System.out.printf("Book '%s' has a type %s\n", b1.name, b1.bookType);//Book 'War and Peace' has a type BELLETRE
        switch (b1.bookType) {
            case BELLETRE:
                System.out.println("Belletre"); //Belletre
                break;
            case SCIENCE:
                System.out.println("Science");
                break;
            case SCIENCE_FICTION:
                System.out.println("Science fiction");
                break;
            case PHANTASY:
                System.out.println("Phantasy");
                break;
        }

        Type[] types = Type.values();
        for (Type s : types) {
            System.out.println(s); //returns array of all enumeration constants
        }

        System.out.println(Type.BELLETRE.ordinal());    // 1

        System.out.println(Color.RED.getCode());        // #FF0000
        System.out.println(Color.GREEN.getCode());      // #00FF00

        Operation op = Operation.SUM;
        System.out.println(op.action(10, 4));   // 14
        op = Operation.MULTIPLY;
        System.out.println(op.action(6, 4));    // 24


    }
}
