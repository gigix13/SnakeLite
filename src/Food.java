import java.util.Random;
public class Food {
    private int posX;
    private int posY;

    public Food(){
        posX = generatePosition(Graphics.width);
        posY = generatePosition(Graphics.height);
    }

    private int generatePosition(int size) {
        Random rand = new Random();
        return rand.nextInt(size / Graphics.part ) * Graphics.part;
    }

    public int getPosX(){
        return posX;
    }

    public int getPosY(){
        return posY;
    }
}
