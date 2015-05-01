/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author aoi
 */
public class User implements Serializable {
    
    private String name; // ユーザー名
    private String pass; // パスワード
    
    public User() {
    }
    
    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPass() {
        return pass;
    }
}
