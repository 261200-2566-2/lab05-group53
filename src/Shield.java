public class Shield {
    private String name;
    private int Shieldlevel = 0;
    private double base_Defense;
    private double Shield_Defense;
    public Shield (String name,double base_Defense){
        this.name = name;
        Shield_Defense = base_Defense;
    }
    public void ShieldUp(){
        Shieldlevel += 1;
        Shield_Defense = base_Defense * (1 + 0.05 * Shieldlevel);
    }
    public double Stat(){
        return Shield_Defense;
    }
}