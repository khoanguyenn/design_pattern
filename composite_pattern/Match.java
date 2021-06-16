package composite_pattern;

import java.util.ArrayList;
import java.util.List;

// A match consists of 2 team, either contains arrangement or winner
public class Match implements Contest {
    private List<Contest> componentList = new ArrayList<Contest>();
    private Team winner = null;

    public void add(Contest component) {
        componentList.add(component);
    } 

    public void add(List<Contest> componentList) {
        this.componentList.addAll(componentList);
    }

    public void setWinner(Team winner) {
        this.winner = winner;
    }

    public Team getWinner() {
        return winner;
    }

    @Override
    public void draw() {
        //Draw the match
    }

    @Override
    public String print() {
        StringBuilder nameBuilder = new StringBuilder("");
        for (Contest component : this.componentList) {
            nameBuilder.append(component.print());
            //Prevent prints the "vs" for the last component
            if (componentList.indexOf(component) < componentList.size() - 1) {
                nameBuilder.append("\n");
                nameBuilder.append("\t" + this.getWinner().print());
                nameBuilder.append("\n");
            }
        }
        return nameBuilder.toString();
    }
    
}
