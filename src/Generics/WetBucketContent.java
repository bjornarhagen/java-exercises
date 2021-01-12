package Generics;

public class WetBucketContent implements BucketContent {
    private final String name;

    public WetBucketContent(String name) {
        this.name = "wet " + name;
    }

    public String getName() {
        return this.name;
    }
}
