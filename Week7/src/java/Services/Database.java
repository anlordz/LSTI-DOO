/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;
import week7.models.User;
import week7.models.Authenticate;
import java.io.*;
import org.json.*;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import week7.models.User;

/**
 *
 * @author Andrea
 */
public class Database {
    private static String getPathDatabase() {
    return "C:\\Users\\Andrea\\Documents\\NetBeansProjects\\Week7\\src\\java\\Database\\JSONObject.json";
}
    private static JSONObject getJsonObject() {

        try {
            String rutaJson = getPathDatabase();
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(rutaJson));

            JSONObject jsonObject =  (JSONObject) obj;

            return jsonObject;
        }
        catch(IOException ioext) {
            return null;
        }
        catch(ParseException pext) {
            return null;
        }
}
private static boolean setJsonObject(String namedb, String lastNamedb, String usernamedb, String passworddb) {
     JSONObject obj = new JSONObject();

    //Solo guarda un valor
    obj.put("name", namedb);
    obj.put("lastName", lastNamedb);
    obj.put("username", usernamedb);
    obj.put("password", passworddb);

    String rutaJson = getPathDatabase(); //llamada a método anterior

    try (FileWriter file = new FileWriter(rutaJson)) {
            file.write(obj.toJSONString());

            return true;
    }
    catch(IOException ioext) {
        return false;
    }
}



public static User getUserByUsernamePassword(String username, String password){
    User user;

    JSONObject jsonObject = getJsonObject(); //Llamáda a método

    if(jsonObject != null) {
        String usernamedb = (String) jsonObject.get("username");
        String passworddb = (String) jsonObject.get("password");
        String namedb = (String) jsonObject.get("name");   
        String lastNamedb = (String) jsonObject.get("lastName");
        //Validar password y usuario
        //passwordDb no existe en este contexto. Usar el ejemplo de propiedadDb
        
        if(username.equals(usernamedb) && password.equals(passworddb)) {
           
              user = new User(usernamedb,passworddb,namedb, lastNamedb); //Completar con propiedades para construir objeto
            
        }
        else {
            user = null;
        }

        return user;
    }
    else{
        return null;
    }
}
public static User getUserByUsername(String username, String password) {
    User user;

    JSONObject jsonObject = getJsonObject(); //llama a método anterior

    if(jsonObject != null) {
        String usernamedb = (String) jsonObject.get("username");
        String passworddb = (String) jsonObject.get("password");
        String namedb = (String) jsonObject.get("name");   
        String lastNamedb = (String) jsonObject.get("lastName");

        //Valida si el usuario que se pide es igual al que se encuentra
        //en el archivo JSON
       if(username.equals(usernamedb) && password.equals(passworddb)) {
            user = new User(namedb,lastNamedb, usernamedb, passworddb); //Completar con todas las propiedades del usuario
        }
        else {
            user = null;
        }

        return user;
    }
    else{
        return null;
    }
}
public static boolean setUser(String name, String lastName, String username, String password) {

    boolean isSetup = setJsonObject(name, lastName, username, password);

    return isSetup;
}
}
