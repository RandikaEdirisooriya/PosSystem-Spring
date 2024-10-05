package lk.ijse.possystembackendspring.Service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.possystembackendspring.Dto.Impl.CustomerDto;
import lk.ijse.possystembackendspring.Entity.Customer;
import lk.ijse.possystembackendspring.Exception.DataPersistException;
import lk.ijse.possystembackendspring.Service.CustomerService;
import lk.ijse.possystembackendspring.Utill.mapping;
import lk.ijse.possystembackendspring.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private mapping mapping;
    @Override
    public void saveCustomer(CustomerDto customerDto) {
        System.out.println(customerDto);

        Customer savedCustomer =
                customerDao.save(mapping.toCustomerEntity(customerDto));
        if (savedCustomer == null) {
            throw new DataPersistException("User not saved");
        }
    }
}
