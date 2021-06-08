package Entities;

import com.sun.source.doctree.SystemPropertyTree;

/**
 * Uses a Top-Left anchor and x,y side lengths to form a rectangular box.
 * Initialized with a starting x,y integer coordinate and x,y integer lengths.
 * Note: (boxStartAnchorX + boxLengthX) should be less than the width of the lane.
 * It can be incremented in any direction, moved to a set position, reset to original position,
 * and detect if this Hitbox has collided with another passed-in Hitbox.
 */
public class Hitbox {
    private int boxStartAnchorY;//default top left y anchor
    private int boxStartAnchorX;//default top left x anchor
    private int boxAnchorY;//current top left y anchor
    private int boxAnchorX;//current top left x anchor
    private int boxLengthY;//length downwards (positive y) from anchor
    private int boxLengthX;//length rightwards (positive x) from anchor

    public int getBoxAnchorY() { return boxAnchorY; }
    public void setBoxAnchorY(int y) { this.boxAnchorY = y; }
    public int getBoxAnchorX() { return boxAnchorX; }
    public void setBoxAnchorX(int boxAnchorX) { this.boxAnchorX = boxAnchorX; }
    public int getBoxLengthY() { return boxLengthY; }
    public void setBoxLengthY(int boxLengthY) { this.boxLengthY = boxLengthY; }
    public int getBoxLengthX() { return boxLengthX; }
    public void setBoxLengthX(int boxLengthX) { this.boxLengthX = boxLengthX; }

    /**
     * Creates and initializes a new Hitbox.
     * @param boxStartAnchorY Denotes top-left anchor y-coordinate.
     * @param boxStartAnchorX Denotes top-left anchor x-coordinate.
     * @param boxLengthY Denotes positive-y (down) length from anchor.
     * @param boxLengthX Denotes positive-x (right) length from anchor.
     */
    public Hitbox(int boxStartAnchorY, int boxStartAnchorX, int boxLengthY, int boxLengthX) {
        this.boxStartAnchorY = boxStartAnchorY;
        this.boxStartAnchorX = boxStartAnchorX;
        this.boxAnchorY = boxStartAnchorY;
        this.boxAnchorX = boxStartAnchorX;
        this.boxLengthY = boxLengthY;
        this.boxLengthX = boxLengthX;
    }

    /**
     * Moves the box anchor by x,y pixels.
     * @param x Num of pixels to move horizontally. -x is Left, +x is Right.
     * @param y Num of pixels to move vertically. -y is Up, +y is Down.
     */
    public void moveBox(int x, int y) {
        this.boxAnchorX += x;
        this.boxAnchorY += y;
    }

    /**
     * Moves the box anchor to the provided x,y position.
     * @param x X coordinate of new location.
     * @param y Y coordinate of new location.
     */
    public void setBoxPos(int x, int y) {
        this.boxAnchorX = x;
        this.boxAnchorY = y;
    }

    /**
     * Resets boxAnchorY to the value of boxStartAnchorY. Does not change X (no lane swap).
     */
    public void resetY() { this.boxAnchorY = boxStartAnchorY; }

    /**
     * Resets boxAnchorX to the value of boxStartAnchorX. Does not change Y.
     * Probably won't be used unless something awful happens.
     */
    public void resetX() { this.boxAnchorX = boxStartAnchorX; }

    /**
     * Resets boxAnchorX to the value of boxStartAnchorX
     * and resets boxAnchorY to the value of boxStartAnchorY.
     * Probably won't be used unless something awful happens.
     */
    public void resetCoords() {
        resetX();
        resetY();
    }

    /**
     * Compares this Hitbox with the passed Hitbox (Anchor and Lengths) to determine if either anchor
     * is inside the other's box (a collision).
     * @param h Hitbox being compared to this
     * @return whether or not the boxes collided on both planes
     */
    public boolean detectCollision(Hitbox h) {
        return (compareX(h) && compareY(h)); }

    /**
     * Compares this.boxAnchorX and this.boxLengthX against h.boxAnchorX and h.boxLengthX to
     * see if either box's anchor is within the bounds of the other box (including left border).
     * @param h Hitbox being compared to this
     * @return whether or not the boxes could collide on the X plane
     */
    private boolean compareX(Hitbox h) {
        return ((this.boxAnchorX <= h.getBoxAnchorX() //this left of h
                && this.boxAnchorX + this.boxLengthX > h.getBoxAnchorX()) //and this+length right of h
                || (h.getBoxAnchorX() <= this.boxAnchorX //h left of this
                && h.getBoxAnchorX() + h.getBoxLengthX() > this.getBoxAnchorX())); //and h+length right of this

    }

    /**
     * Compares this.boxAnchorY and this.boxLengthY against h.boxAnchorY and h.boxLengthY to
     * see if either box's anchor is within the bounds of the other box (including top border).
     * @param h Hitbox being compared to this
     * @return whether or not the boxes could collide on the Y plane
     */
    private boolean compareY(Hitbox h) {

        return ((this.boxAnchorY <= h.getBoxAnchorY() //this above h
                && this.boxAnchorY + this.boxLengthY > h.getBoxAnchorY()) //and this+length lower than h
                || (h.getBoxAnchorY() <= this.boxAnchorY //h above this
                && h.getBoxAnchorY() + h.getBoxLengthY() > this.boxAnchorY)); //and h+length lower than this
    }
}
