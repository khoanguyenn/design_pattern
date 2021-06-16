package composite_pattern;

public class Tournament {
    public static void main(String[] args) {
        Team redDragon = new Team("Red Dragon");
        Team mysterio = new Team("Mysterio");
        Team viking = new Team("The viking");
        Team programmer = new Team("Programmer");

        Match A_round = new Match();
        A_round.add(redDragon);
        A_round.add(mysterio);
        A_round.setWinner(redDragon);
        //System.out.println(A_round.print());

        Match B_round = new Match();
        B_round.add(viking);
        B_round.add(programmer);
        B_round.setWinner(programmer);
        //System.out.println(B_round.print());

        Match finalMatch = new Match();
        finalMatch.add(A_round);
        finalMatch.add(B_round);
        finalMatch.setWinner(programmer);

        System.out.println(finalMatch.print());
    }
}