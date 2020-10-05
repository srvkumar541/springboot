package practice;

import java.util.*;

public class Comparing_List {
	// Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer>list = new ArrayList<Integer>(2); 
        int firstPersonScore = 0 ;
        int secondPersonScore = 0;
        for (int i =0 ; i<2 ; i++){
            if(a.get(i)>b.get(i)){
                firstPersonScore++;
            }else
            {
                secondPersonScore++;
            }
        }
        list.add(firstPersonScore);
        list.add(secondPersonScore);
        return list;

    }

    public static void main(String[] args)throws Exception{
        List<Integer>a = new ArrayList<Integer>(3);
        List<Integer>b = new ArrayList<Integer>(3);
        System.out.println("enter the first array \n");
        for(int i=0;i<3;i++){
            Scanner scanner = new Scanner(System.in);
            a.add(scanner.nextInt());
        }
        System.out.println("enter the 2nd array \n");
        for(int i=0;i<3;i++){
            Scanner scanner = new Scanner(System.in);
            b.add(scanner.nextInt());
        }
        List<Integer> result = compareTriplets(a, b);
        System.out.println(result);
        }
    }
	


