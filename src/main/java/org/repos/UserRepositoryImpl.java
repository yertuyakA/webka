package org.example.repos;

import org.example.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/****************************
 * @author a.yertuyak
 * @since 27.04.2020
 ***************************/
public class UserRepositoryImpl implements UserRepository {

    List<User> users;

    public UserRepositoryImpl(){
        users = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", ""); //quiz - наша база
            Statement stmt = con.createStatement();
            PreparedStatement pstm = con.prepareStatement("select * from users");
            ResultSet rs = pstm.executeQuery();

            if(rs.next()){
                User user = new User();
                user.setNickname(rs.getString(1));
                user.setPassword(rs.getString(2));
                users.add(user);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public List<User> findAll() {
        return users;
    }
}
