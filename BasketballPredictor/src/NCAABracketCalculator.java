
/**
 * Kai'lani Woodard
 * NCAA Basketball Tournament Predictor
 * Programming III - AP CS
 * 3-1-2019
 */

import java.util.Random;
import java.util.ArrayList;

public class NCAABracketCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //Create Arrays for each respective region
        ArrayList<Team> south_round1 = new ArrayList<>();

        ArrayList<Team> west_round1 = new ArrayList<>();

        ArrayList<Team> east_round1 = new ArrayList<>();

        ArrayList<Team> midWest_round1 = new ArrayList<>();

        /**
            Teams and Power Rankings are filled with NCAA 2017-2018
        */
        
            //Add teams to the South region
        south_round1.add(new Team("Virgina", 4, 1));
        south_round1.add(new Team("UMBC", 62, 16));
        south_round1.add(new Team("Creighton", 24, 8));
        south_round1.add(new Team("Kansas State", 43, 9));
        south_round1.add(new Team("Kentucky", 16, 5));
        south_round1.add(new Team("Davidson", 52, 12));
        south_round1.add(new Team("Arizona", 19, 4));
        south_round1.add(new Team("Buffalo", 53, 13));
        south_round1.add(new Team("Miami", 33, 6));
        south_round1.add(new Team("Loyola-Chicago", 56, 11));
        south_round1.add(new Team("Tennessee", 15, 3));
        south_round1.add(new Team("Wright State", 59, 14));
        south_round1.add(new Team("Nevada", 36, 7));
        south_round1.add(new Team("Texas", 20, 10));
        south_round1.add(new Team("Cincinnati", 6, 2));
        south_round1.add(new Team("Georgia State", 58, 15));
        
        System.out.println("********************************");
        System.out.println("\tSOUTH ROUND ONE"); //Label for South R1
        System.out.println("********************************");

        printBracket(south_round1); //Print teams for South

            //Add teams to the West region
        west_round1.add(new Team("Xavier", 12, 1)); 
        west_round1.add(new Team("Texas Southern", 35, 16));
        west_round1.add(new Team("Missouri", 42, 8));
        west_round1.add(new Team("Florida State", 27, 9));
        west_round1.add(new Team("Ohio State", 21, 5));
        west_round1.add(new Team("South Dakota State", 0, 12));
        west_round1.add(new Team("Gonzaga", 10, 4));
        west_round1.add(new Team("UNC Greensboro", 0, 13));
        west_round1.add(new Team("Houston", 22, 6));
        west_round1.add(new Team("San Diego State", 51, 11));
        west_round1.add(new Team("Michigan", 11, 3));
        west_round1.add(new Team("Montana", 0, 14));
        west_round1.add(new Team("Texas A&M", 29, 7));
        west_round1.add(new Team("Providence", 53, 10));
        west_round1.add(new Team("North Carolina", 8, 2));
        west_round1.add(new Team("Lipscomb", 156, 15));

        System.out.println("********************************");
        System.out.println("\tWEST ROUND ONE"); //Label for West R1
        System.out.println("********************************");

        printBracket(west_round1); //Print teams for North

            //Add teams to the East region
        east_round1.add(new Team("Villanova", 1, 1));
        east_round1.add(new Team("Radford", 187, 16));
        east_round1.add(new Team("Virginia Tech", 37, 8));
        east_round1.add(new Team("Alabama", 45, 9));
        east_round1.add(new Team("West Virgina", 9, 5));
        east_round1.add(new Team("Murray State", 79, 12));
        east_round1.add(new Team("Wichita State", 14, 4));
        east_round1.add(new Team("Marshall", 123, 13));
        east_round1.add(new Team("Florida", 17, 6));
        east_round1.add(new Team("St. Bonaventure", 66, 11));
        east_round1.add(new Team("Texas Tech", 13, 3));
        east_round1.add(new Team("Stephen F. Austin", 115, 14));
        east_round1.add(new Team("Arkansas", 32, 7));
        east_round1.add(new Team("Butler", 23, 10));
        east_round1.add(new Team("Purdue", 3, 2));
        east_round1.add(new Team("Cal State Fullerton", 188, 15));

        System.out.println("********************************");
        System.out.println("\tEAST ROUND ONE"); //Label for East R1
        System.out.println("********************************");

        printBracket(east_round1); //Print teams for East

            //Add teams to the Midwest Region
        midWest_round1.add(new Team("Kansas", 7, 1));
        midWest_round1.add(new Team("Penn State", 28, 16));
        midWest_round1.add(new Team("Seton Hall", 26, 8));
        midWest_round1.add(new Team("North Carolina State", 297, 9));
        midWest_round1.add(new Team("Clemson", 18, 5));
        midWest_round1.add(new Team("New Mexico State", 73, 12));
        midWest_round1.add(new Team("Auburn", 25, 4));
        midWest_round1.add(new Team("College of Charleston", 110, 13));
        midWest_round1.add(new Team("TCU", 20, 6));
        midWest_round1.add(new Team("Syracuse", 50, 11));
        midWest_round1.add(new Team("Michigan State", 5, 3));
        midWest_round1.add(new Team("Bucknell", 75, 14));
        midWest_round1.add(new Team("Rhode Island", 41, 7));
        midWest_round1.add(new Team("Oklahoma", 39, 10));
        midWest_round1.add(new Team("Duke", 2, 2));
        midWest_round1.add(new Team("Iona", 121, 15));

        System.out.println("********************************");
        System.out.println("\tMIDWEST ROUND ONE"); //Label for Midwest R1
        System.out.println("********************************");

        printBracket(midWest_round1); //Print teams for Midwest

            //Create array for South R2
        ArrayList<Team> south_round2 = new ArrayList<>();

        System.out.println("");
        System.out.println("********************************");
        System.out.println("\tSOUTH ROUND TWO"); //Label for South R2
        System.out.println("********************************");

            //Calculate and print the bracket for South R2
        calcAndPrintBracket(south_round1, south_round2);

            //Create array for West R2
        ArrayList<Team> west_round2 = new ArrayList<>();

        System.out.println("");
        System.out.println("********************************");
        System.out.println("\tWEST ROUND TWO"); //Label for West R2
        System.out.println("********************************");

            //Calculate and print the bracket for West R2
        calcAndPrintBracket(west_round1, west_round2);

            //Create array for East R2
        ArrayList<Team> east_round2 = new ArrayList<>();

        System.out.println("");
        System.out.println("********************************");
        System.out.println("\tEAST ROUND TWO"); //Label for East R2
        System.out.println("********************************");

            //Calculate and print the bracket for East R2
        calcAndPrintBracket(east_round1, east_round2);

            //Create array for Midwest R2
        ArrayList<Team> midWest_round2 = new ArrayList<>();

        System.out.println("");
        System.out.println("********************************");
        System.out.println("\tMIDWEST ROUND TWO"); //Label for Midwest R2
        System.out.println("********************************");

            //Calculate and print the bracket for Midwest R2
        calcAndPrintBracket(midWest_round1, midWest_round2);

            //Create array for South S16
        ArrayList<Team> south_sweetSixteen = new ArrayList<>();

        System.out.println("");
        System.out.println("********************************");
        System.out.println("\tSOUTH SWEET SIXTEEN"); //Label for South S16
        System.out.println("********************************");

            //Calculate and print the bracket for South S16
        calcAndPrintBracket(south_round2, south_sweetSixteen);

            //Create array for West S16
        ArrayList<Team> west_sweetSixteen = new ArrayList<>();

        System.out.println("");
        System.out.println("********************************");
        System.out.println("\tWEST SWEET SIXTEEN"); //Label for West S16
        System.out.println("********************************");

            //Calculate and print the bracket for West S16
        calcAndPrintBracket(west_round2, west_sweetSixteen);

            //Create array for East S16
        ArrayList<Team> east_sweetSixteen = new ArrayList<>();

        System.out.println("");
        System.out.println("********************************");
        System.out.println("\tEAST SWEET SIXTEEN"); //Label for East S16
        System.out.println("********************************");

            //Calculate and print the bracket for East S16
        calcAndPrintBracket(east_round2, east_sweetSixteen);

            //Create array for Midwest S16
        ArrayList<Team> midWest_sweetSixteen = new ArrayList<>();

        System.out.println("");
        System.out.println("********************************");
        System.out.println("\tMIDWEST SWEET SIXTEEN"); //Label for Midwest S16
        System.out.println("********************************");

            //Calculate and print the bracket for Midwest S16
        calcAndPrintBracket(midWest_round2, midWest_sweetSixteen);

            //Create array for South E8
        ArrayList<Team> south_eliteEight = new ArrayList<>();

        System.out.println("");
        System.out.println("********************************");
        System.out.println("\tSOUTH ELITE EIGHT"); //Label for South E8
        System.out.println("********************************");

            //Calculate and print the bracket for South E8
        calcAndPrintBracket(south_sweetSixteen, south_eliteEight);

            //Create array for West E8
        ArrayList<Team> west_eliteEight = new ArrayList<>();

        System.out.println("");
        System.out.println("********************************");
        System.out.println("\tWEST ELITE EIGHT"); //Label for West E8
        System.out.println("********************************");

            //Calculate and print the bracket for West E8
        calcAndPrintBracket(west_sweetSixteen, west_eliteEight);

            //Create array for East E8
        ArrayList<Team> east_eliteEight = new ArrayList<>();

        System.out.println("");
        System.out.println("********************************");
        System.out.println("\tEAST ELITE EIGHT"); //Label for East E8
        System.out.println("********************************");

            //Calculate and print the bracket for East E8
        calcAndPrintBracket(east_sweetSixteen, east_eliteEight);

            //Create array for Midwest E8
        ArrayList<Team> midWest_eliteEight = new ArrayList<>();

        System.out.println("");
        System.out.println("********************************");
        System.out.println("\tMIDWEST ELITE EIGHT"); //Label for Midwest E8
        System.out.println("********************************");

            //Calculate and print the bracket for Midwest E8
        calcAndPrintBracket(midWest_sweetSixteen, midWest_eliteEight);

            //Create array for left F4
        ArrayList<Team> left_finalFour = new ArrayList<>();
            //Calculate bracket for left region for F4
        calcBracket(south_eliteEight, left_finalFour);
        calcBracket(east_eliteEight, left_finalFour);

            //Create array for right F4
        ArrayList<Team> right_finalFour = new ArrayList<>();
            //Calculate bracket for right region for F4
        calcBracket(west_eliteEight, right_finalFour);
        calcBracket(midWest_eliteEight, right_finalFour);
        
        System.out.println("");
        System.out.println("********************************");
        System.out.println("\tFINAl FOUR"); //Label for Final Four
        System.out.println("********************************");
        
        printBracket(left_finalFour); //Print bracket for left F4
        printBracket(right_finalFour); //Print bracket for right F4
        
            //Create array for Championship
        ArrayList<Team> championship = new ArrayList<>();
            
            //Calculate brackets for Championship
        calcBracket(left_finalFour, championship);
        calcBracket(right_finalFour, championship);

        System.out.println("");
        System.out.println("********************************");
        System.out.println("\tNATIONAL CHAMPIONSHIP"); //Label for Championship
        System.out.println("********************************");

            //Print bracket for Championship
        printBracket(championship);
        
            //Create array for the Winner (this is probably unnecessary lmao)
        ArrayList<Team> winner = new ArrayList<>();
        
        System.out.println("");
        System.out.println("********************************");
        System.out.println("\tWINNER"); //Label for Winner
        System.out.println("********************************");
        
            //Calculate and print bracket for the winnner
        calcAndPrintBracket(championship, winner);
        System.out.println(""); //space
        System.out.println(""); //space
        
    }

    public static void printBracket(ArrayList<Team> region) { //Method to print bracket
        for (int x = 0; x < region.size(); x++) { //Repeat for region.size() amount
            System.out.println((region.get(x).getSeed())
                    + "\t" + (region.get(x)).getTeamName()); //Print region seed, then name
            if (x % 2 != 0) { //If index of item in array equals 0 when modulo 2
                System.out.println(""); //space
            }
        }
    }

    public static void calcBracket(ArrayList<Team> prevRegion, ArrayList<Team> region) { //Method to calculate bracket
        for (int x = 0; x < prevRegion.size(); x += 2) { //Repeat until x = prevRegion.size()
            region.add(checkWinner(prevRegion.get(x), prevRegion.get(x + 1))); //Add the winner between both teams
        }
    }

    public static void calcAndPrintBracket(ArrayList<Team> prevRegion, ArrayList<Team> region) { //Method to calculate bracket and print it
        calcBracket(prevRegion, region); //Calculate bracket
        printBracket(region); //Print bracket
    }

    public static Team checkWinner(Team one, Team two) { //Method to check winner
        if (one.getPowerRank() > two.getPowerRank()) { //If the first team's power rank is greater than the second's
            return one; //Return the first team
        } else if (one.getPowerRank() == two.getPowerRank()) { //If their power ranks are equal
            Random r = new Random(); //Create random object
            int fiftyFifty = r.nextInt(100); //Create random number out of 100
            if (fiftyFifty%2 == 0) { //If the random number is even
                return one; //Return team one
            } else { //Else
                return two; //Return team two
            }
        } else { //Else
            return two; //Return team two
        }
    }

}
