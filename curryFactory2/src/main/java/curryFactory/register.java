package curryFactory;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author oontoon
 */
public class register {

    ArrayList<user> userArray;

    public register() {
        this.userArray = new ArrayList<user>();
        user u1 = new user("pong", "1234");
        user u2 = new user("oonton", "1111");
        userArray.add(u1);
        userArray.add(u2);
    }

    private boolean check(String s1, String s2) {
        return s1.compareTo(s2) == 0;
    }

    public void regis(String username, String surname) {
        user u = new user(username, surname);
        userArray.add(u);
    }

    public boolean checkuser(String user, String pass) {
        for (user u : userArray) {
            if (check(u.getUsername(), user) && check(u.getPassword(), pass)) {
                return true;
            }
        }
        return false;
    }
}
