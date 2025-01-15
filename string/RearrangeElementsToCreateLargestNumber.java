public class RearrangeElementsToCreateLargestNumber{

    public static void main(String[] args) {

        int[] array = {99, 24, 31, 78, 85};
        int[] rearrangedArray = rearrangeElementsToCreateLargestNumber(array);
        for(int num: rearrangedArray)
            System.out.print(num);
        
    }

    public static int[] rearrangeElementsToCreateLargestNumber(int[] array) {

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
        return array;
    }
}
