/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.guessthenumber.servicelayer;

/**
 *
 * @author roycerabanal
 */
public class InvalidGameException extends Exception {
    
    public InvalidGameException(String message) {
        super(message);
    }
    
    public InvalidGameException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
