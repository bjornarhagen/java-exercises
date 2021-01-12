import Generics.Bucket;
import Generics.Water;
import Generics.Sand;
import Generics.Rocks;

public class Main {
    public static void main(String[] args) throws Exception {
        Bucket<Sand> bucket = new Bucket(new Sand());
        bucket.fill(new Water());

//        bucket.empty();
//        bucket.fill(new Rocks());

        System.out.println(bucket);
    }
}



