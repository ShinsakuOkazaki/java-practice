public class Main {
    public static void main(String[] args) {
        PalindromePermutation parmutation = new PalindromePermutation();
        String test1 = "saku ukas";
        String test2 = "sakafafa";
        boolean result1 = parmutation.isPalindromePermutation(test1);
        boolean result2 = parmutation.isPalindromePermutation(test2);
        System.out.println("result1: "+ result1);
        System.out.println("result2: "+ result2);
    }
}
