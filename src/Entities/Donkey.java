package Entities;

import javafx.scene.image.Image;

public class Donkey {
    private final String donkeyFilepath = "GUI/donkey2.png";
    private final String donkeyLeftFilepath = "GUI/donkey2_Left.png";
    private final String donkeyRightFilepath = "GUI/donkey2_Right.png";
    private final Image donkeyImg = new Image(donkeyFilepath);
    private final Image LdonkeyImg = new Image(donkeyLeftFilepath);
    private final Image RdonkeyImg = new Image(donkeyRightFilepath);
    private static Hitbox hitbox;
    private int xCoord; //top left
    private int yCoord; //top right


    public Donkey(int x, int y){
        this.xCoord = x;
        this.yCoord = y;
        this.hitbox = new Hitbox(xCoord, yCoord, (int)donkeyImg.getHeight(), (int)donkeyImg.getWidth());
    }

    /*
     *  Moves Donkey with inputs x and y.
     *  calls hitbox.moveBox to move the hitbox
     * @param: int x in pixels, int y in pixels
     */
    public void movedonkeyHitBox(int x, int y)
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

    public Image getDonkeyImg()
    {
        return donkeyImg;
    }
    public Image getLDonkeyImg()
    {
        return LdonkeyImg;
    }
    public Image getRDonkeyImg()
    {
        return RdonkeyImg;
    }
}
