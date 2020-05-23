package com.antonti.java.bufferedrw;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        //write to file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("file_1.txt"))) {
            String text = "Hello  World!\nHey! Teachers! Leave them kids alone.\n";
            bw.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //read from file to console (reading character by character)
        try (BufferedReader br = new BufferedReader(new FileReader("file_1.txt"))) {
            int c;
            while ((c = br.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //read from file to console (reading line by line)
        try (BufferedReader br = new BufferedReader(new FileReader("file_1.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //read from console to file
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("file_2.txt"))) {
            String text;
            while (!(text = br.readLine()).equals("ESC")) {
                bw.write(text + "\n");
                bw.flush();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //read from console, output to console
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter your name: ");
            String name = reader.readLine();
            System.out.println("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());
            System.out.println("Enter your height: ");
            double height = Double.parseDouble(reader.readLine());
            System.out.printf("Your name: %s, Your age: %d, Your height: %.2f\n", name, age, height);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
