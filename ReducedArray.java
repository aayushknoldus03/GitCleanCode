package gitcleancode;

import java.util.*;

public class ReducedArray {
    public static void main(String[] args) {
        int[] Array = {5, 10, 40, 30, 20};
        reducingArray(Array);
    }

    //function for reducing array
    static void reducingArray(int[] Array){
        HashMap<Integer,Integer>map = new HashMap<>();
        int[] sortedArray=new int [Array.length];

        for(int index=0;index<Array.length;index++){
            sortedArray[index]=Array[index];
        }

        Arrays.sort(sortedArray);

        for(int index=0;index<Array.length;index++){
        map.put(sortedArray[index],index);
        }

        for(int index=0;index<Array.length;index++){
            Array[index]= map.get(Array[index]);
            System.out.print(Array[index]+ " ");
        }
    }
}
