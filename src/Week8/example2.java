package Week8;

import java.util.Random;

public class example2 {
    public static  int[] shuffle(int[] arr){
        int currentIndex = arr.length - 1;
        while (currentIndex > 0){
            Random random = new Random();
            int i = random.nextInt(currentIndex+1);
            int temp = arr[currentIndex];        //
            arr[currentIndex] = arr[i];         //  這三行為交換
            arr[i] = temp;                     //
            currentIndex--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        shuffle(array);
        for(int i : array){              //隨機產生第一次
            System.out.print(i + " ");
        }
        System.out.println();
        shuffle(array);                  //隨機產生第一次
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
        shuffle(array);                  //隨機產生第一次
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}
