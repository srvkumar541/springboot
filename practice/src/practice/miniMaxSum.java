package practice;
import java.util.*;
public class miniMaxSum {
	// Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	System.out.println(Arrays.toString(arr));
        int min = 0 ;
        int max = 0 ;
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int x = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=x;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int k=0 ; k <4; k++){
            min = min + arr[k];
        }
        for(int z=1; z<5; z++){
            max = max + arr[z];
        }
        System.out.print(min);
        System.out.print(" ");
        System.out.print(max);
    }

    private static final Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		  int[] arr = new int[5];
	        for (int i = 0; i < 5; i++) {
	            int arrItem = scanner.nextInt();
	            arr[i] = arrItem;
	        }

	        miniMaxSum(arr);

	        scanner.close();
    }

}


