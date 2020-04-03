package org.bcs.qa.community.steps;

public class RandomName {
    public static String randomGenerator(int lettersCount) {
        String[] lettersArray = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String randomLetter;
        String randomName = "";
        for (int i = 0; i < lettersCount; ++i) {
            randomLetter = lettersArray[(int) (Math.random() * lettersArray.length)];
            randomName += randomLetter;
        }
        return randomName;
    }
}
