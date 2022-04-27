/*
 * Brute: H-150 D-75
 * Thief: H-80 D-125
 * Mage: H-100 D-60 //like shulk from Smash
 * Jester: H-35 D-300
 * Health- int
 * hitChance- int
 * light: B-85% T-95% M-90% J-100%
 * medium: B-65% T-80% M-70% J-20%
 * heavy: B-45% T-65% M-50% J-1%
 * attack type- int
 * light: B-200 T-130 M-175 J-55
 * medium: B-450 T-280 M-325 J-180
 * heavy: B-800 T-450 M-666 J-1000
 * defense- int
 */

package src;
//Robin
public class Thief {
    private int health;
    private int defense;
    private final int[] hitChance = {95, 80, 65};
    private final int[] attackType = {130, 280, 450};

    Thief(){
        health = 80;
        defense=125;
    }

    public int[] getHitChance(){
        return hitChance;
    }


    public int[] getAttackType(){
        return attackType;
    }


    public int getHealth (){
        return this.health;
    }

    public int getDefense (){
        return this.defense;
    }

    public void decreaseHealth(int hpLost){
        if(defense>0){
            this.defense -= hpLost;
        }
        else if(health>0){
            this.health -= hpLost;
        }
    }

}
