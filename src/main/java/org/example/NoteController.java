package org.example;

import java.util.ArrayList;
import java.util.List;

public class NoteController {
    private List<NoteModel> notes;
    private NoteView view;

    public NoteController(NoteView view) {
        this.notes = new ArrayList<>();
        this.view = view;
    }

    public void addNote(String title, String text) {
        int noteId = notes.size() + 1;
        NoteModel newNote = new NoteModel(noteId, title, text);
        notes.add(newNote);
    }

    public void editNote(int noteId, String title, String text) {
        for (NoteModel note : notes) {
            if (note.getNoteId() == noteId) {
                note.setTitle(title);
                note.setText(text);
                break;
            }
        }
    }

    public void deleteNote(int noteId) {
        notes.removeIf(note -> note.getNoteId() == noteId);
    }

    public void showNotes() {
        view.displayNotes(notes);
    }
}