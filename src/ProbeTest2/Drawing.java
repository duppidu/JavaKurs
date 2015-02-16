/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProbeTest2;

/**
 *
 * @author thomas.duppenthaler
 */
public class Drawing
{
    public static void main(String[] args)
    {
        Rectangel r1 = new Rectangel(5, 10);
        Rectangel r2 = new Rectangel();
        Rectangel r3 = new Rectangel();
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        r1.setX(2);
        r1.setY(2);
        r1.draw();
        System.out.println(r1.getArea());
        System.out.println(Rectangel.getCounter());
        System.out.println(Circle.getCounter());
        System.out.println(Form.getObjectCounter());
    }
}
