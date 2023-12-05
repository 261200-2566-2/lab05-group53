public class Armor {
    private String name;
    private double atk;
    private double def;
    private double Armoratk;
    private double Armordef;
    public Armor(String name,double atk,double def){
        this.name = name;
        Armoratk = atk + 1;
        Armordef = def + 5;
    }
    public double Armoratk(){
        return Armoratk;
    }
    public double Armordef(){
        return Armordef;
    }
}
