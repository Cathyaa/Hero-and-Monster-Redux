public class Boss extends Monster
{
    Satchel satchelDrop = null;
    Weapon weaponDrop = null;
    Potion phoenixDrop = null;
    public Boss(int atk, int hlth, int spd, Satchel drop1, Weapon drop2, Potion drop3)
    {
        attack = atk;
        health = hlth;
        spd = speed;
        satchelDrop = drop1;
        weaponDrop = drop2;
        phoenixDrop = drop3;
    }
}
