import java.util.*;

import java.util.HashSet;
import java.util.Set;

/**
 * The complexity of that algorithm is O(n^m), where:
 *  n - the length of a string.
 *  m - number of permutations.
 */
public class NearbyWords {

    public static void main(String[] args) {
        System.out.println(nearbyWords("hello"));
    }

    static Set<String> nearbyWords(String input) {
        char[] letters = input.toCharArray();
        Set<String> nearbyPermutations = nearbyPermutations(letters, 0);
        Set<String> words = new HashSet<>();
        for (String pw : nearbyPermutations) {
            if (isword(pw)) {
                words.add(pw);
            }
        }
        return words;
    }

    private static Set<String> nearbyPermutations(char[] letters, int index) {
        if (index >= letters.length) {
            HashSet<String> strings = new HashSet<>();
            strings.add("");
            return strings;
        }

        Set<String> subWords = nearbyPermutations(letters, index + 1);
        Set<Character> nearbyLetters = getNearbyChars(letters[index]);

        return permutations(subWords, nearbyLetters);
    }

    private static Set permutations(Set<String> subWords, Set<Character> nearbyLetters) {
        Set permutations = new HashSet<>();

        for (String subWord : subWords) {
            for (Character letter : nearbyLetters) {
                permutations.add(letter + subWord);
            }
        }
        return permutations;
    }


    //Lame implementation of helpers.
    private static Set<Character> getNearbyChars(Character character) {
        HashSet<Character> characters = new HashSet<>();
        if (character == 'h') {
            characters.add('g');
            characters.add('h');
            characters.add('j');
        } else if(character=='e'){
        	characters.add('e');
            characters.add('w');
            characters.add('r');
            characters.add('d');
        }
        else if(character=='l')
        {
        	characters.add('l');
        	characters.add('k');
        	characters.add('o');
        }
        else if(character=='o')
        {
        	characters.add('o');
        	characters.add('i');
        	characters.add('l');
        }
        return characters;
    }

    static boolean isword(String word) {
        return word.equals("hello") || word.equals("gello");
    }
}

