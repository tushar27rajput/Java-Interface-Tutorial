/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demointerface;

/**
 *
 * @author tusshar
 */
public class AdvanceCal implements Cal {
    
    public static void main(String []args)
    {
        //x = 90;
       // AdvanceCal obj1 = new AdvanceCal();
        //obj1.Advancecos();
        //obj1.Advancesin();
        //obj1.sum();
        //obj1.sub();
    
    Cal obj2 = new AdvanceCal();
    obj2.sub();
    obj2.sum();
    
    }

    public void Advancesin()
    {
        System.out.println("this is Adavace Cal -sin");
    }
    
    public void Advancecos()
    {
        System.out.println("this is Adavace Cal -cos");
    }
    @Override
    public void sum() {
        System.out.println("this is sum methode");
    }

    @Override
    public void sub() {
        System.out.println("this is sub methode");
    }
    
}
