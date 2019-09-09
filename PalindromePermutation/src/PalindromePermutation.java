public class PalindromePermutation {

    public boolean isPalindromePermutation(String phrase) {
        int[] table = buildCharFreauency(phrase);
        boolean founded = checkMaxOneOdd(table);
        return founded;
    }

    public boolean checkMaxOneOdd(int[] table) {
        boolean founded = false;
        for(int i: table) {
            if(i % 2 == 1) {
                if(founded) {
                    return false;
                }
                founded = true;
            }
        }
        return true;
    }

    public int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if(a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }

    public int[] buildCharFreauency(String phrase) {
        int[] table = new int[Character.getNumericValue('z') -
                                Character.getNumericValue('a') + 1];
        for(char c: phrase.toCharArray()) {
            int x = getCharNumber(c);
            if(x != -1) {
                table[x] += 1;
            }
        }
        return table;
    }
}
