/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import model.Adapter;
import model.Aliya;
import model.Balla;
import model.Game;
import model.Husky;
import model.WanaAliya;

/**
 *
 * @author Dilhara
 */
public class Player {
    public static void main(String[] args) {
        Game game = new Game();
        Balla husky = new Husky();
        game.setGameObject(husky);
        game.start();
        
        Aliya wanaAliya = new WanaAliya();
        //game.setGameObject(wanaAliya);??
        
        Adapter adapter = new Adapter();
        adapter.setAliya(wanaAliya);
        game.setGameObject(adapter);
        game.start();
    }
}
