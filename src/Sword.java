public class Sword {
    private String name;
    private int Swordlevel = 0;
    private double base_Damage;
    private double Sword_Damage;
    public Sword (String name,double base_Damage){
        this.name = name;
        this.base_Damage = base_Damage;
        Sword_Damage = base_Damage;
    }
    public void SwordUp(){
        Swordlevel += 1;
        Sword_Damage = base_Damage * (1 + 0.1 * Swordlevel);
    }
    public double Stat(){
        return Sword_Damage;
    }
}