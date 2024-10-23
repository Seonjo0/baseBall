import java.util.List;

public class GameMachine {
    ResultStatus isUserCorrect = ResultStatus.INCORRECT;
    List<String> correctAnswer = RandomNumberFactory.getNumber();


    public void start() {
        while (isUserCorrect == ResultStatus.INCORRECT) {
            UserInputManager inputManager = new UserInputManager();
            String userInput = inputManager.getUserInput();

            if(userInput.equals("QUIT") || userInput.equals("HINT")) {
                isUserCorrect = ResultStatus.EXCEPTION;
                break;
            }

            Validator validator = new Validator();
            isUserCorrect = validator.isCorrectInputs(userInput, correctAnswer);
        }

        if (isUserCorrect == ResultStatus.CORRECT) {
            System.out.println("정답을 축하드립니다 !");
        }

        System.out.println("정답은 " + correctAnswer + " 입니다.");
    }

}
