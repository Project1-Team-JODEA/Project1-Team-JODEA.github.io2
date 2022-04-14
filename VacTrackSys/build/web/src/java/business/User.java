/**
 *
 * @author Alex Breitenbach
 */
package business;
//import AppSecurity;

public class User {

<<<<<<< HEAD:VacTrackSys/web/src/java/business/User.java
    public boolean isSearchedPatients() {
        if (searched == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getSearched() {
        return searched;
    }

    public void setSearched(Boolean searched) {
        this.searched = searched;
    }

=======
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
    
>>>>>>> origin:VacTrackSys/src/java/business/User.java
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
<<<<<<< HEAD:VacTrackSys/web/src/java/business/User.java

    private String username, password, accesslevel, email,
            location, passattempt, question, answer;
    
    private Boolean searched = false;
    // default constructor

    public User() {
        this.username = "";
        this.password = "";
        this.accesslevel = "";
        this.email = "";
        this.location = "";
        this.passattempt = "";
        this.searched = false;
        this.question = "";
        this.answer = "";
    }

    //normal constructor.  All fields should be validated BEFORE calling this method.  Add functionality for limiting scope / permissions???
    public User(String username, String password, String accesslevel, String email, String location, String passattempt) {
        this.username = username;
        this.password = password;
        this.accesslevel = accesslevel;
        this.email = email;
        this.location = location;
        this.passattempt = passattempt;
        this.searched = false;
    }

    /**
     * Returns true if User password mataches
     *
     * @return boolean
     *
     */
    public boolean isAuthenticated() {
        if (this.getPassword().equals(this.getPassattempt())) {
            return true;
        }
        return false;
    }

    public void secureInfo() {

    }

    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @return the answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * @param answer the answer to set
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

=======
>>>>>>> origin:VacTrackSys/src/java/business/User.java
}
