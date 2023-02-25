//A method can only have one varargs parameter
//The varargs parameter must be the last parameter
package array;

public class variableArgs {
    public static void main(String[] args){
        calculateSum();
        calculateSum(2,4);
        calculateSum(2,4,6,8,10);
        calculateSum(new int[]{3,4,6,7});
    }
    public static void calculateSum(int ...a){
        //calculatesum
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
