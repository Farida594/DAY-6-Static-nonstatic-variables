public class Player{
public static int totalPlayers=0;
public String playerName;

public static void main(String[] args){
totalPlayers++;
Player obj1 = new Player();
obj1.playerName="Farida";
Player obj2 = new Player();
obj2.playerName="Noori";
totalPlayers++;
System.out.println("TotalPlayers:"+totalPlayers);
System.out.println("First Player Name:" + obj1. playerName);
System.out.println("Second Player Name:" + obj2.playerName);
}
}