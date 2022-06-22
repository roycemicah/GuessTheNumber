/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.sg.guessthenumber.data;

import com.sg.guessthenumber.TestApplicationConfiguration;
import com.sg.guessthenumber.models.Game;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 *
 * @author roycerabanal
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplicationConfiguration.class)
public class GameDaoDatabaseTest {
    
    @Autowired
    GameDao gameDao;
    
    @Autowired
    GuessDao guessDao;
    
    public GameDaoDatabaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        List<Game> allGames = gameDao.getAllGames();
        for(Game game : allGames) {
            gameDao.deleteGameById(game.getGameId());
        }
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllGames method, of class GameDaoDatabase.
     */
    @Test
    public void testGetAllGames() {
        
        Game game = new Game();
        game.setAnswer("5318");
        game.setGameInProgress(true);
        game = gameDao.addGame(game);
        
        Game game2 = new Game();
        game2.setAnswer("3416");
        game2.setGameInProgress(true);
        game2 = gameDao.addGame(game2);
        
        List<Game> allGames = gameDao.getAllGames();
        
        assertEquals(2, allGames.size());
        assertTrue(allGames.contains(game));
        assertTrue(allGames.contains(game2));
        
    }
    
    @Test
    public void testAddGetGame() {
        Game game = new Game();
        game.setAnswer("5318");
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
        game.setAnswer("3416");
        game.setGameInProgress(true);
        game = gameDao.addGame(game);
        
        Game fromDao = gameDao.getGameById(game.getGameId());
        assertEquals(game, fromDao);
        
        game.setGameInProgress(false);
        gameDao.updateGame(game);
        assertNotEquals(game, fromDao);
        fromDao = gameDao.getGameById(game.getGameId());
        assertEquals(game, fromDao);
        
    }

    /**
     * Test of deleteGameById method, of class GameDaoDatabase.
     */
    @Test
    public void testDeleteGameById() {
        
        Game game = new Game();
        game.setAnswer("5318");
        game.setGameInProgress(true);
        game = gameDao.addGame(game);
        
        Game game2 = new Game();
        game2.setAnswer("3416");
        game2.setGameInProgress(true);
        game2 = gameDao.addGame(game2);
        
        gameDao.deleteGameById(game.getGameId());
        gameDao.deleteGameById(game2.getGameId());
        
        Game fromDao = gameDao.getGameById(game.getGameId());
        assertNull(fromDao);
        
    }
    
}
