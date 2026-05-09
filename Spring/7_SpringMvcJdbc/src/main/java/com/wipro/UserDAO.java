package com.wipro;

import java.util.List;

public interface UserDAO {
    void saveUser(UserModel user);


    List<UserModel> getUsers();

    void deleteUser(int id);

    UserModel getUserById(int id);

    void updateUser(UserModel user);
}