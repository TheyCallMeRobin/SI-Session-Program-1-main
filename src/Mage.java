package src;
//Zach
public class Mage {
    //Mage: H-100 D-60
    //  * hitChance- int
    //    * light: B-85% T-95% M-90% J-100%
    //    * medium: B-65% T-80% M-70% J-20%
    //    * heavy: B-45% T-65% M-50% J-1%
    //  * attack type- int
    //    * light: B-200 T-130 M-175 J-55
    //    * medium: B-450 T-280 M-325 J-180
    //    * heavy: B-800 T-450 M-666 J-1000
    int health;
    int defense;
    int hitChance;
    int attackType;

    Mage() {
        health = 100;
        defense = 60;
    }

    Mage(int health, int defense) {
        this.health = health;
        this.defense = defense;
    }

    public void setAttackType(int hitChance) {
        this.attackType = attackType;
        if (attackType == 1) {
        }
    }

    public void setHitChance(int hitChance) {
        this.hitChance = hitChance;
    }

    public int getHealth() {
        return health;
    }


    public int getDefense() {
        return defense;
    }
}
