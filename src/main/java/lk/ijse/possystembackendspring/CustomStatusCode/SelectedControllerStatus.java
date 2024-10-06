package lk.ijse.possystembackendspring.CustomStatusCode;


import lk.ijse.possystembackendspring.Dto.CustomerStatus;
import lk.ijse.possystembackendspring.Dto.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedControllerStatus implements CustomerStatus {
    private int StatusCode;
    private String Status;

    private String StatusMassage;
}
