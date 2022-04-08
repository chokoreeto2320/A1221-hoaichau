package ss8_cleancode.baitap.refactoring;

public class TennisGame {
    public static String getScore(String playerFirst, String playerSecond, int scorePlayerFirst, int scorePlayerSecond) {
        String Resuit = "";
        int tempScore = 0;
        if (scorePlayerFirst == scorePlayerSecond) {
            switch (scorePlayerFirst) {
                case 0:
                    Resuit = "Love-All";
                    break;
                case 1:
                    Resuit = "Fifteen-All";
                    break;
                case 2:
                    Resuit = "Thirty-All";
                    break;
                case 3:
                    Resuit = "Forty-All";
                    break;
                default:
                    Resuit = "Deuce";
                    break;

            }
        } else if (scorePlayerFirst >= 4 || scorePlayerSecond >= 4) {
            int minusResult = scorePlayerFirst - scorePlayerSecond;
            if (minusResult == 1) Resuit = "Advantage player1";
            else if (minusResult == -1) Resuit = "Advantage player2";
            else if (minusResult >= 2) Resuit = "Win for player1";
            else Resuit = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scorePlayerFirst;
                else {
                    Resuit += "-";
                    tempScore = scorePlayerSecond;
                }
                switch (tempScore) {
                    case 0:
                        Resuit += "Love";
                        break;
                    case 1:
                        Resuit += "Fifteen";
                        break;
                    case 2:
                        Resuit += "Thirty";
                        break;
                    case 3:
                        Resuit += "Forty";
                        break;
                }
            }
        }
        return Resuit;
    }
}
