package curryFactory;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pong
 */
public class user {

    private String username;
    private String password;

    public user(String name, String surname) {
        this.username = name;
        this.password = surname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
