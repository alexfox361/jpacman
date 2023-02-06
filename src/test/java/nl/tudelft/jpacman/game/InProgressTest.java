package nl.tudelft.jpacman.game;

import nl.tudelft.jpacman.Launcher;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InProgressTest {

    private Launcher launcher;

    @Test
    void testIsInProgress() {

        launcher = new Launcher();
        launcher.launch();

        Game game = launcher.getGame();
        game.start();

        assertThat(game.isInProgress()).isEqualTo(true);
    }
}