import java.util.Random;
public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        shuffleArray(array);
        for(int num : array){
            System.out.print(num + " ");
        }
    }
    public static void shuffleArray(int[] array) {
        Random rand = new Random();
        for(int i = array.length - 1; i>0; i--) {
            int j = rand.nextInt(i+1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}