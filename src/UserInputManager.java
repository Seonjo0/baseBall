import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInputManager {
    private final Scanner scanner = new Scanner(System.in);
    private List<String> correctAnswer;

    public UserInputManager(List<String> correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    // 사용자에게 반복적으로 입력을 받는 메소드
    public void getUserInput() {
        String userInput = "";
        System.out.println("==== 야구게임 시작! ====");

        while (true) {
            System.out.print("답을 입력하세요. q는 종료 : ");
            userInput = scanner.nextLine();
            inputTypeValidator(Arrays.stream(userInput.split("")).toList());
        }
    }

    // 입력값이 특수 기능 값인지 정답인지 감별하는 메소드
    public UserInputStatus inputTypeValidator(List<String> userInput) {
        if ( userInput.size() == 0 ) {
            return UserInputStatus.NULL;
        } else if (userInput.contains("q")) {
            return UserInputStatus.QUIT;
        } else if (userInput.contains("a")) {
            return UserInputStatus.HINT;
        } else {
            return UserInputStatus.NORMAL;
        }
    }

    // 특수 기능 값의 경우 Enum으로 상태값을 반환함. q면 종료, a면 정답 확인

    // 입력값이 정답일 경우 입력값에 대한 검증

    // 검증된 값을 정답과 비교하는 메소드
}
