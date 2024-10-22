import java.util.*;

// 사랑해요 우리 산듀 사랑해요 결혼해용 내일 할까요? 강남에서 신고해용 <3
import java.util.*;

public class BaseballGame {
    public static void main(String[] args) {

        GameMachine gameMachine = new GameMachine();

    }
}

//    private static void baseBallGame() {
//        gameInit();
//    }
//
//    private static void gameInit() {
//        Scanner scanner = new Scanner(System.in);
//        String[] correctAnswer = getAnswer();
//
//        System.out.println("==== 야구게임 시작! ====");
//        while (true) {
//            System.out.print("답을 입력하세요. q는 종료 : ");
//            String userInput = scanner.nextLine();
//
//            // 종료 및 정답 안내 분기점
//            if (isExtraInputs(userInput, correctAnswer)) break;
//            if (isCorrectInputs(userInput, correctAnswer)) break;
//        }
//    }
//
//    private static boolean isCorrectInputs(String answer, String[] correctAnswer) {
//        if (validateInputValues(answer)) {
//            String[] inputs = answer.split("");
//            HashMap<String, Integer> map = new LinkedHashMap<>(Map.of("Strike", 0, "Ball", 0, "Out", 0));
//
//            for (int i = 0; i < inputs.length; i++) {
//                String status = getString(correctAnswer, i, inputs);
//                map.put(status, map.getOrDefault(status, 0) + 1);
//            }
//
//            System.out.println("==결과==");
//            map.forEach((k, v) -> System.out.println(k + ": " + v));
//
//            if (map.getOrDefault("Strike", 0) == 3) {
//                System.out.println("Congratulations! You have won the game!");
//                return true;
//            }
//
//        }
//        return false;
//    }
//
//    private static boolean isExtraInputs(String answer, String[] correctAnswer) {
//        if (answer.equals("q")) {
//            return true;
//        } else if (answer.equals("a")) {
//            System.out.print("정답은 ");
//            for(String a : correctAnswer){
//                System.out.print(a);
//            }
//            System.out.println("입니다. ");
//            return true;
//        }
//        return false;
//    }
//
//
//    private static String getString(String[] stringCorrects, int i, String[] inputs) {
//        String status = "Out";
//
//        for (int j = 0; j < stringCorrects.length; j++) {
//            boolean indexCorrect = false;
//            boolean valueCorrect = false;
//
//            if(i == j) indexCorrect = true;
//
//            if(inputs[i].equals(stringCorrects[j])){
//                valueCorrect = true;
//            }
//
//            if(indexCorrect && valueCorrect){
//                status = "Strike";
//            } else if (!indexCorrect && valueCorrect) {
//                if(!status.equals("Strike")){
//                    status = "Ball";
//                }
//            }
//        }
//        return status;
//    }
//
//    private static boolean validateInputValues(String value) {
//        String[] datas = value.split("");
//
//        // 3 글자의 숫자인가?
//        if (datas.length == 3) {
//            // 숫자만으로 구성돼있는가?
//            for (String s : datas) {
//                try {
//                    int intValue = Integer.parseInt(s);
//                } catch (NumberFormatException e) {
//                    System.out.println(e.getMessage());
//                    return false;
//                }
//            }
//            return true;
//        }
//        return false;
//    }
//}