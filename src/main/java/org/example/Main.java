package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    NoteView view = new NoteView();
    NoteController controller = new NoteController(view);
    Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("\n1. Add Note");
        System.out.println("2. Edit Note");
        System.out.println("3. Delete Note");
        System.out.println("4. Show Notes");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                String[] userInput = view.getUserInput();
                controller.addNote(userInput[0], userInput[1]);
                break;
            case 2:
                System.out.print("Enter note ID to edit: ");
                int noteIdToEdit = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                String[] editedNote = view.getUserInput();
                controller.editNote(noteIdToEdit, editedNote[0], editedNote[1]);
                break;
            case 3:
                System.out.print("Enter note ID to delete: ");
                int noteIdToDelete = scanner.nextInt();
                controller.deleteNote(noteIdToDelete);
                break;
            case 4:
                controller.showNotes();
                break;
            case 5:
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    }
}