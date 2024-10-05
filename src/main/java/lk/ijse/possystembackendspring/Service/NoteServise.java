package lk.ijse.possystembackendspring.Service;

import lk.ijse.springday3.Dto.Impl.NoteDto;
import lk.ijse.springday3.Dto.NoteStatus;

import java.util.List;

public interface NoteServise {
    void saveNote(NoteDto noteDto);
    List<NoteDto> getAllNote();
    NoteStatus getSelectedNote(String id);
    void deleteNote(String id);
    void updateNote(String id,NoteDto noteDto);
}
