package characters.players;

public abstract class Player {

    private String name;
    private int healthPool;

    public Player(String name, int healthPool){
        this.name = name;
        this.healthPool = healthPool;
    }

    public String getName(){
        return this.name;
    }

    public int getHealthPool(){
        return this.healthPool;
    }
}
