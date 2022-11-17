import fruitNinjaHelper.cs331Fruit;

// THIS CLASS SHOULD ALSO IMPLEMENT ICHOPPABLE INTERFACE. BUT IT WILL NOT EXPLODE BUT CHOPGRAPHICALLY, WHERE AS BOMB CLASS WILL IMPLEMENT THE METHOD TO EXPLODE. 
public class Fruit extends cs331Fruit implement IChoppable {
    public Fruit() {

    }

    public prepare() {
	wash();
	ripen();
    }

    // this method should be declared in the IChoppable interface
    @Override
    public doSomething() {
	
    }

}
