/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.sg.guessthenumber.data;

import com.sg.guessthenumber.models.Game;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 *
 * @author roycerabanal
 */
@SpringBootTest
public class GameDaoDatabaseTest {
    
    @Autowired
    GameDao gameDao;
    
    @Autowired
    GuessDao guessDao;
    
    public GameDaoDatabaseTest() {
    }

    @BeforeEach
    public void setUp() {
        
        List<Game> allGames = gameDao.getAllGames();
        for(Game game : allGames) {
            gameDao.deleteGameById(game.getGameId());
        }
        
    }

    /**
     * Test of getAllGames method, of class GameDaoDatabase.
     */
    @Test
    public void testGetAllGames() {
        
        Game game = new Game();
        game.setAnswer("1234");
        game.setGameInProgress(true);
        game = gameDao.addGame(game);
        
        Game game2 = new Game();
        game2.setAnswer("9876");
        game2.setGameInProgress(true);
        game2 = gameDao.addGame(game2);
        
        List<Game> allGames = gameDao.getAllGames();
        
        assertEquals(allGames.size(), 2);
        assertTrue(allGames.contains(game));
        assertTrue(allGames.contains(game2));
        
    }
    
    @Test
    public void testAddGetGame() {
        
        Game game = new Game();
        game.setAnswer("1234");
        game.setGameInProgress(true);
        game = gameDao.addGame(game);
        
        Game fromDao = gameDao.getGameById(game.getGameId());
        assertEquals(game, fromDao);
        
    }

    /**
     * Test of updateGame method, of class GameDaoDatabase.
     */
    @Test
    public void testUpdateGame() {
        
        Game game = new Game();
        game.setAnswer("1234");
        game.setGameInProgress(true);
        game = gameDao.addGame(game);
        
        Game fromDao = gameDao.getGameById(game.getGameId());
        assertEquals(game, fromDao);
        
        game.setGameInProgress(false);
        gameDao.updateGame(game);
        
        assertTrue(game != fromDao);
        fromDao = gameDao.getGameById(game.getGameId());
        assertEquals(game, fromDao);
        
    }

    /**
     * Test of deleteGameById method, of class GameDaoDatabase.
     */
    @Test
    public void testDeleteGameById() {
        
        Game game = new Game();
        game.setAnswer("1234");
        game.setGameInProgress(true);
        game = gameDao.addGame(game);
        
        Game game2 = new Game();
        game2.setAnswer("9876");
        game2.setGameInProgress(true);
        game2 = gameDao.addGame(game2);
        
        List<Game> allGames = gameDao.getAllGames();
        
        assertEquals(allGames.size(), 2);
        assertTrue(allGames.contains(game));
        assertTrue(allGames.contains(game2));
        
        gameDao.deleteGameById(game2.getGameId());
        
        allGames = gameDao.getAllGames();
        
        assertEquals(allGames.size(), 1);
        assertTrue(allGames.contains(game));
        assertFalse(allGames.contains(game2));
        
    }
    
}
