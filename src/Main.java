import com.sun.org.apache.xpath.internal.SourceTree;
import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    //variable allowing you to track where you're at in the game.
    private static String question;
    private static String player = "";

    public static void main(String[] args) {

//Start game
        boolean playing = true;
        while (playing) {


            question = "0";
        }

        //Game loop
        while (true) {
            if (player.equalsIgnoreCase("exit")) {
                System.exit(0);
            } else {

//controls narrative
                switch (question) {//If question is equal to...

                    case "0":
                        System.out.println("You wake up to find yourself in a barren moor. " +
                                "Grey foggy clouds float overhead and they menacingly glare back at you all around in the murky grey waters. " +
                                "You're cold and soaked. You can't recall where you are or how you got here." +
                                "\n" +
                                "\nWhat is this place?");
                        question = "1";
                        break;

                    case "1":
                        player = in.next();
                        question = "1A";
                        break;

                    case "1A":
                        System.out.println("\n\nYou're really cold and are not sure if this is real or a dream. Your teeth begin to chatter. What are you going to do?" +
                                "\n[1]Look around you for any clues as to how you can get out of here." +
                                "\n[2]Stay where you are and hope help comes along soon");
                        question = "2";
                        break;

                    case "2":
                        switch (player = in.next()) {
                            case "1":
                                System.out.println("\n\nWhat is that? It looks like a watch.");
                                question = "2A";
                                break;
                            case "2":
                                System.out.println("\n\n");
                                question = "1A";
                                break;
                        }
                        break;
                    case "2A":
                        //Player looks closer at the watch-like object.
                        //Dials on watch like object are moving as the player moves.
                            System.out.println("\n[1]Do you want tp go East towards the Ocean Grotto" + "\n\nYou need to focus. You notice that the dials point to a letter. Wait! Its a Compass." +
                                    "\n[2]Do you want to go North towards the Cave Entrance");
                            question = "2A";
                            break;
                        }




                }
                //Quit commands
                if (in.equals("quit") ) {
                    System.out.println("Goodbye!");
                    playing = false;
                    }
                else {
                System.out.println("You can't do that.");
            }
        }
    }

}


