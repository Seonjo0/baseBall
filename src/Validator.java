import java.util.*;

public class Validator {
    HashMap<String, Integer> gameResult = new LinkedHashMap<>(Map.of("Strike", 0, "Ball", 0, "Out", 0));

    // 가지고 있는 정답을 반환하는 메소드
    // 입력값과 정답 값을 비교하여 결과를 반환하는 메소드?

    public ResultStatus isCorrectInputs(String answer, List<String> correctNumber) {
        String[] answerArray = answer.split("");

        for (int i = 0; i < answerArray.length ; i++) {
            if(correctNumber.contains(answerArray[i])) {
                if(Objects.equals(correctNumber.get(i), answerArray[i])) {
                    gameResult.put("Strike", gameResult.getOrDefault("Strike", 0) + 1);
                } else {
                    gameResult.put("Ball", gameResult.getOrDefault("Ball", 0) + 1);
                }
            } else {
                gameResult.put("Out", gameResult.getOrDefault("Out", 0) + 1);
            }
        }

        System.out.println(gameResult);
        return getResultStatus();
    }

    private ResultStatus getResultStatus() {
        if( gameResult.get("Strike") == 3){
            return ResultStatus.CORRECT;
        } else {
            return ResultStatus.INCORRECT;
        }
    }
}
