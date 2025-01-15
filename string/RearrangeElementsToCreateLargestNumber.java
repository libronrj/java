import java.util.Arrays;

public class RearrangeElementsToCreateLargestNumber{

    public static void main(String[] args) {

        int[] array = {99, 24, 31, 78, 85};
        rearrangeElementsToCreateLargestNumber(array);
        
    }

    public static void rearrangeElementsToCreateLargestNumber(int[] array) {

        for (int i = 0; i < array.length; i++) {
            
            for (int j = i+1; j < array.length; j++) {
                
                String ij = ""+array[i] + array[j];
                String ji = ""+array[j] + array[i];

                if(ij.compareTo(ji) < 0){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(array));

    }
}