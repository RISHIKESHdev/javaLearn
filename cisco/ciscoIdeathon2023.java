package cisco;

import java.util.Scanner;

public class ciscoIdeathon2023 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m,maxPack,rate;
        rate = in.nextInt();
        maxPack = in.nextInt();
        n=in.nextInt();
        m=in.nextInt();
        int[][] nums = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                nums[i][j]=in.nextInt();
            }
        }
        System.out.println(dropCount(nums,rate,maxPack));
        in.close();
    }
    public static int dropCount(int[][] nums,int rate,int maxPack){
        int ans=0,pack=nums[0][1];
        for(int i=1;i<nums.length;i++){
            pack = pack - ((nums[i][0]-nums[i-1][0])*rate) + nums[i][1];
            if(pack<0){
                pack=0;
            }
            if(pack>maxPack){
                ans= ans + pack-maxPack;
                pack = maxPack;
            }   
        }
        return ans;
    }
}
