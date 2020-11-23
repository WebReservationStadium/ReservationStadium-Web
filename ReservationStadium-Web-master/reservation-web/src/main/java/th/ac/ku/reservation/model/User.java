package th.ac.ku.reservation.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {


    @Id
    private String id;
    private String name;
    private String password;
    private String phone;


    public User() {

    }

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


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
