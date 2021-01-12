package Generics;

public class Water implements BucketContent {
    private String name;

    public Water() {
        this.name = "water";
    }

    public Water(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
