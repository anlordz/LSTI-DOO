/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.models;

/**
 *
 * @author Andrea
 */
public class User {
  private  String name;
  private String lastName;
  private String username;
  private String password;
    

    public User(String name, String lastName, String username, String password){
        name="";
        lastName="";
        this.username="";
        this.password ="";
    }

public String getName(){
      
      return name;
    }
public String getlastName(){
    return lastName;
}
public String getUsername(){
      
      return this.username;
    }
    
    public String getPassword(){
      
      return this.password;
    }
    
    
}