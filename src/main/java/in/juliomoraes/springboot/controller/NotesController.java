package in.juliomoraes.springboot.controller;

import in.juliomoraes.springboot.entity.Note;
import in.juliomoraes.springboot.services.NotesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/api/notes")
@CrossOrigin("*")
public class NotesController {

    private final NotesServices notesServices;

    @Autowired
    public NotesController(NotesServices notesServices) {
        this.notesServices = notesServices;
    }

    @GetMapping
    public ResponseEntity<List<Note>> readNotes (){
        return notesServices.readAllNotes();
    }

    @PostMapping
    public ResponseEntity<Note> addNote(@RequestBody Note note) {
        return notesServices.addNote(note);
    }

    @GetMapping("{id}")
    public ResponseEntity<Note> getNote(@PathVariable Long id) {
        return notesServices.readNote(id);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteNote(@PathVariable Long id) {
        return notesServices.deleteNote(id);
    }

    @PutMapping("/edit")
    public ResponseEntity<Note> updateNote(@RequestBody Note note) {
        return notesServices.updateNote(note);
    }

}
