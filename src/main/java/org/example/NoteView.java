package org.example;

import java.util.List;

import java.util.Scanner;

public class NoteView {
    private Scanner scanner;

    public NoteView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayNote(NoteModel note) {
        System.out.println("ID: " + note.getNoteId() + "\nTitle: " + note.getTitle() + "\nText: " + note.getText() + "\n");
    }

    public void displayNotes(List<NoteModel> noteList) {
        for (NoteModel note : noteList) {
            displayNote(note);
        }
    }

    public String[] getUserInput() {
        String[] userInput = new String[2];

        System.out.print("Enter note title: ");
        userInput[0] = scanner.nextLine();

        System.out.print("Enter note text: ");
        userInput[1] = scanner.nextLine();

        return userInput;
    }
}
