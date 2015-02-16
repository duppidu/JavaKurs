/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_modulabschluss_vorbereitung;

/**
 *
 * @author simon.zeltner
 */
public class Drawing
{
    
 
    
    public static void main(String[] args)
    {
       
        Circle c1 = new Circle();
        Circle c2 = new Circle(23);
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(50, 5);
        Rectangle r3 = new Rectangle();
        r2.setX(30);
        r2.getArea();
        c2.getArea();
        System.out.println("Object Counter"+Form.getObjectCounter());
        System.out.println("CircleCounter"+c1.getCounter());
        System.out.println("RectangleCounter"+r1.getCounter());
        r2.draw();
        
       
    }
}
