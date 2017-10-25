package com.kitcenter.runners.homework.lesson16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HometaskLesson16PhoneBookRunner {

    Set<String> categories = new HashSet();

    Scanner input = new Scanner(System.in);
    HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();

    public void menu() {
        while (true) {
            System.out.println("-----------Welcome to PhoneBook.-------------");
            System.out.println("Chouse your option .");
            System.out.println("1. Add New Contact " + "\n" +
                    "2. Search Number " + "\n" +
                    "3. Delete Number" + "\n" +
                    "4. Show All contact" + "\n" +
                    "5. Exit");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    addContact();
                    break;
                case 2:
                    searchNumber();
                    break;
                case 3:
                    deleteNumber();
                    break;
                case 4:
                    showAll();
                    break;
                case 5:
                    System.out.println("Thank you for using PhoneBook ....");
                    System.exit(0);

            }
        }
    }

    private void deleteNumber() {
        System.out.println("Enter The name to Delete : ");
        String name = input.next();
        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
            System.out.printf("The number of %s is Removed%n", name);
        } else {
            System.out.printf("The number of %s is not present%n", name);
        }
    }

    private void searchNumber() {
        System.out.println("Enter The Name : ");
        String name = input.next();
        System.out.println(phoneBook.containsKey(name) ? "The Number of " + name + " is : " + phoneBook.get(name) : "The Number Not Present ");
    }

    private void showAll() {
        for (String name : phoneBook.keySet()) {
            if (name != null) {
                System.out.println(name + " " + phoneBook.get(name));
            } else System.out.println("No Nunmber present in database.");
        }
    }

    private void addContact() {
        System.out.print("Enter the Name : ");
        String name = input.next();
        System.out.print("Enter the number : ");
        double num = input.nextDouble();
        int number = (int) num;
        phoneBook.put(name, number);
        System.out.println("Number Added Successfully ..");
    }

    public String printCategories() {
        System.out.println(categories.toString());
        System.out.println("Create categories and enter it again to enter the category:");
        return categories.toString();
    }

    public void addToCategory(String newCat) {
        categories.add(newCat);
        System.out.println(categories);

    }

    public void pickCategory(String existedCat) {
        if (categories.contains(existedCat)) {
            System.out.println("You choosed: " + existedCat);
            System.out.println(phoneBook);
        }
    }


    public static void main(String[] args) {

        HometaskLesson16PhoneBookRunner tel = new HometaskLesson16PhoneBookRunner();
        tel.printCategories();
        Scanner sc = new Scanner(System.in);
        boolean choosingCategory = true;

        while (choosingCategory) {
            String newCategory = sc.nextLine();
            if (tel.categories.contains(newCategory)) {
                tel.pickCategory(newCategory);
                break;
            } else {
                tel.addToCategory(newCategory);
            }
        }

        tel.menu();

    }

}
