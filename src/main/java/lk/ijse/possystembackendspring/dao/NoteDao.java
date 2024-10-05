package lk.ijse.possystembackendspring.dao;

import lk.ijse.springday3.Entity.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteDao  extends JpaRepository<NoteEntity,String> {
}
