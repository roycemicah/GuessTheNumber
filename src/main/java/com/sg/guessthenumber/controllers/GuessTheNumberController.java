/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.guessthenumber.controllers;

import com.sg.guessthenumber.models.Game;
import com.sg.guessthenumber.models.Guess;
import com.sg.guessthenumber.servicelayer.GuessTheNumberServiceLayer;
import com.sg.guessthenumber.servicelayer.InvalidGameException;
import com.sg.guessthenumber.servicelayer.InvalidGuessException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author roycerabanal
 */
@RestController
public class GuessTheNumberController {
    
    @Autowired
    GuessTheNumberServiceLayer service;
    
    @PostMapping("/begin")
    public Game newGame() throws InvalidGameException {
        return service.addGame();
    }
    
    @PostMapping("/guess")
    public ResponseEntity<Guess> create(@RequestBody Guess guess) throws InvalidGameException, InvalidGuessException {
        return ResponseEntity.ok(service.addGuess(guess));
    }
    
    @GetMapping("/game")
    public List<Game> getAllGames() throws InvalidGameException {
        List<Game> games = service.getAllGames();
        return games;
    }
    
    @GetMapping("/game/{id}")
    public ResponseEntity<Game> getGameById(@PathVariable int id) throws InvalidGameException {
        return ResponseEntity.ok(service.getGameById(id));
    }
    
    @GetMapping("/guesses/{gameId}")
    public ResponseEntity<List<Guess>> getGuessesByGameId(@PathVariable int gameId) throws InvalidGameException {
        return ResponseEntity.ok(service.getGuessesByGameId(gameId));
    }
    
}
