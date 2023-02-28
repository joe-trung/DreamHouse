import java.awt.Rectangle;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square door;
    private Square dway;
    private Square door1;
    private Square garage;
    private Square garagedoor;
    private Square window1;
    private Square window2;
    private Triangle roof;
    private Triangle groof;
    private Circle sun;
    private Circle scape1;
    private Circle scape2;
    private Triangle treetrunk;
    private Circle treetop;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(200);
        wall.changeSize(300);
        wall.makeVisible();
        wall.changeColor("white");
        
        door = new Square();
        door.changeColor("blue");
        door.changeSize(90);
        door.moveHorizontal(100);
        door.moveVertical(410);
        door.makeVisible();
        
        door1 = new Square();
        door1.changeColor("blue");
        door1.changeSize(90);
        door1.moveHorizontal(100);
        door1.moveVertical(360);
        door1.makeVisible();
        
        garage = new Square();
        garage.moveVertical(300);
        garage.moveHorizontal(300);
        garage.changeSize(200);
        garage.makeVisible();
        garage.changeColor("white");
        
        dway = new Square();
        dway.moveVertical(520);
        dway.moveHorizontal(310);
        dway.changeSize(180);
        dway.makeVisible();
        dway.changeColor("brown");
        
        garagedoor = new Square();
        garagedoor.moveVertical(340);
        garagedoor.moveHorizontal(320);
        garagedoor.changeSize(160);
        garagedoor.makeVisible();
        garagedoor.changeColor("blue");
        

        window1 = new Square();
        window1.changeColor("blue");
        window1.changeSize(80);
        window1.moveHorizontal(20);
        window1.moveVertical(260);
        window1.makeVisible();
        
        window2 = new Square();
        window2.changeColor("blue");
        window2.changeSize(80);
        window2.moveHorizontal(190);
        window2.moveVertical(260);
        window2.makeVisible();

        roof = new Triangle();
        roof.changeSize(100, 300);
        roof.moveHorizontal(157);
        roof.moveVertical(138);
        roof.makeVisible();
        roof.changeColor("black");
        
        groof = new Triangle();
        groof.changeSize(50, 200);
        groof.moveHorizontal(410);
        groof.moveVertical(285);
        groof.makeVisible();
        groof.changeColor("black");

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(480);
        sun.moveVertical(-10);
        sun.changeSize(120);
        sun.makeVisible();
        
        scape1 = new Circle();
        scape1.changeColor("red");
        scape1.moveHorizontal(50);
        scape1.moveVertical(450);
        scape1.changeSize(60);
        scape1.makeVisible();
        
        scape2 = new Circle();
        scape2.changeColor("red");
        scape2.moveHorizontal(250);
        scape2.moveVertical(450);
        scape2.changeSize(60);
        scape2.makeVisible();
        
        treetop = new Circle();
        treetop.changeColor("black");
        treetop.moveHorizontal(560);
        treetop.moveVertical(200);
        treetop.changeSize(150);
        treetop.makeVisible();
        
        treetrunk = new Triangle();
        treetrunk.changeSize(200, 30);
        treetrunk.moveHorizontal(600);
        treetrunk.moveVertical(350);
        treetrunk.makeVisible();
        treetrunk.changeColor("black");
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window1.changeColor("white");
            window2.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window1.changeColor("black");
            window2.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
