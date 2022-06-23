/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.sg.guessthenumber.servicelayer;

import com.sg.guessthenumber.data.GameDao;
import com.sg.guessthenumber.data.GuessDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author roycerabanal
 */
@SpringBootTest
public class GuessTheNumberServiceLayerTest {
    
    @Autowired
    GameDao gameDao;
    
    @Autowired
    GuessDao guessDao;
    
    public GuessTheNumberServiceLayerTest() {
        
    }
    
    @BeforeEach
    public void setUp() {
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
    
}
