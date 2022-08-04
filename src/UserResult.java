import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserResult {
    private final Long ID = new Random(999999).nextLong();
    private User user;
    private List<Answer> answerList = new ArrayList<>();
}
