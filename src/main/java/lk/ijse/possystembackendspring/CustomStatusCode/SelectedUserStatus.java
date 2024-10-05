package lk.ijse.possystembackendspring.CustomStatusCode;

import lk.ijse.springday3.Dto.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedUserStatus implements UserStatus {
    private int StatusCode;
    private String Status;

    private String StatusMassage;
}
