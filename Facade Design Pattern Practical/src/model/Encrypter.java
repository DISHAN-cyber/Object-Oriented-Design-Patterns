/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dilhara
 */
public class Encrypter {

    public String encrypt(String text, int key) {
        char[] chars = text.toCharArray();
        char[] encryptedCharacters = shiftCharacters(chars, key);
        return new String(encryptedCharacters);
    }

    private char[] shiftCharacters(char[] chars, int key) {
        char[] shifted = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            shifted[i] = (char) (chars[i] + key);
        }
        return shifted;
    }
}
