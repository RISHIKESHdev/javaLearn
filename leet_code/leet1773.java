package leet_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leet1773 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        String a,b;
        a=in.next();
        b=in.next();
        n=in.nextInt();
        List<List<String>> list = new ArrayList<>(n);
        List<String> innerList = new ArrayList<>(3);
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                innerList.add(in.next());
            }
            list.add(innerList);
            innerList=new ArrayList<>(3);
        }
        System.out.println(countMatches(list,a,b));
        in.close();
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans=0,idx=0;
        idx = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> -1;
        };
        for(List<String> i:items){
            if(i.get(idx).equals(ruleValue)){
                ans+=1;
            }
        }
        return ans;
    }
}
