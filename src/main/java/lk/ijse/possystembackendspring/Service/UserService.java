package lk.ijse.possystembackendspring.Service;

import lk.ijse.springday3.Dto.Impl.UserDto;
import lk.ijse.springday3.Dto.UserStatus;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    List<UserDto> getAllUser();
    UserStatus getSelectedUser(String id);
    void deleteUser(String id);
    void updateUser(String id,UserDto userDto);

}
