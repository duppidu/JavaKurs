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
public class Rectangle
{
    private int offsetX;
    private int offsetY;
    private int width;
    private int height;

    public Rectangle()
    {
        setPos(3, 3);
        setSize(8, 4);
    }

    public Rectangle(int offsetX, int offsetY, int width, int height)
    {
        setPos(offsetX, offsetY);
        setSize(width, height);
    }

    public void setSize(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public void setPos(int offsetX, int offsetY)
    {
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }

    public int getArea()
    {
        int area = width * height;
        return area;
    }

    public void printPar()
    {
        System.out.println("Länge: " + width + " Höhe: " + height + "\nVerschiebung in X: " + offsetX + "Verschiebung in Y :" + offsetY);
    }

    public boolean cut(Rectangle r)
    {
        boolean cut = false;
        boolean cutX = false;
        boolean cutY = false;

        if (this.offsetX < r.offsetX)
        {
            if (this.offsetX + this.width > r.offsetX)
            {
                cutX = true;
            }
        } else if (this.offsetX > r.offsetX)
        {
            if (r.offsetX + r.width > this.offsetX)
            {
                cutX = true;
            }
        } else
        {
            cutX = false;
        }

        if (this.offsetY < r.offsetY)
        {
            if (this.offsetY + this.height > r.offsetY)
            {
                cutY = true;
            }
        } else if (this.offsetY > r.offsetY)
        {
            if (r.offsetY + r.height > this.offsetY)
            {
                cutY = true;
            }
        } else
        {
            cutY = false;
        }

        if (cutY == true & cutX == true)
        {
            cut = true;
        }

        return cut;
    }

    public void draw()
    {
        int startX = offsetX;
        int startY = offsetY;

        int x = 0;
        int y = 0;
        int drawx = 0;
        int drawy = 0;

        for (y = 0; y < startY; y = y + 1)
        {
            System.out.print("\n");
        }
        for (drawy = 0; drawy < height; drawy = drawy + 1)
        {

            for (x = 0; x < startX; x = x + 1)
            {
                System.out.print(" ");

            }
            for (drawx = 0; drawx < width; drawx = drawx + 1)
            {

                System.out.print("#");
            }
            System.out.print("\n");

        }

    }

}
