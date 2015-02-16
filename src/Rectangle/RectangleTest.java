/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;

/**
 *
 * @author thomas.duppenthaler
 */
public class RectangleTest
{

    public static void main(String[] args)
    {
         Rectangle r1 = new Rectangle();
         Rectangle r2 = new Rectangle(10,10,8,9);
         r1.setSize(5, 6);
         r1.setPos(2, 2);
        
       r1.cut(r2);
       System.out.println(r1.cut(r2));
r1.draw();
    }

}
