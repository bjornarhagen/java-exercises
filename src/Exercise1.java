import java.util.Arrays;

public class Exercise1 extends Exercise {
    private final String string;

    public Exercise1(String string) throws Exception {
        if (string == null) {
            throw this.notNullException;
        }

        this.string = string;
    }

    public int getStringLengthMethod1() {
        int count = 0;
        String[] chars = this.string.split("");

        for (int i = 0; i < chars.length; i++) {
            count++;
        }

        return count;
    }

    public long getStringLengthMethod2() {
        return Arrays.stream(this.string.split("")).count();
    }
}
