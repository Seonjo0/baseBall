import java.util.List;

public class GameMachine {
    List<String> correctAnswer = RandomNumberFactory.getNumber();


    public void start() {
        UserInputManager inputManager = new UserInputManager(correctAnswer);

    }

}
