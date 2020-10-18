import java.util.*;

class Solution {
    public String getHint(String secret, String guess) {

        int numbers[] = new int[10];
        int bulls = 0;
        int cows = 0;
        int guessNumber = 0;
        int secretNumber = 0;

        for(int i = 0 ; i < secret.length() ; i++)
        {
            secretNumber = Character.getNumericValue(secret.charAt(i));

            if(i < guess.length())
            {
                guessNumber = Character.getNumericValue(guess.charAt(i));
            }

            if( secretNumber == guessNumber )
            {
                bulls++;
            }
            else
            {
                if( numbers[secretNumber] < 0 )
                {
                    cows++;
                }
                if( numbers[guessNumber] > 0 )
                {
                    cows++;
                }
                numbers[secretNumber]++;
                numbers[guessNumber]--;
            }
        }

        return bulls+ "A"+ cows + "B";
    }
}