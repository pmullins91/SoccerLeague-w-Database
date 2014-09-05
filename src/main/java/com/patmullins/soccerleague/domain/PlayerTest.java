package com.patmullins.soccerleague.domain;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
    Player player = new Player();
    protected double fValue1;
    protected double fValue2;


   @Before
    public void setUp() throws Exception {
    fValue1= 2.0;
    fValue2= 3.0;

    }
    @Test
    public void testAdd() {
        String firstName= player.getFirstName();
        System.out.println("Player First Name = "+ firstName);

        player.setFirstName("Patrick");
        String newFirstName= player.getFirstName();
        System.out.println("Updated Test Case First Name = "+ newFirstName);
    }
    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetFirstName() throws Exception {

    }

    @Test
    public void testSetFirstName() throws Exception {

    }

    @Test
    public void testGetCountry() throws Exception {

    }

    @Test
    public void testSetCountry() throws Exception {

    }

    @Test
    public void testGetPosition() throws Exception {

    }

    @Test
    public void testSetPosition() throws Exception {

    }

    @Test
    public void testGetLastName() throws Exception {

    }

    @Test
    public void testSetLastName() throws Exception {

    }

    @Test
    public void testGetJersey() throws Exception {

    }

    @Test
    public void testSetJersey() throws Exception {

    }

    @Test
    public void testGetPlayerTeamName() throws Exception {

    }

    @Test
    public void testSetPlayerTeamName() throws Exception {

    }
}
