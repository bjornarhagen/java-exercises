package Strings;

public class Main {
    public static void main(String[] args) throws Exception {
        outputFormattedExerciseString(1);
        Exercise1 ex1 = new Exercise1("Hello world 👋");
        System.out.println("Length of string method 1: " + ex1.getStringLengthMethod1());
        System.out.println("Length of string method 2: " + ex1.getStringLengthMethod2());

        outputFormattedExerciseString(2);
        Exercise2 ex2 = new Exercise2("Lorem ipsum dolor sit amet");
        System.out.println("Words in text: " + ex2.countWordsInTextLine());

        outputFormattedExerciseString(3);
        Exercise3 ex3 = new Exercise3("Lorem ipsum dolor sit amet ☕️");
        System.out.println("Is \"p\" present in text? " + (ex3.checkForCharInText('p') ? "✅ Yes" : "❌ No"));
        System.out.println("Is \"g\" present in text? " + (ex3.checkForCharInText('g') ? "✅ Yes" : "❌ No"));
        System.out.println("Is \"☕️\" present in text? " + (ex3.checkForCharInText("☕️".charAt(0)) && ex3.checkForCharInText("☕️".charAt(1)) ? "✅ Yes" : "❌ No"));

        outputFormattedExerciseString(4);
        Exercise4 ex4 = new Exercise4("Lorem ipsum dolor sit amet");
        System.out.println("Capitalized words: " + ex4.capitalizeWords());

        outputFormattedExerciseString(5);
        Exercise5 ex5 = new Exercise5("Hello World");
        System.out.println("Swap pairs: " + ex5.swapCharacterPairs());
    }

    private static void outputFormattedExerciseString(int exerciseNumber) {
        if (exerciseNumber > 1) {
            System.out.print("------------------\n\n");
        }

        System.out.println("--- Exercise " + exerciseNumber + " ---");
    }
}
