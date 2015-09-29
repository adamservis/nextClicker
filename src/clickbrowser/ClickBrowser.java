/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clickbrowser;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Adam
 */
public class ClickBrowser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        Robot R = new Robot();
        System.out.println(MouseInfo.getPointerInfo().getLocation());
        int i = 0;

        R.mouseMove(900, 700);
        i = 900;
        
        while ( i == 900 ){
            R.mousePress(InputEvent.BUTTON1_MASK);
            try { Thread.sleep(1000); } catch(Exception e) {} // Click one second
            R.mouseRelease(InputEvent.BUTTON1_MASK);
            i = (int)MouseInfo.getPointerInfo().getLocation().getX();
        }
    }
    
}
