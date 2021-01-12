package Generics;

public class Bucket <T extends BucketContent> {
    private T content;

    public Bucket() {
        this.content = null;
    }

    public Bucket(T content) {
        this.content = content;
    }

    public void empty() {
        this.content = null;
    }

    public void fill(Water content) throws Exception {
        if (this.content == null) {
            this.content = (T) content;
        } else {
            this.content = (T) new Sand("wet " + this.content.getName());
        }
    }

    public void fill(T content) throws Exception {
        if (this.content != null) {
            throw new Exception("❌ The bucket is full of " + this.content.getName() + ", you should empty it before you fill it with " + content.getName());
        }

        this.content = content;
    }

    @Override
    public String toString() {
        String content = "The bucket is empty";

        if (this.content != null) {
            content = "The bucket is filled with " + this.content.getName();
        }

        return content;
    }
}
