package lk.ijse.possystembackendspring.Dto.Impl;

import lk.ijse.springday3.Dto.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto implements UserStatus {
    private String UserId;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;
    private String ProfilePicture;
    private List<NoteDto> NoteId;
}
