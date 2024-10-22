import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;

public class RandomNumberFactory {

    public static List<String> getNumber(){
        Random random = new Random();
        HashSet<String> randomNumbers = new LinkedHashSet<>();
        do {
            int correct = random.nextInt(100, 999);
            randomNumbers.addAll((List.of(String.valueOf(correct).split(""))));

        } while (randomNumbers.size() != 3);


        return randomNumbers.stream().toList();
    }
}