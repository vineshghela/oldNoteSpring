package com.QA.respository;

import com.QA.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface NotesRepository extends JpaRepository<Note, Long> {
    }

