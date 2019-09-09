public class Hello {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your file score was " + highScore);

        int hightScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", hightScorePosition);

        hightScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", hightScorePosition);

        hightScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", hightScorePosition);

        hightScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", hightScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + "managed to get into postion " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            System.out.println("The type is " + 1);
            return 1;
        } else if(score > 500 && score <= 1000) {
            System.out.println("The type is " + 2);
            return 2;
        } else if(score > 100 && score <= 500) {
            System.out.println("The typr is " + 3);
            return 3;
        } else {
            System.out.println("The score is " + 4);
            return 4;
        }
    }

}
