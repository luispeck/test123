/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

import java.io.Serializable;
/**
 *
 * @author Luis
 */
public class ConnectFourError implements Serializable {
    
 
    
    public Object displayError(Object object){
        String message = (String) object;
        System.out.println("\t???????????????????????????????????????????????");
        System.out.println("\t Error:" + message);
        System.out.println("\t???????????????????????????????????????????????");
    return null;
    }
}
