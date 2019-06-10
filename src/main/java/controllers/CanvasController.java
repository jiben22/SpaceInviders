package controllers;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import lombok.Getter;
import models.AnimatedComponent;

@Getter
public class CanvasController {
    private static CanvasController canvasController = new CanvasController();
    public static CanvasController getInstance() {
        return canvasController;
    }
    private CanvasController() {}

    private Canvas canvas = new Canvas( 650, 700 );
    private GraphicsContext gc = canvas.getGraphicsContext2D();

    public void draw(AnimatedComponent animatedComponent) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.drawImage(
                animatedComponent.getSprite().getImage(),
                animatedComponent.getSprite().getOffsetX(),
                animatedComponent.getSprite().getOffsetY(),
                animatedComponent.getSprite().getImgWidth(),
                animatedComponent.getSprite().getImgHeight(),
                animatedComponent.getX(),
                animatedComponent.getY(),
                animatedComponent.getWidth(),
                animatedComponent.getHeight()
        );
        //System.out.println("Draw " + "x: "+animatedComponent.getX() + " y: " + animatedComponent.getY());
    }

    public void clear(AnimatedComponent animatedComponent) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(animatedComponent.getX(), animatedComponent.getY(), animatedComponent.getWidth(), animatedComponent.getHeight());
        //System.out.println("Clear " + "x: "+animatedComponent.getX() + " y: " + animatedComponent.getY() + " width: " + animatedComponent.getWidth() + " height: " + animatedComponent.getHeight());
    }
}