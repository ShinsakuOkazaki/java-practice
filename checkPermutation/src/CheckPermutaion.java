import java.util.Arrays;

public class CheckPermutaion {
    public boolean check(String word, String other) {
        if(word.length() != other.length()) {
            return false;
        }
        int[] asciiArray;
        asciiArray = new int[128];
        Arrays.fill(asciiArray, 0);
        for(int i = 0; i < word.length(); i++) {
            int val = word.charAt(i);
            asciiArray[val] += 1;
        }
        for(int i = 0; i < word.length(); i++) {
            int val = other.charAt(i);
            asciiArray[val] -= 1;
            if(asciiArray[val] < 0) {
                return false;
            }
        }
        return true;
    }


}
