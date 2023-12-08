public class Armor implements Accessories{
    private final double Def;
    Armor(){
        Def = 10;
    }
    public double getStats(){
        return Def;
    }
    public int typeCheck(){
        return 1;
    }
}