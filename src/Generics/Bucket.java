package Generics;

import Generics.BucketContentType.Sand;
import Generics.BucketContentType.Water;
import Generics.BucketContentType.WetBucketContent;
import Generics.BucketContentType.MixedBucketContent;

public class Bucket <T extends BucketContent> {
    private BucketContent content;

    public Bucket() {
        this.content = null;
    }

    public Bucket(BucketContent content) {
        this.content = content;
    }

    public void empty() {
        this.content = null;
    }

    public void fill(BucketContent content) throws Exception {
        if (this.content != null) {
            throw new Exception("❌ The bucket is full of " + this.content.getName() + ", you should empty it before you fill it with " + content.getName());
        }

        this.content = content;
    }

    public void fill(Water content) throws Exception {
        if (this.content == null) {
            this.content = content;
        } else {
            this.mix(this.content, content);
        }
    }

    public void mix(BucketContent b, Water w) {
        this.content = new WetBucketContent(b.getName());
    }

    public void mix(BucketContent b1, BucketContent b2) {
        this.content = new MixedBucketContent(b1, b2);
    }

    @Override
    public String toString() {
        String content = "The bucket is empty";

        if (this.content != null) {
            content = "The bucket is filled with " + this.content.getName();
        }

        return content;
    }

    public BucketContent getContent() {
        return this.content;
    }
}
