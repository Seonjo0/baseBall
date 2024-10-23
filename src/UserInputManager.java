import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInputManager {
    private final Scanner scanner = new Scanner(System.in);

    // 사용자에게 반복적으로 입력을 받는 메소드
    public String getUserInput() {
        String userInput = "";
        UserInputStatus inputStatus = UserInputStatus.NULL;
        System.out.println("==== 야구게임 시작! ====");

        while (inputStatus == UserInputStatus.NULL) {
            System.out.print("답을 입력하세요. q는 종료 : ");
            userInput = scanner.nextLine();
            inputStatus = inputTypeValidator(Arrays.asList(userInput.split("")));
        }

        return getResultByStatus(inputStatus, userInput);
    }



    // 입력값이 특수 기능 값인지 입력값인지 감별하는 메소드
    public UserInputStatus inputTypeValidator(List<String> userInput) {
        if (userInput.contains("q")) {
            return UserInputStatus.QUIT;
        } else if (userInput.contains("a")) {
            return UserInputStatus.HINT;
        } else if (userInput.size() != 3) {
            return UserInputStatus.NULL;
        }

        for (String s : userInput) {
            try{
                int intValue = Integer.parseInt(s);
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
                return UserInputStatus.NULL;
            }
        }
        return UserInputStatus.NORMAL;
    }

    private String getResultByStatus(UserInputStatus inputStatus, String userInput) {
        if(inputStatus == UserInputStatus.QUIT){
            return "QUIT";
        } else if (inputStatus == UserInputStatus.HINT){
            return "HINT";
        } else {
            return userInput;
        }
    }
}
