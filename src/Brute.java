package src;
//Jameson
public class Brute {
    public int getHealth(){
        return 1;
    }
    public int getDefense(){
        return 1;
    }

    Double health, defense;
    int hitChance, attackType;
    Brute(){
         health =150.0;
         defense=75.0;

    }
   void setAttackType(int attackType) {
       if(attackType==1){
           this.attackType=200;

       }if(attackType==2){
           this.attackType=450;

       }if(attackType==4){
           this.attackType=850;

       }

   }

    public int getAttackType() {
        return attackType;
    }

    void setHitChance(int hitChance){
        if(hitChance==1){
            this.hitChance=85;

        }
        else if(hitChance==2){

            this.hitChance=65;
        }
        else if(hitChance==3){
            this.hitChance=45;
        }
    }


    boolean didTheyHit(int attackType){
        int random= (int)((Math.random()*100)+1);
        if(attackType==1) {
            if (hitChance < random) {
                return true;

            }
        }
        if(attackType==2) {
            setHitChance(attackType);
            if (hitChance < random) {
                return true;

            }

        }
            if(attackType==3){
                setHitChance(attackType);
                if(hitChance<random){
                    return true;


            }
            }



            return false;

    }

}
