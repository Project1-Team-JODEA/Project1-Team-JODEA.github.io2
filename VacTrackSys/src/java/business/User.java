/**
 *
 * @author Alex Breitenbach
 */
package business;


public class User {

    private String username, password, fname, mname, lname, location, state, role, passattempt;
    
    // default constructor
    public User(){
        this.username = "";
        this.password = "";
        this.fname = "";
        this.mname = "";
        this.lname = "";
        this.location = "";
        this.state = "";
        this.role = "";
        this.passattempt = "";
    }
    
        //normal constructor.  All fields should be validated BEFORE calling this method.  Add functionality for limiting scope / permissions???
    public User(String username, String password, String fname, String mname, String lname, String location, String state, String role, String passattempt){
        this.username = username;
        this.password = password;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.location = location;
        this.state = state;
        this.role = role;
        this.passattempt = passattempt;
    }
    
    public boolean isAuthenticated(){
        if (this.password == this.passattempt){
            return true;
        }
        return false;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassattempt() {
        return passattempt;
    }

    public void setPassattempt(String passattempt) {
        this.passattempt = passattempt;
    }
}
