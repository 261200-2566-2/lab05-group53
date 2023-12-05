public class Main {
    public static void main(String[] args) {
        Character H1 = new Character("Tom","Carry");
        Character H2 = new Character("Jerry","Warrior");
        H1.equipSword("OOP");
        H1.levelUp();
        H1.equipRing("Boom");
        H1.display();
        H2.equipSword("Box");
        H2.equipArmor("pop");
        H2.levelUp();
        H2.display();
        H1.unequipRing();
        H1.display();
        H1.Sword_levelUp();
        H2.equipShield("Dang");
        H2.unequip();
        H2.display();

    }
}
