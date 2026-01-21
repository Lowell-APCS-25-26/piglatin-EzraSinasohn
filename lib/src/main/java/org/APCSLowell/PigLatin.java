package org.APCSLowell;

public class PigLatin {
    public int findFirstVowel(String sWord) {
        for(int i = 0; i < sWord.length(); i++) {
            if(sWord.charAt(i) == 'a' || sWord.charAt(i) == 'e' || sWord.charAt(i) == 'i' || sWord.charAt(i) == 'o' || sWord.charAt(i) == 'u') {return i;}
        }
        return -1;
    }

    public String pigLatin(String sWord) {
        if(findFirstVowel(sWord) == -1) {
            return sWord + "ay";
        } else if(findFirstVowel(sWord) == 0) {
            return sWord + "way";
        } else if(sWord.length() >= 2 && sWord.substring(0, 2).equals("qu")) {
            return sWord.substring(2, sWord.length()) + sWord.substring(0, 2) + "ay";
        } else if(findFirstVowel(sWord) > 0 && findFirstVowel(sWord) < sWord.length()) {
            return sWord.substring(findFirstVowel(sWord), sWord.length()) + sWord.substring(0, findFirstVowel(sWord)) + "ay";
        } else {
            return null;
        }
    }
}
