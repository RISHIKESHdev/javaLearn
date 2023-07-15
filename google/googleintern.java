package google;

import java.util.HashMap;
import java.util.Scanner;

public class googleintern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n,k=0,ans=0;
        HashMap<Integer,Integer> khash = new HashMap<Integer,Integer>();
        n=in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                k=nums[i]+nums[j];
                if(khash.getOrDefault(k,0)==0){
                    khash.put(k,1);
                }
            }
        }
        for(Integer key: khash.keySet()){
            ans=Math.max(ans,pairEqual(nums,n,key));
        }
        System.out.println(ans);
        in.close();
    }
    public static int pairEqual(int[] nums,int n,int k){
        int ans=0,aux,partner;
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(hash.get(nums[i])!=null){
                aux=hash.get(nums[i]);
                hash.put(nums[i],aux+1);
            }else{
                hash.put(nums[i],1);
            }
        }
        for(Integer key: hash.keySet()){
            partner=k-key;
            if(hash.getOrDefault(key,0)!=0 && hash.getOrDefault(partner,0)!=0){
                if(partner==key){
                    ans=ans+hash.getOrDefault(key,0)/2;
                }else{
                    ans=ans+Math.min(hash.getOrDefault(key,0),hash.getOrDefault(partner,0));
                }
                hash.put(key,0);
                hash.put(partner,0);
            }
        }
        return ans;
    }
}
