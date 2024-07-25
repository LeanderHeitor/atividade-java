package array;
import java.util.Arrays;

public class exercicioCinco {

    public static void main(String[] args) {
        int arrayA[] = {81, 25, 34, 17, 50, 64};
        int arrayB[] = new int[arrayA.length]; 
        System.out.println("array original: " + Arrays.toString(arrayA));
        
        for (int x = arrayA.length - 1; x >= 0; x--) {
            arrayB[arrayA.length - 1 - x] = arrayA[x];
        }
        
        Arrays.sort(arrayB);
        System.out.println("arrayB sorted: " + Arrays.toString(arrayB));
    }
}
