package ss8.exercises;

public class TenisGame {
    public static final char ZEROPOINT = 0;
    public static final char ONEPOINT = 1;
    public static final char TWOPOINT = 2;
    public static final char THREEPOINT = 3;
    public static final char IMPORTANTPOINT = 4;

    public static String showEqualsPoint(int player1Score) {
        String total = "";
        switch (player1Score) {
            case ZEROPOINT:
                total = "Love-All";
                break;
            case ONEPOINT:
                total = "Fifteen-All";
                break;
            case TWOPOINT:
                total = "Thirty-All";
                break;
            case THREEPOINT:
                total = "Forty-All";
                break;
            default:
                total = "Deuce";
                break;
        }
        return total;
    }

    public static String showAvantagePoint(int player1Score, int player2Score) {
        String total = " ";
        if (player1Score >= IMPORTANTPOINT || player2Score >= IMPORTANTPOINT) {

            int minusResultPoint = player1Score - player2Score;
            if (minusResultPoint == 1) {
                total = "Advantage player1";
            } else if (minusResultPoint == -1) {
                total = "Advantage player2";
            } else if (minusResultPoint >= 2) {
                total = "Win for player1";
            } else {
                total = "Win for player2";
            }
        }
        return total;
    }

    public static String showResult(int player1Score, int player2Score) {
        String total = " ";
        int tempScore = 0;
        if (player1Score == player2Score) {
            return showEqualsPoint(player1Score);
        } else if (player1Score >= IMPORTANTPOINT || player2Score >= IMPORTANTPOINT) {
            return showAvantagePoint(player1Score, player2Score);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = player1Score;
                } else {
                    total += "-";
                    tempScore = player2Score;
                }
                switch (tempScore) {
                    case ZEROPOINT:
                        total += "Love";
                        break;
                    case ONEPOINT:
                        total += "Fifteen";
                        break;
                    case TWOPOINT:
                        total += "Thirty";
                        break;
                    case THREEPOINT:
                        total += "Forty";
                        break;
                }
            }
        }
        return total;
    }
}


