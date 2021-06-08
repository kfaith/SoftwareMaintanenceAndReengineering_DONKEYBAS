package Entities;

import GUI.ColorScheme;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class LaneBorders extends Pane {
    private Rectangle laneBorder;

    public LaneBorders(String laneType)
    {
        laneBorder = new Rectangle();
        laneType.toLowerCase();
        if (laneType.equals("left"))
        {
            //White line on left edge of the road
            laneBorder.setX(305);
            laneBorder.setY(0);
            laneBorder.setHeight(800);
            laneBorder.setWidth(5);
            laneBorder.setFill(ColorScheme.colorGameWhite);
            getChildren().add(laneBorder);

            Line line1 = new Line(490, 45, 490, 845);
            line1.setStroke(ColorScheme.colorGameWhite);
            line1.getStrokeDashArray().addAll(40d, 40d);
            getChildren().add(line1);

            //line2 is for the center-line animation that wasn't implemented
//            Line line2 = new Line(490, 0, 490, 800);
//            line2.getStrokeDashArray().addAll(40d, 40d);
//            line2.setStroke(ColorScheme.colorGameWhite);
//            getChildren().add(line2);
        }
//        else if(laneType.equals("middle"))
//        {
//            //TODO: Allow N lanes. Later iterations.
//            //values are incorrect, should be a function of numLanes
//            Line line1 = new Line(490, 45, 490, 845);
//            line1.setStroke(ColorScheme.colorGameWhite);
//            line1.getStrokeDashArray().addAll(40d, 40d);
//            getChildren().add(line1);
//            //line2 is for the center-line animation that wasn't implemented
//            Line line2 = new Line(490, 0, 490, 800);
//            line2.getStrokeDashArray().addAll(40d, 40d);
//            line2.setStroke(ColorScheme.colorGameWhite);
//            getChildren().add(line2);
//        }
        else if(laneType.equals("right"))
        {
            //White line on the right edge of the road
            laneBorder.setX(670);
            laneBorder.setY(0);
            laneBorder.setHeight(800);
            laneBorder.setWidth(5);
            laneBorder.setFill(ColorScheme.colorGameWhite);
            getChildren().add(laneBorder);
        }
    }
}