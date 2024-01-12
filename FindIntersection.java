package week1.day2;

import java.util.ArrayList;
import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		int [] arr1 = {3,2,11,4,6,7};//
	    int [] arr2 = {1,2,8,4,7,9}; 

	    Arrays.sort(arr1);//2,3,4,6,7,11
	    Arrays.sort(arr2);//1,2,4,7,8,9
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    int i =0 ;
	    int j =0;
	    while(i< arr1.length && j<arr2.length){
	    if (arr1[i]>arr2[j]){
	        j++;

	    }else if (arr1[i]<arr2[j]){
	        i++;

	    }else {
	        result.add(arr1[i]);
	        i++;
	        j++;
	    }
	    }
	    System.out.println(result);
	}
}
/*public static String[] intersectForeach(String[] arr1, String[] arr2){
    ArrayList<String> result = new ArrayList<>();
    for(int i = 0; i < arr1.length; i++){
        for(int r = 0; r < arr2.length; r++){
            if(arr1[i].equals(arr2[r]))
                result.add(arr1[i]);
        }
    }
    return result.toArray(new String[0]);
}*/
