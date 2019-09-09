public class IsUnique {
    public boolean isUnique(String words) {
        boolean asciiArray[];
        asciiArray = new boolean[128];

        for(int i = 0; i < words.length(); i++) {
            int var = words.charAt(i);
            if(asciiArray[var]) {
                return false;
            }
            asciiArray[var] = true;
        }
        return true;
    }


}
