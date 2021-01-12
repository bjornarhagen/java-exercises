import Generics.Bucket;
import Generics.BucketContentType.Water;
import Generics.BucketContentType.Sand;
import Generics.BucketContentType.Rocks;

public class Main {
    public static void main(String[] args) throws Exception {
        Sand sand = new Sand();
        Bucket<?> bucket = new Bucket(sand);
//        bucket.fill(new Water());

//        bucket.empty();
//        bucket.fill(new Rocks());

        System.out.println(bucket);
    }
}



