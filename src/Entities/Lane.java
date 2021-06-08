package Entities;

import GUI.ColorScheme;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Lane extends Pane {
    private double xPos, yPos;
    private double xLaneWidth, yLaneHeight;
    private Rectangle lane;

    public Lane(int spawnX, int spawnY, double width, double height)
    {
        this.xPos = spawnX;
        this.yPos = spawnY;
        this.xLaneWidth = width;
        this.yLaneHeight = height;

        lane = new Rectangle(xPos, yPos, xLaneWidth, yLaneHeight);
        lane.setFill(ColorScheme.colorGameGrey);
        lane.setX(xPos);
        lane.setY(yPos);

        getChildren().add(lane);
    }
}