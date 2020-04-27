package org.example.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/****************************
 * @author a.yertuyak
 * @since 27.04.2020
 ***************************/
//Lombok
@Getter
@Setter
public class User {
    // username, password...
    private String nickname;
    private String password;

}
