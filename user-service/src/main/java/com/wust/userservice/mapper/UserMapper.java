package com.wust.userservice.mapper;

import com.wust.userservice.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author ygtao
 */
@Repository
@Mapper
public interface UserMapper {

    User getUserByName(String name);

    User getUserById(Integer id);

    boolean deleteUserByName(String name);

    boolean deleteUserById(Integer id);

    boolean updateUser(User user);

    boolean addUser(User user);
}
