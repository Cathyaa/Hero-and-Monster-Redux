import java.io.*;
import java.util.*;
public class Map{
    Scanner kbReader = new Scanner(System.in);
    Object[][] map = new Object[15][15];
    public int x, y;
    public Object charHero = new Object("Hero");
    
    public Map(){
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 15; j++){
                map[i][j] = new Object("nothing");
            }
        }
        map[14][0] = charHero;
        System.out.println("Hero has been created");
        x = randomPos();
        y = randomPos();
    }
    
    public int randomPos(){
        return (int)(Math.random() * 15);
    }
    
    public void create(){
        int numMon = 0;
        int numFar = 0;
        int numPot = 0;
        while(numMon < 6){
            x = randomPos();
            y = randomPos();
            if(map[x][y].getName().equals("nothing")){
                map[x][y] = new Object("Monster");
                System.out.println("Monster has been created.");
                numMon++;
            }
        }
        
        while(numFar < 2){
            x = randomPos();
            y = randomPos();
            if(map[x][y].getName().equals("nothing")){
                map[x][y] = new Object("Farmer");
                map[x][y].farmer = new Farmer(numFar);
                System.out.println("Farmer has been created.");
                numFar++;
            }
            
        }
        
        while(numPot < 2){
            x = randomPos();
            y = randomPos();
            if(map[x][y].getName().equals("nothing")){
                map[x][y] = new Object("Potion");
                System.out.println("Potion has been created.");
                numPot++;
            }
        }
        while(true)
        {
            x = randomPos();
            y = randomPos();
            if(map[x][y].getName().equals("nothing")){
                map[x][y] = new Object("Boss1");
                System.out.println("First Boss has been created.");
                break;
            }
        }
        while(true)
        {
            x = randomPos();
            y = randomPos();
            if(map[x][y].getName().equals("nothing")){
                map[x][y] = new Object("Boss2");
                System.out.println("Second Boss has been created.");
                break;
            }
        }
        while(true)
        {
            x = randomPos();
            y = randomPos();
            if(map[x][y].getName().equals("nothing")){
                map[x][y] = new Object("Boss3");
                System.out.println("Third Boss has been created.");
                break;
            }
        }
    }
    
    public void move(String direction){
        boolean runAway = false;
        if(charHero.hero.x > 0 && direction.equals("w")){
            System.out.println("Hero moves to the north");
            //if(!map[charHero.hero.x][charHero.hero.y].name.equals("Farmer")){
            map[charHero.hero.x][charHero.hero.y] = new Object("nothing");
            //}
            charHero.hero.x -= 1;
            map[charHero.hero.x][charHero.hero.y] = charHero;
            for(int a = 0; a <= 14; a++){
                for(int b = 0; b <= 14; b++){
                    System.out.print(" [ " + map[a][b].name + " ] ");
                    
                }
                System.out.println("");
            }
            //check(charHero.hero.x, charHero.hero.y, runAway);
            if(check(charHero.hero.x, charHero.hero.y, runAway)){
                for(int a = 0; a <= 14; a++){
                    for(int b = 0; b <= 14; b++){
                        System.out.print(" [ " + map[a][b].name + " ] ");
                    }
                    System.out.println("");
                }
            }
        }else if(charHero.hero.x < 14 && direction.equals("s")){
            System.out.println("Hero moves to the south");
            //if(!map[charHero.hero.x][charHero.hero.y].name.equals("Farmer")){
                map[charHero.hero.x][charHero.hero.y] = new Object("nothing");
            //}
            charHero.hero.x += 1;
            map[charHero.hero.x][charHero.hero.y] = charHero;
            for(int a = 0; a <= 14; a++){
                for(int b = 0; b <= 14; b++){
                    System.out.print(" [ " + map[a][b].name + " ] ");
                    
                }
                System.out.println("");
            }
            //check(charHero.hero.x, charHero.hero.y, runAway);
            if(check(charHero.hero.x, charHero.hero.y, runAway)){
                for(int a = 0; a <= 14; a++){
                   for(int b = 0; b <= 14; b++){
                        System.out.print(" [ " + map[a][b].name + " ] ");
                        
                    }
                    System.out.println("");
                }
            }
        }else if(charHero.hero.y > 0 && direction.equals("a")){
            System.out.println("Hero moves to the east");
            //if(!map[charHero.hero.x][charHero.hero.y].name.equals("Farmer")){
                map[charHero.hero.x][charHero.hero.y] = new Object("nothing");
            //}
            charHero.hero.y -= 1;
            map[charHero.hero.x][charHero.hero.y] = charHero;
            for(int a = 0; a <= 14; a++){
                for(int b = 0; b <= 14; b++){
                    System.out.print(" [ " + map[a][b].name + " ] ");
                    
                }
                System.out.println("");
            }
            //check(charHero.hero.x, charHero.hero.y, runAway);
            if(check(charHero.hero.x, charHero.hero.y, runAway)){
                for(int a = 0; a <= 14; a++){
                for(int b = 0; b <= 14; b++){
                    System.out.print(" [ " + map[a][b].name + " ] ");
                    
                }
                System.out.println("");
            }
            }
            
        }else if(charHero.hero.y < 14 && direction.equals("d")){
            System.out.println("Hero moves to the west");
            //if(!map[charHero.hero.x][charHero.hero.y].name.equals("Farmer")){
                map[charHero.hero.x][charHero.hero.y] = new Object("nothing");
            //}
            charHero.hero.y += 1;
            map[charHero.hero.x][charHero.hero.y] = charHero;
            for(int a = 0; a <= 14; a++){
                for(int b = 0; b <= 14; b++){
                    System.out.print(" [ " + map[a][b].name + " ] ");
                    
                }
                System.out.println("");
            }
            //check(charHero.hero.x, charHero.hero.y, runAway);
            if(check(charHero.hero.x, charHero.hero.y, runAway)){
                for(int a = 0; a <= 14; a++){
                for(int b = 0; b <= 14; b++){
                    System.out.print(" [ " + map[a][b].name + " ] ");
                    
                }
                System.out.println("");
            }
            }
        }else{
            System.out.println("Hero is at the edge of the world");
        }
    }
    
    public boolean check(int a, int b, boolean runAway){
        runAway = false;
        if(map[a][b].name.equals("Monster")){
            return foundMon(a, b, runAway);
        }else if(map[a][b].name.equals("Farmer")){
            return foundFarmer(a, b);
        }else if(map[a][b].name.equals("Potion")){
            foundPotion();
            map[a][b] = new Object("nothing");
        }
        if(a >= 1){
            if(map[a-1][b].name.equals("Monster")){
                return foundMon(a-1, b, runAway);
            }else if(map[a-1][b].name.equals("Farmer")){
                return foundFarmer(a-1, b);
            }else if(map[a-1][b].name.equals("Potion")){
                foundPotion();
                map[a-1][b] = new Object("nothing");
            }
        }
        
        if(a <= 13){
            if(map[a+1][b].name.equals("Monster")){
                return foundMon(a+1, b, runAway);
            }else if(map[a+1][b].name.equals("Farmer")){
                return foundFarmer(a+1, b);
            }else if(map[a+1][b].name.equals("Potion")){
                foundPotion();
                map[a+1][b] = new Object("nothing");
            }
        }
        
        if(b <= 13){
            if(map[a][b+1].name.equals("Monster")){
                return foundMon(a, b+1, runAway);
            }else if(map[a][b+1].name.equals("Farmer")){
                return foundFarmer(a, b+1);
            }else if(map[a][b+1].name.equals("Potion")){
                foundPotion();
                map[a][b+1] = new Object("nothing");
            }
        }
        
        if(b>=1){
            if(map[a][b-1].name.equals("Monster")){
                return foundMon(a, b-1, runAway);
            }else if(map[a][b-1].name.equals("Farmer")){
                return foundFarmer(a, b-1);
            }else if(map[a][b-1].name.equals("Potion")){
                foundPotion();
                map[a][b-1] = new Object("nothing");
            }
        }
        return runAway;
        
    }
    
    public boolean foundMon(int a, int b, boolean runAway){
        System.out.println("There is a trace of monster nearby");
        int num = (int)(2 * Math.random());
        int strength = map[a][b].mon.getStr();
        runAway = false;
        boolean encounter;
        
        if(num == 0){
            encounter = true;
        }else{
            encounter = false;
        }
        
        if(!encounter){
            System.out.println("The hero didn't encounter the monster");
        }
        while(encounter){
            System.out.println("Hero encounters a monster! The monster engages!" +
                           "\n" + "Enter an action (run, attack):" + "\n" + 
                           "Monster speed: " + map[a][b].mon.speed + "\t" + 
                           "Monster strength: " + strength);
            String action = kbReader.next();
            if(charHero.hero.weapon.equals("Axe"))
            {
              if(action.equals("attack") && charHero.hero.health > 0){
                attack(a, b);
                if(map[a][b].mon.health <= 0){
                    encounter = false;
                    System.out.println("The monster is dead.");
                    charHero.hero.hides++;
                }else{
                    charHero.hero.health -= map[a][b].mon.attack;
                    System.out.println("Monster attacks, Hero's health is now " + charHero.hero.health);
                    charHero.hero.health -= map[a][b].mon.attack;
                    System.out.println("Monster attacks, Hero's health is now " + charHero.hero.health);
                }
            }else if(action.equals("run")){
                if(run(a, b)){
                    runAway = true;
                    encounter = false;
                    System.out.println("Hero successfully run away from the monster." + "\n" +"Hero returns to previous position");
                }else{
                    charHero.hero.health -= map[a][b].mon.attack;
                    System.out.println("Hero tries to run! The monster is too fast!" + "\n" +
                    "The monster attacks! Hero’s energy goes down to " + charHero.hero.health);
                };
            }  
            }
            if(action.equals("attack") && charHero.hero.health > 0){
                attack(a, b);
                if(map[a][b].mon.health <= 0){
                    encounter = false;
                    System.out.println("The monster is dead.");
                    charHero.hero.hides++;
                }else{
                    charHero.hero.health -= map[a][b].mon.attack;
                    System.out.println("Monster attacks, Hero's health is now " + charHero.hero.health);
                }
            }else if(action.equals("run")){
                if(run(a, b)){
                    runAway = true;
                    encounter = false;
                    System.out.println("Hero successfully run away from the monster." + "\n" +"Hero returns to previous position");
                }else{
                    charHero.hero.health -= map[a][b].mon.attack;
                    System.out.println("Hero tries to run! The monster is too fast!" + "\n" +
                    "The monster attacks! Hero’s energy goes down to " + charHero.hero.health);
                };
            }
        }
        if(!runAway){
            map[a][b] = new Object("nothing");
        }
        return runAway;
    }
    
    public void attack(int a, int b){
        int miss = map[a][b].mon.speed;
        int prob = (int)(Math.random() * 4 / miss);
        if(prob >= 1){
            System.out.println("The hero attacks");
            map[a][b].mon.health -= charHero.hero.attack;
            if(map[a][b].mon.health <= 0){
                System.out.println("Hero slains a monster");
                charHero.hero.kill++;
            }else{
                System.out.println("Monster's health is now: " + map[a][b].mon.health);
            }
        }else{
            System.out.println("Hero's attack is missed");
            prob = (int)(Math.random() * 4 / miss);
        }
        if(charHero.hero.health <= 0){
            System.out.println("Hero dies");
        }
    
    public boolean run(int a, int b){
        int chance = (int)(Math.random() * 4);
        boolean runAway = false;
        System.out.println(map[a][b].mon.speed);
        if(map[a][b].mon.speed == 0){
            if(chance == 0){
                runAway = false;
            }else{
                runAway = true;
            };
        };
        
        if(map[a][b].mon.speed == 1){
            if(chance == 0 || chance == 1){
                runAway = false;
            }else{
                runAway = true;
            };
        };
        
        if(map[a][b].mon.speed == 2){
            if(chance == 0 || chance == 1 || chance == 2){
                runAway = false;
            }else{
                runAway = true;
            };
        };
        
        if(map[a][b].mon.speed == 3){
            runAway = false;
        }
        return runAway;
    }
    
    public void foundPotion(){
        System.out.println("Hero found a potion.");
        if(charHero.hero.inventory.space>0)
        {
            System.out.println("Picked up the potion. Inventory space available: "+charHero.hero.inventory.space);
            charHero.hero.inventory.space++;
        }
        else
        {
            System.out.println("No space available.");
        }
    }
    
    public void foundSword(){
        System.out.println("Hero found a sword.");
        Weapon sword = new Weapon();
        charHero.hero.attack = sword.damage;
    }
    
    public boolean foundFarmer(int a, int b){
        boolean notDisappear = true;
        System.out.println("Hero meets a scared farmer." + "\n" + map[a][b].farmer.lines);
        if(map[a][b].farmer.type.equals("armor") && charHero.hero.kill >= 2){
            charHero.hero.hasArmor = true;
            notDisappear = false;
            System.out.println("Hero receives an armor.");
        }else if(map[a][b].farmer.type.equals("sword") && charHero.hero.kill >= 4){
            charHero.hero.hasSword = true;
            notDisappear = false;
            System.out.println("Hero receives a sword.");
        }
        
        if(!notDisappear){
                map[a][b] = new Object("nothing");
            }
        return notDisappear;
    }
    
    public boolean checkEnd(){
        boolean end = false;
        if(charHero.hero.kill == 6){
            System.out.println("All the monster has been slain." + "\n" + 
            "The village is saved from monster's invasion."  + "\n" + 
            "Hero fly up the sky and disappear forever." + "\n" + 
            "The story of a hero ended." );
            end = true;
        }
        if(charHero.hero.health <= 0){
            System.out.println("The hero dies.");
            end = true;
        }
        return end;
    }
    
}
