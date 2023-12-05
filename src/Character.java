public class Character {
    private double base_Speed = 10;
    private double base_Damage = 10;
    private double base_Defense = 10;
    private String name;
    private String job;
    private boolean equipSword = false;
    private boolean equipShield = false;
    private int MaxHp;
    private int Mana;
    private double maxRunSpeed;
    private double RunSpeed;
    private int Level = 0;
    private double atk = 0;
    private double def = 0;
    private double hp;
    Sword sword;
    Shield shield;
    Ring Ring;
    Armor Armor;
    public Character(String name,String job){
        this.name = name;
        this.job = job;
        this.MaxHp = 100;
        this.Mana = 50;
        maxRunSpeed = base_Speed;
        hp = MaxHp;
        if(job.equals("Carry")){
            base_Damage += 5;
        }
        if(job.equals("Warrior")){
            base_Defense += 5;
        }
    }
    public void levelUp(){
        Level = Level + 1;
        MaxHp = 100 + 10 * Level;
        Mana = 50 + (2 * Level);
        maxRunSpeed = base_Speed * (1 + 0.03 * Level);
        RunSpeed = base_Speed * (1 + 0.03 * Level);
        hp = MaxHp;
    }
    public void equipSword(String name){
        sword = new Sword(name,base_Damage);
        System.out.println("-----------------------");
        System.out.println(this.name + " has a Sword now.↴");
        atk = sword.Stat();
        maxRunSpeed = base_Speed * ( 0.1 + 0.04 * Level);
        this.equipSword = true;
        this.equipShield = false;
    }

    public void equipShield(String name){
        shield = new Shield(name,base_Defense);
        System.out.println("-----------------------");
        System.out.println(this.name + " has a Shield now.↴");
        def = shield.Stat();
        maxRunSpeed = base_Speed * (0.1 + 0.08 * Level);
        this.equipShield = true;
        this.equipSword = false;
    }
    public void Sword_levelUp(){
        sword.SwordUp();
        atk = sword.Stat();
    }
    public void Shield_levelUp(){
        shield.ShieldUp();
        def = shield.Stat();
    }
    public void equipRing(String name){
        Ring = new Ring(name,atk,def,maxRunSpeed);
        System.out.println("-----------------------");
        System.out.println(this.name + " has a Ring now.↴");
        System.out.println("+ATK +3\n" + "+DEF +1\n" + "+RunSpeed +3");
        atk = Ring.Ringatk();
        def = Ring.Ringdef();
        maxRunSpeed = Ring.RingRun();
    }
    public void equipArmor(String name){
        Armor = new Armor(name,atk,def);
        System.out.println("-----------------------");
        System.out.println(this.name + " has a Armor now.↴");
        System.out.println("+ATK +1\n" + "+DEF +5");
        atk = Armor.Armoratk();
        def = Armor.Armordef();
    }
    public void unequip(){
        equipSword = false;
        equipShield = false;
        maxRunSpeed= RunSpeed;
    }
    public void  unequipRing(){
        System.out.println("-----------------------");
        System.out.println(this.name + " has taken off his Ring.↴");
        System.out.println("+ATK -3\n" + "+DEF -1\n" + "+RunSpeed -3");
        atk -= 3;
        def -= 1;
        maxRunSpeed -= 3;
    }
    public void  unequipArmor(){
        System.out.println("-----------------------");
        System.out.println(this.name + " has taken off his Armor.↴");
        System.out.println("+ATK -1\n" + "+DEF -5");
        atk -= 1;
        def -= 5;
    }
    public void display(){
        System.out.println("-----------------------");
        System.out.println("Hero name: " + this.name);
        System.out.println("Hero Job: " + this.job);
        System.out.println("Hero HP: " + this.hp);
        System.out.println("Hero ATK: " + this.atk);
        System.out.println("Hero DEF: " + this.def);
        System.out.println("Hero Speed :" + this.maxRunSpeed);
        System.out.println("-----------------------");
    }
}