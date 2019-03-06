/**
 * Kai'lani Woodard
 * Team
 * Programming III - AP CS
 * 3-1-2019
 */

public class Team { //Public class for Team
    String teamName;
    int powerRank; 
    int seed; 

    //Constructor   
    public Team(String teamName, int powerRank, int seed) {
        this.teamName = teamName;
        this.powerRank = powerRank;
        this.seed = seed;
    }

        //Accessor method for getting team name
    public String getTeamName() {
        return teamName;
    }
        
        //Mutator method for setting team names
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    
        //Accessor method for getting power rank
    public int getPowerRank() {
        return powerRank;
    }

        //Mutator method for setting power rank
    public void setPowerRank(int powerRank) {
        this.powerRank = powerRank;
    }

        //Accessor method for getting seed
    public int getSeed() {
        return seed;
    }
    
        //Mutator method for setting seed
    public void setSeed(int seed) {
        this.seed = seed;
    }
    
}
