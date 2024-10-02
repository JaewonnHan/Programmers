import java.io.*;
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
      ArrayList<Integer> arrayList = new ArrayList<>();
      int value = -1;
      for(int i=0; i<arr.length; i++){
          if(arr[i] != value){
              arrayList.add(arr[i]);
              value = arr[i];
          }
      }
      return arrayList.stream().mapToInt(i->i).toArray();
    }
}