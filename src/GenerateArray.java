import java.util.ArrayList;
import java.util.Objects;

public class GenerateArray {
    public static int[] randomArrayOfIntegers(int countOfElements){
        int [] randomArray = new int[countOfElements];
        double newElem =0;
        for( int i =0; i<countOfElements; i++){
                newElem = Math.random()*countOfElements;
                randomArray[i]=(int)newElem;
        }
        return randomArray;
    }
}
