
package defencesystemcw;

public class DefenceSystemCW {

    public static void main(String[] args) {
        Observable ob = new Observable();
        ob.addDefenceSystem(new Helicopter());
        ob.addDefenceSystem(new Tank());
        ob.addDefenceSystem(new Submarine());
       
    }
    
}
