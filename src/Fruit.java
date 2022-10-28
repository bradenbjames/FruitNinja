import fruitNinjaHelper.cs331Fruit;

public class Fruit extends cs331Fruit {
    public Fruit() {

    }

    public void makeApple() {
        this.ripen();
        this.wash();
        this.moveFruit();
    }

}
