/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.guessthenumber.servicelayer;

import com.sg.guessthenumber.data.GameDao;
import com.sg.guessthenumber.data.GuessDao;
import com.sg.guessthenumber.models.Game;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author roycerabanal
 */
@Component
public class GuessTheNumberServiceFileImpl implements GuessTheNumberServiceLayer {
    
    @Autowired
    GameDao gameDao;
    
    @Autowired
    GuessDao guessDao;
    
    public GuessTheNumberServiceFileImpl(GameDao gameDao, GuessDao guessDao) {
        
        this.gameDao = gameDao;
        this.guessDao = guessDao;
        
    }
    
    // generate a random 4 digit number
    private String generateNumber() {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // add numbers 0 to 9 to the list
        for(int i = 0; i < 9; i++) {
            list.add(i);
        }
        
        Collections.shuffle(list);
        String generatedNumber = " ";
        
        for(int i = 0; i < 4; i ++){
            generatedNumber += list.get(i);
        }
        return generatedNumber;
        
    }

    @Override
    public Game addGame() throws InvalidGameException {
        
        Game game = new Game();
        game.setGameInProgress(true);
        game.setAnswer(generateNumber());
        gameDao.addGame(game);
        return game;
        
    }

    @Override
    public List<Game> getAllGames() throws InvalidGameException {
        
        List<Game> game = gameDao.getAllGames();
        
        if(game.size() == 0) {
            throw new InvalidGameException("No games created!");
        }
        return game;
        
    }

    @Override
    public Game getGameById(int id) throws InvalidGameException {
        
        Game getGame = gameDao.getGameById(id);
        
        if(getGame == null) {
            throw new InvalidGameException("No game found for Game ID : " + id);
        }
        return getGame;
        
    }
    
}
