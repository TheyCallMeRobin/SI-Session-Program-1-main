//Caz
package src;

import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        //variables
            //int health=1;
            Character c1= new Character();
            Character c2= new Character();

        //input


        //logic
        System.out.println("Welcome to the Mega Death Battle Extravaganza!");
        System.out.println("Choose your fighter:");
        System.out.println("\tBrute");
        System.out.println("\tThief");
        System.out.println("\tMage");
        System.out.println("\tJester");

        boolean badAnswer ;
        do{
            System.out.print("Player 1 chose your character: ");
            String a = input.nextLine();
            if (a.equalsIgnoreCase("Brute") ||a.equalsIgnoreCase ("Thief") ||a.equalsIgnoreCase ("Mage") ||a.equalsIgnoreCase ("Jester")) {
                badAnswer = false;
                c1 = new Character(a);
            }
            else{
                badAnswer=true;
            }
        }while(badAnswer);

        badAnswer=true;
        while(badAnswer){
            System.out.print("Player 2 chose your character: ");
            String b = input.nextLine();
            if (b.equalsIgnoreCase("Brute") ||b.equalsIgnoreCase ("Thief") ||b.equalsIgnoreCase ("Mage") ||b.equalsIgnoreCase ("Jester")) {
                badAnswer = false;
                c2 = new Character(b);
            }

        }

            while(c1.getHealth()>0 && c2.getHealth()>0){
                //make this actually work
                if(c1.getHealth()>0 && c2.getHealth()>0) {
                    System.out.println("Choose your attack: ");
                    System.out.println("\t1-Light attack");
                    System.out.println("\t2-Medium attack");
                    System.out.println("\t3-Heavy attack");
                    String atk = input.nextLine();
                    String atk2 = input.nextLine();
                    System.out.print("Player 1 chose " + atk + "! \nPlayer 2`s health is now: "+c1.getHealth());
                    System.out.print("Player 2 chose " + atk2 + "! \nPlayer 1`s health is now: "+c2.getHealth());
                }
                if(c1.getHealth()<0){
                    System.out.println("Player 1 has died! Player 2 is victorious!");
                }
                if(c2.getHealth()<0){
                    System.out.println("Player 2 has died! Player 1 is victorious!");
                }

            }


        //output
            //System.out.println("You have been killed");
    }
}
