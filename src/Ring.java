public class Ring implements Accessories{
    private double Atk;
    Ring(){
        Atk = 10;
    }
    public double getStats(){
        return Atk;
    }
    public int typeCheck(){
        return 2;
    }
}
