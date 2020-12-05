import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise4 extends Exercise {
    private final String string;

    public Exercise4(String string) throws Exception {
        if (string == null) {
            throw this.notNullException;
        }

        this.string = string;
    }

    public String capitalizeWords() {
        return Arrays.stream(this.string.split(" ")).map(Exercise4::capitalizeWord).collect(Collectors.joining(" "));
    }

    private static String capitalizeWord(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}
