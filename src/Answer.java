import java.util.Random;

public class Answer {
    private final Long ID = new Random(999999).nextLong();
    private String text;
    private  boolean status;
    private Question question;

    public Answer(String text, boolean status, Question question) {
        this.text = text;
        this.status = status;
        this.question = question;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return text;
    }
}
