public class Warrior implements Character{
    private int level;
    private double maxHp;
    private double Hp;
    private double maxMana;
    private double Atk=5;
    private double Def=15;
    private double Mana;

    public Warrior(int level){
        this.level = level;
        maxHp = 100+15*level;
        maxMana = 50+2*level;
        Hp = maxHp;
        Mana = maxMana;
    }
    public void heal(){
        if(Mana < 7)
        Hp += 5;
        if(Hp > maxHp) Hp = maxHp;
        Mana -= 7;
    }

    public void levelUp(){
        level++;
        maxHp = 100+15*level;
        maxMana = 50+2*level;
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Warrior LevelUp!!");
        System.out.println("++++++++++++++++++++++++++");
    }
    public void attack(Character target){
        target.getAttacked(Atk);
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Warrior attacks Carry!!");
        System.out.println("++++++++++++++++++++++++++");
    }
    public void getAttacked(double atk){
        Hp -= atk-0.7*Def;
    }
    public void EquipAccessories(Accessories a){
        if(a.typeCheck() == 1){
            maxHp += a.getStats();
            System.out.println("++++++++++++++++++++++++++");
            System.out.println("The Warrior has Armor!!\n +10 Defense");
            System.out.println("++++++++++++++++++++++++++");
        }else{
            System.out.println("Warriors cannot wear it.");
        }
    }
    public void display(){
        System.out.println("--------------------------");
        System.out.println("Character Class : Warrior");
        System.out.println("Level : " + level);
        System.out.println("MaxHp : " + maxHp);
        System.out.println("Hp : " + Hp);
        System.out.println("MaxMana : " + maxMana);
        System.out.println("Mana : " + Mana);
        System.out.println("Attack : " + Atk);
        System.out.println("Defense : " + Def);
        System.out.println("--------------------------");
    }
}