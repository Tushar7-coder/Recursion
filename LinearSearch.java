package Recursion;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,4,2,6};
        int target = 3;
        int index = 0;
//        System.out.println(find(arr,target,index));
//        System.out.println(findindex(arr,target,index));
        System.out.println(findIndexLast(arr,target,index));
    }
    static boolean find(int [] arr , int target ,int index){
        if (arr[index]== arr.length){
            return false;
        }
        if (arr[target]==arr[index] ){
            return true;
        }
        return find(arr,target,index+1);
    }
    static int findindex(int[] arr, int target,int index ){
        if (index>=arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        else return findindex(arr,target,index+1);
    }
    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
