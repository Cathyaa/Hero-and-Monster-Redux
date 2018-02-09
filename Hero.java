public class Hero{
    public int attack, health, kill, x, y; 
    boolean hasArmor, hasSword;
    public Weapon weapon = new Dagger();
    public int inventory = 2;
    public int hides = 0;
    public int bomb = 0;
    
    public Hero(){
        attack = (int)(Math.random() * 21 + 10);
        health = 100;
        kill = 0;
        x = 14;
        y = 0;
        hasArmor = false;
        hasSword = false;
    }
    
}
