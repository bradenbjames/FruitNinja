import fruitNinjaHelper.cs331Bomb;

public class Bomb extends cs331Bomb {
    public Bomb() {
        this.setImage();
    }

    public int chop() {
        this.explode();
        return 0;
    }

    public void move() {
        this.moveBomb();
    }

}
