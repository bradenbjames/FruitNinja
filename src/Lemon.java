import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs331Fruit;

public class Lemon extends cs331Fruit implements IChoppable {
    private int pointValue = 2;

    // YOU HAVE DUPLICATE CODE IN ALL THE FRUIT SUBCLASSES. YOU NEED TO PUT THIS IN FRUIT CLASS AND CHILD CLASS WILL INHERIT IT AUTOMATICALLY
    public Lemon() {
        this.setImage(Constants.LEMON_PATH);
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
    }

}
