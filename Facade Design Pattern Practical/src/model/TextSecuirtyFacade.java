/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dilhara
 */
public final class TextSecuirtyFacade {

    private final FileManager fileManager;
    private final Encrypter encrypter;
    private final Decrypter decrypter;

    public TextSecuirtyFacade() {
        this.fileManager = new FileManager();
        this.encrypter = new Encrypter();
        this.decrypter = new Decrypter();
    }
    public void encryptToFile(String text, int key, String filePath){
        String encryptedText = encrypter.encrypt(text, key);
        fileManager.writeToFile(filePath, encryptedText);
    }
    public String decryptFromFile(int key, String filePath){
        String readFromFile = fileManager.readFromFile(filePath);
        return decrypter.decrypt(readFromFile, key);
    }
}
