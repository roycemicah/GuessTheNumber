/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.sg.guessthenumber.data;

import com.sg.guessthenumber.models.Game;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author roycerabanal
 */
@SpringBootTest
public class GuessDaoDatabaseTest {
    
    @Autowired
    GameDao gameDao;
    
    @Autowired
    GuessDao guessDao;
    
    public GuessDaoDatabaseTest() {
    }

    
    @BeforeEach
    public void setUp() {
        
        List<Game> allGames = gameDao.getAllGames();
        for (Game game : allGames) {
            gameDao.deleteGameById(game.getGameId());
        }

    }

    /**
     * Test of getGuessesByGameId method, of class GuessDaoDatabase.
     */
    @Test
    public void testGetGuessesByGameId() {
    }

    /**
     * Test of addGuess method, of class GuessDaoDatabase.
     */
    @Test
    public void testAddGuess() {
    }
    
}
