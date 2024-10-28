import enums.ResultStatus;

import java.util.List;
import java.util.Scanner;

public class GameMachine {
    Validator validator = new Validator();
    Scanner scanner = new Scanner(System.in);
    UserInputManager inputManager = new UserInputManager(scanner);

    ResultStatus isUserCorrect = ResultStatus.INCORRECT;
    List<String> correctAnswer = RandomNumberFactory.getNumber();


    // while문에서 매번 생성되는 인스턴스 클래스 필드로 생성하여 리팩토링
    public void start() {
        while (isUserCorrect == ResultStatus.INCORRECT) {

            String userInput = inputManager.getUserInput();

            if(userInput.equals("QUIT") || userInput.equals("HINT")) {
                isUserCorrect = ResultStatus.EXCEPTION;
                break;
            }
            isUserCorrect = validator.isCorrectInputs(userInput, correctAnswer);
        }

        if (isUserCorrect == ResultStatus.CORRECT) {
            System.out.println("정답을 축하드립니다 !");
        }

        System.out.println("정답은 " + correctAnswer + " 입니다.");
    }

}
