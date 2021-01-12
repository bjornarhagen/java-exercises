package Generics;

public class Sand implements BucketContent {
    private String name;

    public Sand() {
        this.name = "sand";
    }

    public Sand(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
