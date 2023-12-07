public class Carry implements Character{
    private int level;
    private double maxHp;
    private double Hp;
    private double maxMana;
    private double Atk = 15;
    private double Def = 5;
    private double Mana;
    public Carry(int level){
        this.level = level;
        maxHp = 50 + 10 * level;
        maxMana = 50 + 4 * level;
        Hp = maxHp;
        Mana = maxMana;
    }
    public void heal(){
        if(Mana < 10)
        Hp += 10;
        if(Hp > maxHp) Hp = maxHp;
        Mana -= 10;
    }
    public void levelUp(){
        level++;
        maxHp = 50+10*level;
        maxMana = 50+4*level;
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Carry LevelUp!!");
        System.out.println("++++++++++++++++++++++++++");
    }
    public void attack(Character target){
        target.getAttacked(Atk);
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Carry attacks Warrior!!");
        System.out.println("++++++++++++++++++++++++++");

    }
    public void getAttacked(double atk){
        Hp -= atk-0.3 * Def;
        if(Hp < 0) Hp = 0;
    }
    public void EquipAccessories(Accessories a){
        if(a.typeCheck() == 2){
            Atk += a.getStats();
            System.out.println("++++++++++++++++++++++++++");
            System.out.println("The Carry has Ring!!\n +10 Attack");
            System.out.println("++++++++++++++++++++++++++");
        }else{
            System.out.println("Carry cannot wear it.");
        }
    }
    public void display(){
        System.out.println("--------------------------");
        System.out.println("Character Class : Carry");
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

