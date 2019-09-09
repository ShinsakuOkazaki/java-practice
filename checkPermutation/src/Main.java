public class Main {
    public static void main(String[] args) {
        CheckPermutaion permutaion = new CheckPermutaion();
        String w1 = "sakusaku";
        String w2 = "ssaakkuu";
        String w3 = "ghaifg";
        String w4 = "ajfia";
        boolean result1 = permutaion.check(w1, w2);
        boolean result2 = permutaion.check(w3, w4);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);

    }
}
