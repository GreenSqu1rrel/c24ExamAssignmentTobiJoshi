import java.util.LinkedHashMap;

public class User {
    static LinkedHashMap<String, String> users = new LinkedHashMap<>();

    User(String uname, String pword){
        users.put(uname, pword);
    }

    static void adminLogin(){
        User.users.put("admin", "admin");
    }
}
