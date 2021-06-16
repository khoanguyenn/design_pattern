package composite_pattern;

//Team is leaf node of the tournament tree
public class Team implements Contest {
    private String name;

    public Team(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        //Drawing the Team-leaf node
        
    }

    @Override
    public String print() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
}
