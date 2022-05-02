package com.sofkau.todoapp.service;

import com.sofkau.todoapp.entity.Note;

import java.util.List;

public interface NoteService {

    List<Note> getAllNotes();

    Note saveNote(Note note);

    Note updateNote(Note note);

    void deleteNote(Long id);

}
