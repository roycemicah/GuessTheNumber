/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.sg.guessthenumber.servicelayer;

import com.sg.guessthenumber.TestApplicationConfiguration;
import com.sg.guessthenumber.models.Game;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author roycerabanal
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplicationConfiguration.class)
public class GuessTheNumberServiceLayerTest {
    
    public GuessTheNumberServiceLayerTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addGame method, of class GuessTheNumberServiceLayer.
     */
    @Test
    public void testAddGame() throws Exception {
    }

    /**
     * Test of getAllGames method, of class GuessTheNumberServiceLayer.
     */
    @Test
    public void testGetAllGames() throws Exception {
    }

    /**
     * Test of getGameById method, of class GuessTheNumberServiceLayer.
     */
    @Test
    public void testGetGameById() throws Exception {
    }

    public class GuessTheNumberServiceLayerImpl implements GuessTheNumberServiceLayer {

        public Game addGame() throws InvalidGameException {
            return null;
        }

        public List<Game> getAllGames() throws InvalidGameException {
            return null;
        }

        public Game getGameById(int id) throws InvalidGameException {
            return null;
        }
    }
    
}
