package lk.ijse.possystembackendspring.Controller;

import lk.ijse.possystembackendspring.Dto.Impl.CustomerDto;
import lk.ijse.possystembackendspring.Exception.DataPersistException;
import lk.ijse.possystembackendspring.Service.CustomerService;
import lk.ijse.possystembackendspring.Utill.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/saveCustomer")
    public ResponseEntity<Void> saveCustomer(@RequestBody CustomerDto customerDto) {
        try {
            customerDto.setId(AppUtil.genereteCustomerId());
            System.out.println("C-"+customerDto);
            customerService.saveCustomer(customerDto);

            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (DataPersistException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }/*catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }*/
    }
}
