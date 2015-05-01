/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aoi
 */
public class LoginLogic {
    public boolean execute(User user) {
        if (user.getPass().equals("1234")) {
            return true;
        }
        return false;
    }
}
