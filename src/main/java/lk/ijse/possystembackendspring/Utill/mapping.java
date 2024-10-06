package lk.ijse.possystembackendspring.Utill;


import lk.ijse.possystembackendspring.Dto.Impl.CustomerDto;
import lk.ijse.possystembackendspring.Entity.Customer;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class mapping {
    @Autowired
    private ModelMapper modelMapper;


    public Customer toCustomerEntity(CustomerDto customerDto){
        return modelMapper.map(customerDto, Customer.class);
    }
    public CustomerDto toCustomerDto(Customer customer){
        return modelMapper.map(customer, CustomerDto.class);
    }
    public List<CustomerDto> asCustomerDtoList(List<Customer> customerList){
        return modelMapper.map(customerList,new TypeToken<List<CustomerDto>>(){}.getType());
    }
}
