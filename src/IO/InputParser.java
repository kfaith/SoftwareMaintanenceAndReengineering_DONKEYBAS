package IO;

import Control.Game;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class InputParser {
    Game game;
    Stage stage;
    Scene scene;
    Boolean title;

    public InputParser(Game game, Stage stage, boolean title) {
        this.game = game;
        this.stage = stage;
        this.scene = stage.getScene();
        this.title = title;
    }

    /*AddKeyHandler processes inputs from the keyboard
    * @params none
    */
    public void addKeyHandler() {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEventTitle) {
                switch (keyEventTitle.getCode()) {
                    case SPACE:
                        if (title) {
                            title = false;
                            game.ChangeGameScreen();

                        }
                        break;
                    case LEFT:
                        if (!title) {
                            game.moveCar(Operator.LEFT);
                        }
                        break;
                    case RIGHT:
                        if (!title) {
                            game.moveCar(Operator.RIGHT);
                        }
                        break;
                    case ESCAPE:
                        title = false;
                        System.exit(1);
                        break;
                }
            }

        });
    }

}