import java.util.Random;

public class Role {
    private final Long ID = new Random(999999).nextLong();
    private String name;

    public Role(String name) {
        this.name = name;
    }

    public Long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
