package Generics.BucketContentType;

import Generics.BucketContent;

public class Rocks implements BucketContent {
    private String name;

    public Rocks() {
        this.name = "rocks";
    }

    public Rocks(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
