package test;

import model.ChamathDataIterator;
import model.Iterator;
import model.MaheshDataIterator;
import model.TharinsaDataIterator;
import model.User;
import model.VinudhiDataIterator;

/**
 *
 * @author Dilhara
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("TharinsaData");
        Iterator tharinsaDataIterator = new TharinsaDataIterator();
        while (tharinsaDataIterator.hasNext()) {
            User u = tharinsaDataIterator.next();
            System.out.println(u.getName() + " " + u.getMobile());
        }
        
        System.out.println();
        System.out.println("VinudhiData");
        Iterator vinushiDataIterator = new VinudhiDataIterator();
        while (vinushiDataIterator.hasNext()) {
            User u = vinushiDataIterator.next();
            System.out.println(u.getName() + " " + u.getMobile());
        }
        
        System.out.println();
        System.out.println("MaheshData");
        Iterator maheshDataIterator = new MaheshDataIterator();
        while (maheshDataIterator.hasNext()) {
            User u = maheshDataIterator.next();
            System.out.println(u.getName() + " " + u.getMobile());
        }
        
        System.out.println();
        System.out.println("ChamathData");
        Iterator chamathDataIterator = new ChamathDataIterator();
        while (chamathDataIterator.hasNext()) {
            User u = chamathDataIterator.next();
            System.out.println(u.getName() + " " + u.getMobile());
        }
    }
}
