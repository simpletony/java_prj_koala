import  java.util.*;
import static net.mindview.util.Print.*;

public class MathOps {
    public static void main(String [] args) {
        Random rand = new Random(74);
        int i, j, k;
        j = rand.nextInt(100) + 1;
        print("j : " + j);
        k = rand.nextInt(100) + 1;
        print("k : " + k);
        i = j + k;
        print("j + k : " + i );
        i = j - k;
        print("j - k : " + i );
        i = k/j;
        print("k/j : " + i );
        i = k*j;
        print("k*j : " + i );
        i = k%j;
        print("k%j : " + i );
        j %= k;
        print("j%= k : " + j );
// Floating - point number tests
        float u, v, w;
        v = rand.nextFloat();
        print("v : " + v );
        w = rand.nextFloat();
        print("w : " + w );
        u = v + w;
        print("v + w : " + u);
        u = v - w;
        print("v - w : " + u);
        u = v * w;
        print("v * w : " + u);
        u = v / w;
        print("v / w : " + u);
// The following also works for char,
// byte, short, int, long, and double
        u += v;
        print("u += v : " + u);
        u -= v;
        print("u -= v : " + u);
        u *= v;
        print("u *= v : " + u);
        u /= v;
        print("u /= v : " + u);
    } 
}
