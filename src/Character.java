package src;
//Beau
public class Character {
    //variables
        //need hitChance
        //update datatypes
        //update charcater types


        //String attackType;
        Mage m = new Mage();
        Brute b = new Brute();
        Jester j = new Jester();
        Thief t = new Thief();
        String fighterClass;
    //constructors
        public Character(){

        }

       public  Character(String characterClass) {
            if (characterClass.equalsIgnoreCase("Brute")) {
                b = new Brute();
                fighterClass="Brute";
            }
            else if(characterClass.equalsIgnoreCase("Thief")) {
                t = new Thief();
                fighterClass="Thief";
            }
            else if(characterClass.equalsIgnoreCase("Mage")) {
                m = new Mage();
                fighterClass="Mage";
            }
            else if (characterClass.equalsIgnoreCase("Jester")) {
                j = new Jester();
                fighterClass="Jester";
            }
        }


        public int getHealth(){
            if (fighterClass.equalsIgnoreCase("Brute")) {
                return this.b.getHealth();
            }
            else if(fighterClass.equalsIgnoreCase("Thief")) {
                return this.t.getHealth();
            }
            else if(fighterClass.equalsIgnoreCase("Mage")) {
                return  this.m.getHealth();
            }
            else if (fighterClass.equalsIgnoreCase("Jester")) {
                return this.j.getHealth();
            }
            return -99;
        }



        public int getDefence(String fighterClass){
            if (fighterClass.equalsIgnoreCase("Brute")) {
                return this.b.getDefense();
            }
            else if(fighterClass.equalsIgnoreCase("Thief")) {
                return this.t.getDefense();
            }
            else if(fighterClass.equalsIgnoreCase("Mage")) {
                return this.m.getDefense();
            }
            else if (fighterClass.equalsIgnoreCase("Jester")) {
                return this.j.getDefense();
            }
            return -99;
        }


        //make a method that returns the fighterClass variable
   
}
