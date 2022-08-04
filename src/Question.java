import java.util.Random;

public class Question {
    private final Long ID = new Random(999999).nextLong();
    private String text;
    private Subject subject;

    public Question(String text, Subject subject) {
        this.text = text;
        this.subject = subject;
    }

    public Long getID() {
        return ID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return text;
    }
}
