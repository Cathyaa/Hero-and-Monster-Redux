public class Object{
    public String name;
    public int countF = 0;
    public Hero hero;
    public Monster mon;
    public Farmer farmer;
    public Potion potion;
    public boolean show = false;
    public Boss boss1;
    public Boss boss2;
    public Boss boss3;
    
    public Object(String n){
        name = n;
        
        if(name.equals("Hero")){
            hero = new Hero();
            mon = null;
            farmer = null;
            potion = null;
            boss1 = null;
            boss2 = null;
            boss3 = null;
        }else if(name.equals("Monster")){
            mon = new Monster();
        }else if(name.equals("Farmer")){
            farmer = new Farmer(countF);
            countF++;
        }else if(name.equals("Potion")){
            potion = new Potion();
        }else if(name.equals("Boss1")){
            boss1 = new Boss(50,200,5,100);
        }
        else if(name.equals("Boss2")){
            boss2 = new Boss(50, 300, 5, 200);
        }
        else if(name.equals("Boss3")){
            boss3 = new Boss(50, 500, 5, 1000);
        }
    }
    
    public String getName(){
        return name;
    }
}
