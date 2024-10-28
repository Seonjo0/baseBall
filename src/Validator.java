import enums.ResultStatus;
import enums.StrikeBallOutStatus;

import java.util.*;

public class Validator {
    HashMap<StrikeBallOutStatus, Integer> gameResult = new LinkedHashMap<>(Map.of(StrikeBallOutStatus.STRIKE, 0, StrikeBallOutStatus.BALL, 0, StrikeBallOutStatus.OUT, 0));

    // 가지고 있는 정답을 반환하는 메소드
    // 입력값과 정답 값을 비교하여 결과를 반환하는 메소드?

    public ResultStatus isCorrectInputs(String answer, List<String> correctNumber) {
        String[] answerArray = answer.split("");

        for (int i = 0; i < answerArray.length ; i++) {
            if(correctNumber.contains(answerArray[i])) {
                if(Objects.equals(correctNumber.get(i), answerArray[i])) {
                    gameResult.put(StrikeBallOutStatus.STRIKE, gameResult.getOrDefault(StrikeBallOutStatus.STRIKE, 0) + 1);
                } else {
                    gameResult.put(StrikeBallOutStatus.BALL, gameResult.getOrDefault(StrikeBallOutStatus.BALL, 0) + 1);
                }
            } else {
                gameResult.put(StrikeBallOutStatus.OUT, gameResult.getOrDefault(StrikeBallOutStatus.OUT, 0) + 1);
            }
        }

        System.out.println(gameResult);
        return getResultStatus();
    }

    private ResultStatus getResultStatus() {
        if( gameResult.get(StrikeBallOutStatus.STRIKE) == 3){
            return ResultStatus.CORRECT;
        } else {
            return ResultStatus.INCORRECT;
        }
    }
}
