package Entities;

import javafx.scene.image.Image;

public class Car {
    private final String carFilepath = "GUI/car2.png";
    private final String carLeftFilepath = "GUI/car2_Left.png";
    private final String carRightFilepath = "GUI/car2_Right.png";
    private final Image carImg = new Image(carFilepath);
    private final Image LcarImg = new Image(carLeftFilepath);
    private final Image RcarImg = new Image(carRightFilepath);
    private static Hitbox hitbox;
    private int xCoord; //top left
    private int yCoord; //top left


    public Car(int x, int y){
        this.xCoord = x;
        this.yCoord = y;

        this.hitbox = new Hitbox(xCoord, yCoord, (int)carImg.getHeight(), (int)carImg.getWidth());
    }

    /*
     *  Moves Car with inputs x and y.
     *  calls hitbox.moveBox to move the hitbox
     * @param: int x in pixels, int y in pixel
     */
    public void moveCarHitBox(int x, int y)
    {
        hitbox.setBoxPos(x,y);
    }

    public void setyCoord(int y)
    {
        this.yCoord = y;
    }
    public void setxCoord(int x)
    {
        this.xCoord = x;
    }

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public Hitbox getHitbox() {
        return hitbox;
    }

    public Image getCarImg()
    {
        return carImg;
    }
    public String getCarImgPath()
    {
        return carFilepath;
    }
    public Image getLCarImg()
    {
        return LcarImg;
    }
    public Image getRCarImg()
    {
        return RcarImg;
    }

}
