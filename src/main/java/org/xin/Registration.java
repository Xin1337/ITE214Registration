package org.xin;

import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;

public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> students = new LinkedList<String>();

        int copium;
        String names;
        String found;

        while (true) {
            System.out.println("Student Registration");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Remove student");
            System.out.println("4. Exit");

            copium = sc.nextInt();

            switch (copium){
                case 1:
                    System.out.print("Enter Student Name: ");
                    names = sc.next();
                    if (students.contains(names))
                    {
                        System.out.println(names + " is already in the list.");
                    } else {
                        students.add(names);
                        System.out.println(names + " has been successfully added.");
                    }
                    break;

                case 2:
                if (students.size() == 0)
                {
                    System.out.println("List is empty");
                } else {
                    System.out.println(Arrays.toString(new LinkedList[]{students})
                            .replace("[", "")
                            .replace("]", ""));
                }
                    break;

                case 3:
                    System.out.println("Enter Student name: ");
                    found = sc.next();
                    if (students.contains(found))
                    {
                        students.remove(found);
                        System.out.println(found + " has been removed");
                    } else {
                        System.out.println(found + " isn't on the list yet");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("This is not a valid option! Please select another");
                    break;
            }
        }
    }
}