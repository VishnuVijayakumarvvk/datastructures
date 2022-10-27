package com.company;
import java.util.Scanner;
public class Main {
    private static TodoFunction myTodo = new TodoFunction();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        guide();
        int command = 0;
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter the command: ");
            command = sc.nextInt();
            sc.nextLine();
            switch (command) {
                case 1:
                    guide();
                    break;
                case 2:
                    myTodo.display();
                    break;
                case 3:
                    add();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    size();
                    break;
                case 6:
                    update();
                    break;
                case 7:
                    search();
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Please enter a valid command:)");
            }
        }
    }

    public static void guide() {
        System.out.println("\n Command: " +
                "\n 1-Display the guide book" +
                "\n 2-Print the full todo list" +
                "\n 3-Add Task in the list" +
                "\n 4-Remove task in the list" +
                "\n 5-Print the size" +
                "\n 6-update the list" +
                "\n 7-search for each task" +
                "\n 8-Exit from the app");
    }

    public static void add() {
        System.out.println("Enter the Task to be entered: ");
        String task = sc.nextLine();
        myTodo.add(task);
        System.out.println("Task added");
    }

    public static void remove() {
        System.out.println("Enter the task to be removed: ");
        int index = sc.nextInt();
        myTodo.remove(index + 1);
        System.out.println("Task Removed");
    }

    public static void size() {
        myTodo.size();
    }

    public static void update() {
        System.out.println("Enter the task: ");
        String list = sc.nextLine();
        System.out.println("Enter the position to be inserted: ");
        int index = sc.nextInt();
        myTodo.update(index, list);
        System.out.println("Task updated");
    }

    public static void search() {
        System.out.println("Enter the String to be Searched: ");
        String task = sc.nextLine();
        if (myTodo.search(task) == null) {
            System.out.println("The item is not found in the list");
        } else {
            System.out.println(myTodo.search(task));
        }
    }
}


