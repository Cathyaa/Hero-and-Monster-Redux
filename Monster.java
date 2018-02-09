public class Monster{
    int attack, health, speed, str;
    String direction;
    public Monster(){
        attack = (int)(Math.random() * 30 + 1) - 10;
        if(attack <= 0){
            attack = 1;
        }
        health = (int)(Math.random() * 100 + 1);
        speed = (int)(Math.random() * 4);
        str = (int)(Math.random() * 4);
        int prob = (int)(Math.random() * 4);
        if(prob == 0){
            direction = "w";
        }else if(prob == 1){
            direction = "a";
        }else if(prob == 2){
            direction = "s";
        }else{
            direction = "d";
        }
    }
    
    public String toString(){
        return ("Attack: " + attack + "\n" + "Health: " + health + "\n"
        + "speed: " + speed + "\n" + "strength: " + str);
    }
    
    public int getStr(){
        return str;
    }
}
