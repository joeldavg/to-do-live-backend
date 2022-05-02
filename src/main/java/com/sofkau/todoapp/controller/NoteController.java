package com.sofkau.todoapp.controller;

import com.sofkau.todoapp.entity.Note;
import com.sofkau.todoapp.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin("http://localhost:3000/")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @GetMapping("get/notes")
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }

    @PostMapping("save/note")
    public Note saveNote(@RequestBody Note note) {
        return noteService.saveNote(note);
    }

    @PutMapping("update/note")
    public Note updateNote(@RequestBody Note note) {
        return noteService.updateNote(note);
    }

    @DeleteMapping("delete/{id}")
    public void deleteNote(@PathVariable("id") Long id) {
        noteService.deleteNote(id);
    }

}
