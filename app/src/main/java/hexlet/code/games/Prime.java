package hexlet.code.games;
import hexlet.code.Game;
import hexlet.code.Utils;
public final class Prime implements Game {
    public static final Integer MAXNUMBER = 99;
    public static boolean isPrime(int num) {
        boolean answer = true;
        if (num == 1) {
            answer = false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                answer = false;
            }
        }
        return answer;
    }
    public String getRules() {
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        return gameRules;
    }
    public String[] getData() {
        int question = Utils.getRandom(MAXNUMBER);
        String correctAnswer = isPrime(question) ? "yes" : "no";
        String stringQuestion = Integer.toString(question);
        String[] gameData = {stringQuestion, correctAnswer};
        return gameData;
    }
}
