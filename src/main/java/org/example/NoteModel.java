package org.example;

public class NoteModel {
    private int noteId;
    private String title;
    private String text;

    public NoteModel(int noteId, String title, String text) {
        this.noteId = noteId;
        this.title = title;
        this.text = text;
    }

    public int getNoteId() {
        return noteId;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }
}
