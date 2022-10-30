import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs331Fruit;

public class Apple extends cs331Fruit implements IChoppable {

    private int pointValue = 2;

    public Apple() {
        this.setImage(Constants.APPLE_PATH);
        this.ripen();
        this.wash();
    }

    public int chop() {
        this.splash();
        this.chopGraphically();
        return this.pointValue;

    }

    @Override
    public void move() {
        this.moveFruit();
        // TODO Auto-generated method stub
    }
}
