import java.util.Arrays;

public class Exercise2 extends Exercise {
    private final String string;

    public Exercise2(String string) throws Exception {
        if (string == null) {
            throw this.notNullException;
        }

        this.string = string;
    }

    public int countWordsInTextLine() {
        return this.string.split(" ").length;
    }
}
