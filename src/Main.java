import Generics.Bucket;
import Generics.BucketContentType.Water;
import Generics.BucketContentType.Sand;
import Generics.BucketContentType.Rocks;

public class Main {
    public static void main(String[] args) throws Exception {
        Rocks rocks = new Rocks();
        Sand sand = new Sand();
        Water water = new Water();
        Bucket<?> bucket = new Bucket(sand);
        bucket.fill(water);
        bucket.mix(bucket.getContent(), rocks);
        bucket.mix(bucket.getContent(), sand);

//        bucket.empty();
//        bucket.fill(new Rocks());

        System.out.println(bucket);
    }
}



