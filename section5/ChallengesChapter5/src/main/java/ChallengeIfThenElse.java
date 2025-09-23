public class ChallengeIfThenElse {


    public static void main(String[] args) {


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("your final score was "+finalScore);
        }

        score = 100;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("your final score was "+finalScore);
        }

    }
}
