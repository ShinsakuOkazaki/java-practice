public class Main {

    public static void main(String args[]) {
        String testFalse = "sakusaku";
        String testTrue = "abcdef";
        IsUnique solution = new IsUnique();
        boolean resultFalse = solution.isUnique(testFalse);
        boolean resultTrue = solution.isUnique(testTrue);
        System.out.println("resultFalse is " + resultFalse);
        System.out.println("resultTrue is " + resultTrue);
    }

}
