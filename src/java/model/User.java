package model;

/**
 *
 * @author Nguyen Minh Khanh
 */
public class User {
    
    private int id;
    private String userName;
    private String passWord;
    private String firstName;
    private String lastName;
    private String gender;
    private String birthday;

    public User(int id, String userName, String passWord, String firstName, String lastName, String gender, String birthday) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getGender() {
        return gender;
    }
    

    public String getBirthday() {
        return birthday;
    }

}
