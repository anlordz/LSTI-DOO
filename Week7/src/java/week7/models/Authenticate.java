/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.models;

import Services.Database;

/**
 *
 * @author Andrea
 */
public class Authenticate {
   public static boolean isValid(String name, String lastName,String username, String password){
       
       Database.getUserByUsernamePassword(username, password);
       User user = new User(name, lastName, username, password);
       if(user.getUsername().equals(username)&& user.getPassword().equals(password)){
           return false;
       }else{
            return true;
        }
   }
} 

