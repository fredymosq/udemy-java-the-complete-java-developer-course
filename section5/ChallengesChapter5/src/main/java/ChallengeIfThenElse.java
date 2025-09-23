public class ChallengeIfThenElse {


    public static void main(String[] args) {


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);
        calculateScore(true, 1000, 6, 200);

    }

    private static void calculateScore(
            boolean gameOver,
            int score,
            int levelCompleted,
            int bonus){

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("your final score was "+finalScore);
        }
    }
}
