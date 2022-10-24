package com.springboot.alfi.app.repository;

import com.springboot.alfi.app.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by alfi 2022.
 */

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
