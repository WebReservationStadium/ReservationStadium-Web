package th.ac.ku.atm.model;

public class User {
    private String id;
    private String name;
    private String password;
    private String phone;
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



    public User(String id, String name, String pin, String phone) {
        this.id = id;
        this.name = name;
        this.password = pin;
        this.phone = phone;
    }

    public String  getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
