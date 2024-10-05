package lk.ijse.possystembackendspring.Dto.Impl;

import lk.ijse.possystembackendspring.Dto.CustomerStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDto implements CustomerStatus {
   private String id;
   private String name;
   private String address;
   private String contact;
   private String email;
}
