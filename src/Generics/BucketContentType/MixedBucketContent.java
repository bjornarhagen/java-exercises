package Generics.BucketContentType;

import Generics.BucketContent;

public class MixedBucketContent implements BucketContent {
    private final String name;

    public MixedBucketContent(String name) {
        this.name = name;
    }

    public MixedBucketContent(BucketContent b1, BucketContent b2) {
        this.name = b1.getName() + " mixed with " + b2.getName();
    }

    public String getName() {
        return this.name;
    }
}
