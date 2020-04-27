package org.example.repos;

import org.example.models.User;

import java.util.List;

/****************************
 * @author a.yertuyak
 * @since 27.04.2020
 ***************************/
public interface UserRepository {
    List<User> findAll();
}
