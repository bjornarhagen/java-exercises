package Strings;

public class Exercise3 extends Exercise {
    private final String string;

    public Exercise3(String string) throws Exception {
        if (string == null) {
            throw this.notNullException;
        }

        this.string = string;
    }

    public Boolean checkForCharInText(char character) {
        return this.string.indexOf(character) != -1;
    }
}
