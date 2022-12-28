import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

public class User {
    static LinkedHashMap<String, String> users = new LinkedHashMap<>();
    public User u = new User("admin","admin");
    User(String uname, String pword){
        users.put(uname, pword);
    }

    public boolean searchUser(User user) {


        return false;
    }
}
