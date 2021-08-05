package Demo;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
      Team barcelona = new Team("Barcelona", 
      "Noucamp", "Ronal Koeman", 1848);
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
      
      Team teamManUtd = new Team("Manchester United", "Old Traford", "Ole Gunnar Solskjær", 1878);
      System.out.println(teamManUtd);
      teamManUtd.addPlayer(new Player("David de Gea", 1, Position.GOALKEEPER));
      teamManUtd.addPlayer(new Player("Victor Lindelof", 2, Position.DEFENDER));
      teamManUtd.addPlayer(new Player("Harry Maguire", 5, Position.DEFENDER));
      teamManUtd.addPlayer(new Player("Luke Shaw", 23, Position.DEFENDER));
      teamManUtd.addPlayer(new Player("Phil Jones", 4, Position.DEFENDER));
      teamManUtd.addPlayer(new Player("Juan Mata", 8, Position.MIDFIELD));
      teamManUtd.addPlayer(new Player("Paul Pogba", 6, Position.MIDFIELD));
      teamManUtd.addPlayer(new Player("Nemanja Matic", 31, Position.MIDFIELD));
      teamManUtd.addPlayer(new Player("Marcus Rashford", 10, Position.FORWARDER));
      teamManUtd.addPlayer(new Player("Edison Cavani", 7, Position.FORWARDER));
      teamManUtd.addPlayer(new Player("Anthony Martial", 11, Position.FORWARDER));
      teamManUtd.showAllPlayers();

      Team teamBayenr = new Team("Bayern München", "Allianz Arena", "Hans-Dieter Flick", 1900);
      System.out.println(teamBayenr);
      teamBayenr.addPlayer(new Player("Manuel Neuer", 1, Position.GOALKEEPER));
      teamBayenr.addPlayer(new Player("Jerome Boateng", 17, Position.DEFENDER));
      teamBayenr.addPlayer(new Player("Javi Martinez", 8, Position.DEFENDER));
      teamBayenr.addPlayer(new Player("David Alaba", 27, Position.DEFENDER));
      teamBayenr.addPlayer(new Player("Kingsley Coman", 29, Position.MIDFIELD));
      teamBayenr.addPlayer(new Player("Serge Gnabry", 7, Position.MIDFIELD));
      teamBayenr.addPlayer(new Player("Leroy Sane", 10, Position.MIDFIELD));
      teamBayenr.addPlayer(new Player("Douglas Costa", 11, Position.MIDFIELD));
      teamBayenr.addPlayer(new Player("Alphonso Davies", 19, Position.FORWARDER));
      teamBayenr.addPlayer(new Player("Thomas Muller", 25, Position.FORWARDER));
      teamBayenr.addPlayer(new Player("Robert Lewandowski", 9, Position.FORWARDER));
      teamBayenr.showAllPlayers();

      Team teamReal = new Team("Real Madrid", "Santiago Bernabéu", "Zinédine Zidane", 1902);
      System.out.println(teamReal);
      teamReal.addPlayer(new Player("Thibaut Courtois", 1, Position.GOALKEEPER));
      teamReal.addPlayer(new Player("Marcelo", 12, Position.DEFENDER));
      teamReal.addPlayer(new Player("Raphael Varane", 5, Position.DEFENDER));
      teamReal.addPlayer(new Player("Sergio Ramos", 4, Position.DEFENDER));
      teamReal.addPlayer(new Player("Eden Hazrad", 7, Position.MIDFIELD));
      teamReal.addPlayer(new Player("Isco", 22, Position.MIDFIELD));
      teamReal.addPlayer(new Player("Luka Modric", 10, Position.MIDFIELD));
      teamReal.addPlayer(new Player("Toni Kroos", 8, Position.MIDFIELD));
      teamReal.addPlayer(new Player("Marco Asensio", 11, Position.MIDFIELD));
      teamReal.addPlayer(new Player("Lucas Vazquez", 17, Position.FORWARDER));
      teamReal.addPlayer(new Player("Karim Benzema", 9, Position.FORWARDER));
      teamReal.showAllPlayers();

      Team liverpool = new Team("Liverpool", "Anfield", "Jürgen Klopp", 1892);
      System.out.println(liverpool);
      liverpool.addPlayer(new Player("Alisson Becker", 1, Position.GOALKEEPER));
      liverpool.addPlayer(new Player("Virgil van Dijk", 4, Position.DEFENDER));
      liverpool.addPlayer(new Player("Alexander-Arnold", 66, Position.DEFENDER));
      liverpool.addPlayer(new Player("Andrew Robertson", 26, Position.DEFENDER));
      liverpool.addPlayer(new Player("Joel Matip", 32, Position.DEFENDER));
      liverpool.addPlayer(new Player("Jordan Henderson", 14, Position.MIDFIELD));
      liverpool.addPlayer(new Player("Alex Chamberlain", 15, Position.MIDFIELD));
      liverpool.addPlayer(new Player("Xherdan Shaqiri", 23, Position.MIDFIELD));
      liverpool.addPlayer(new Player("Mohamed Salah", 11, Position.FORWARDER));
      liverpool.addPlayer(new Player("Sadio Mane", 10, Position.FORWARDER));
      liverpool.addPlayer(new Player("Thiago Alcantara", 6, Position.FORWARDER));
      liverpool.showAllPlayers();
    }
  }