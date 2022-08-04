import java.util.Random;

public class User {
    private final Long ID = new Random(999999).nextLong();
    private String fullName;
    private Role role;
    private String email;
    private String password;

    public User(String fullName, Role role) {
        this.fullName = fullName;
        this.role = role;
    }

    public User(String fullName, Role role, String email) {
        this.fullName = fullName;
        this.role = role;
        this.email = email;
    }

    public User(String fullName, Role role, String email, String password) {
        this.fullName = fullName;
        this.role = role;
        this.email = email;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getID() {
        return ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", fullName='" + fullName + '\'' +
                ", role=" + role +
                '}';
    }
}
