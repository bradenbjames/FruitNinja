import fruitNinjaHelper.cs331Blade;
import fruitNinjaHelper.cs331FruitNinjaFrame;
import fruitNinjaHelper.cs331ScoreController;
import javafx.application.Application;
import javafx.stage.Stage;

public class App4 extends Application {

    public void start(Stage primaryStage) {
        cs331FruitNinjaFrame frame = new cs331FruitNinjaFrame(primaryStage);

        // Your code goes here!!
        cs331ScoreController c = new cs331ScoreController();
        cs331Blade b = new cs331Blade("1");
        Game game = new Game(c, b);
        frame.addGame(game);
        frame.setTop(c);
        game.startGame();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
