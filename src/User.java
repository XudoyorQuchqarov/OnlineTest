import java.util.Random;

public class User {
    private final Long ID = new Random(999999).nextLong();
    private String fullName;
    private Role role;

    public User(String fullName, Role role) {
        this.fullName = fullName;
        this.role = role;
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
