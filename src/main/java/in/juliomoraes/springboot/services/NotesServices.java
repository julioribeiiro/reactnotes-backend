package in.juliomoraes.springboot.services;

import in.juliomoraes.springboot.entity.Note;
import in.juliomoraes.springboot.repository.NotesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class NotesServices {
    private final NotesRepository notesRepository;

    public NotesServices(NotesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }

    public ResponseEntity<List<Note>> readAllNotes() {
        return new ResponseEntity<>(notesRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<Note> addNote(Note note) {
        return new ResponseEntity<>(notesRepository.save(note), HttpStatus.CREATED);
    }

    public ResponseEntity<Note> readNote(Long id) {
        return new ResponseEntity<>(notesRepository.findById(id).get(), HttpStatus.OK);
    }

    public ResponseEntity<HttpStatus> deleteNote(Long id) {
        notesRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    public ResponseEntity<Note> updateNote(Note note) {
        return new ResponseEntity<>(notesRepository.save(note), HttpStatus.OK);
    }

}
