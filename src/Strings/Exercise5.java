package Strings;

public class Exercise5 extends Exercise {
    private final String string;

    public Exercise5(String string) throws Exception {
        if (string == null) {
            throw this.notNullException;
        }

        this.string = string;
    }

    public String swapCharacterPairs() {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < this.string.length(); i+=2) {
            if (this.string.length() > i+1) {
                newString.append(this.string.charAt(i+1));
            }

            newString.append(this.string.charAt(i));
        }

        return newString.toString();
    }
}
