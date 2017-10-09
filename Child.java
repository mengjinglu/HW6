/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Child;
import hw6.HW6;//parent
/**
 *
 * @author mengjinglu
 */
public class Child extends HW6{
    public Child(){
        super();
    }
    public void accessProtexted(){
        name = "Jane";
        myInt = 7;
        myDouble = 3.14;
    }
}
