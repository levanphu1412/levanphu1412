package Demo;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
      Team barcelona = new Team("Barcelona", 
      "Noucamp", "Ronal Koeman", "1848");
      // System.out.println(barcelona.info());
      System.out.println(barcelona);
      // barcelona.setBudget(1000000000000L);
      // System.out.println(barcelona.getBudget());

      barcelona.addPlayer(new Player("Lionel Messi", 10, Position.FORWARDER));
      barcelona.addPlayer(new Player("Antonie Griezmann", 7, Position.FORWARDER));
      barcelona.addPlayer(new Player("Gerard Pique", 3, Position.DEFENDER));
      barcelona.addPlayer(new Player("Sergino Dest", 2, Position.DEFENDER));
      barcelona.addPlayer(new Player("Jordi Alba", 18, Position.DEFENDER));
      barcelona.addPlayer(new Player("Ter Stegen", 1, Position.GOALKEEPER));
      barcelona.addPlayer(new Player("Pedri", 16, Position.MIDFIELD));
      barcelona.addPlayer(new Player("De Jong", 21, Position.MIDFIELD));
      barcelona.addPlayer(new Player("Sergino Dest", 2, Position.DEFENDER));
      barcelona.addPlayer(new Player("De Jong", 21, Position.MIDFIELD));
      
      barcelona.showAllPlayers();
      // System.out.println(lionelMessi);
      // System.out.println(griezMann);
      // System.out.println(gerardPique);
      // System.out.println(serginoDest);
      // System.out.println(jordiAlba);
      // System.out.println(samuelUmtiti);
      // System.out.println(sergioButquest);
      // System.out.println(philippeCoutinho);
      // System.out.println(deJong);
      // System.out.println(pedri);
      // System.out.println(terStegen);
  
     
     
    }
  }