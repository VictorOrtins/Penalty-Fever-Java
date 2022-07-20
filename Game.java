import java.util.ArrayList;
import java.util.List;

public class Game{

    private List<Team> teams; /* Eu ia usar HashSet no lugar de ArrayList, pra evitar times repetidos, mas percebi que
    faria sentido a utilização de uma lista pra fazer o sorteio dos times. Isso obviamente pode ser alterado posteriormente */

    public Game(){
        this.createTeams();
    }

    public void createTeams(){
        teams = new ArrayList<Team>();

        Team chelsea, villareal,atleticoDeMadrid, manchesterCity,bayernDeMunique, internazionale, lille, sporting;
        Team realMadrid, barcelona, juventus, manchesterUnited, parisSaintGermain, liverpool, sevilla, borussiaDortmund;
        Team porto, ajax, shaktarDonetsk, redBullLeipzing, redBullSalzsburg, benfica, atalanta, zenit;
        Team besiktas, dinamoDeKiev, brugge, youngBoys, milan, malmo, wolfsburg;

        
    }   
}