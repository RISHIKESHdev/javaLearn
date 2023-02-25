package array;

public class Player {
    public static void main(String[] args){
        String[] players = new String[6];
        String[] player = new String[]{"sf","uji","aw","dfh","Rt","fdg"};
        //String[] player = {"sf","uji","aw","dfh","Rt","fdg"};
        System.out.println(player[1]);
        //uji in array
        for(int i=0;i<player.length;i++){
            //System.out.println(i +""+ player[i]);
            if(player[i].equals("uji")){
                System.out.println("Player found");
            }
        }
    }
}
