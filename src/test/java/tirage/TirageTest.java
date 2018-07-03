package tirage;

import org.junit.Before;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static tirage.Team.newTeam;

public class TirageTest {

    List<Team> groupeA;
    List<Team> groupeB;
    List<Team> groupeC;
    List<Team> groupeD;

    @Before
    public void setUp() throws Exception {
        List<Team> groupeA= Arrays.asList(
                newTeam().WithNomTeam("Russie").buildAdfricanTeam(),
                newTeam().WithNomTeam("Allemagne").buildAdfricanTeam(),
                newTeam().WithNomTeam("Brésil").buildAdfricanTeam(),
                newTeam().WithNomTeam("Portugal").buildAdfricanTeam(),
                newTeam().WithNomTeam("Argentine").buildAdfricanTeam(),
                newTeam().WithNomTeam("Belgique").buildAdfricanTeam(),
                newTeam().WithNomTeam("Pologne").buildAdfricanTeam(),
                newTeam().WithNomTeam("France").buildAdfricanTeam()
        );

        List<Team> groupeB= Arrays.asList(
                newTeam().WithNomTeam("Espagne").buildAdfricanTeam(),
                newTeam().WithNomTeam("Pérou").buildAdfricanTeam(),
                newTeam().WithNomTeam("Suisse").buildAdfricanTeam(),
                newTeam().WithNomTeam("Angleterre").buildAdfricanTeam(),
                newTeam().WithNomTeam("Colombie").buildAdfricanTeam(),
                newTeam().WithNomTeam("Belgique").buildAdfricanTeam(),
                newTeam().WithNomTeam("Pologne").buildAdfricanTeam(),
                newTeam().WithNomTeam("France").buildAdfricanTeam()
        );
        List<Team> groupeC= Arrays.asList();
        List<Team> groupeD= Arrays.asList();

    }
}