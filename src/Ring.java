public class Ring {
    private String name;
    private double RingStat;
    private double base_Defense;
    private double Ringatk;
    private double Ringdef;
    private double RingRun;
    private int atk;
    private int def;
    public Ring(String name,double atk,double def,double run){
        this.name = name;
        Ringatk = atk + 3;
        Ringdef = def + 1;
        RingRun = run + 3;
    }
    public double Ringatk(){
        return Ringatk;
    }
    public double Ringdef(){
        return Ringdef;
    }
    public double RingRun(){
        return RingRun;
    }
}
