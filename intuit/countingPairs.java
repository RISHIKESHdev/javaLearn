package intuit;

import java.util.HashMap;
import java.util.Scanner;

public class countingPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,k;
        n=in.nextInt();
        k=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(countPair(nums,n,k));
        in.close();
    }
    public static int countPair(int[] nums,int n,int k){
        HashMap<Integer,Integer> hashFreq = new HashMap<>();
        int count=0,pair=-1;
        for(int i=0;i<n;i++){
            if(hashFreq.getOrDefault(nums[i],0)==0){
                hashFreq.put(nums[i],1);
            }else{
                hashFreq.put(nums[i],hashFreq.get(nums[i])+1);
            }
        }
        if(k==0) return hashFreq.size();
        for(Integer i : hashFreq.keySet()){
            pair=hashFreq.get(i)+k;
            if(hashFreq.containsKey(pair)) count+=1;
        }
        return count;
    }
}


// Given an integer 'K' and a list of integers, count the number of distinct valid pairs of integers (a,b) in the list for which "a+k=b". Two pairs of integers (a,b) and (c,d) are considered distinct if at least one element of (a,b) does not also belong to (c,d). Note that the elements in a pair might be the same element in the array. An instance of this is below where k=0.

// -> n=4
//    nums = [1,1,1,2]
//    k=1

// -> n=2
//    nums = [1,2]
//    k=0