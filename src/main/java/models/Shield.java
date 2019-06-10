package models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Shield extends AnimatedComponent {
    //public static final String imgPath = "images/shield.gif";
    private static final int xSpeed = 0;
    private static int ySpeed = 0;

    public Shield(int x, int y, Sprite sprite, int width, int height) {
        super(x, y, sprite, width, height, xSpeed, ySpeed);
    }
}