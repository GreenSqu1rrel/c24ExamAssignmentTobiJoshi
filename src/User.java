import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.LinkedHashMap;

public class User {
    static LinkedHashMap<String, String> users = new LinkedHashMap<>();

    User(String uname, String pword){
        users.put(uname, pword);
    }

    static void adminLogin(){
        User.users.put("admin", "admin");
    }
    static void compareUserPass1(MouseEvent evt, String uname, String pword){
        if(User.users.containsKey(uname) == false){
            Component frame = null;
            JOptionPane.showMessageDialog(frame,
                    "Please try again",
                    "Wrong Username or Password",
                    JOptionPane.ERROR_MESSAGE);
        }
        else if(User.users.get(uname).equals(pword)) {
            JComponent comp = (JComponent) evt.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();
            Dashboard.main(uname,null);
        }
        else{
            Component frame = null;
            JOptionPane.showMessageDialog(frame,
                    "Please try again",
                    "Wrong Username or Password",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    static void compareUserPass2(KeyEvent evt, String uname, String pword){
        if(User.users.containsKey(uname) == false){
            Component frame = null;
            JOptionPane.showMessageDialog(frame,
                    "Please try again",
                    "Wrong Username or Password",
                    JOptionPane.ERROR_MESSAGE);
        }
        else if(User.users.get(uname).equals(pword)) {
            JComponent comp = (JComponent) evt.getSource();
            Window win = SwingUtilities.getWindowAncestor(comp);
            win.dispose();
            Dashboard.main(uname, null);
        }
        else{
            Component frame = null;
            JOptionPane.showMessageDialog(frame,
                    "Please try again",
                    "Wrong Username or Password",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
