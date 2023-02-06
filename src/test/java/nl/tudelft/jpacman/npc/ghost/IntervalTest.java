package nl.tudelft.jpacman.npc.ghost;

import com.google.common.collect.Lists;
import nl.tudelft.jpacman.board.Board;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.level.CollisionMap;
import nl.tudelft.jpacman.level.Level;
import nl.tudelft.jpacman.npc.Ghost;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class IntervalTest {
    private Level level;
    private final Ghost ghost = mock(Ghost.class);
    private final Square square1 = mock(Square.class);
    private final Square square2 = mock(Square.class);
    private final Board board = mock(Board.class);
    private final CollisionMap collisions = mock(CollisionMap.class);

    @Test
    void testInProgress() {

        level = new Level(board, Lists.newArrayList(ghost), Lists.newArrayList(
            square1, square2), collisions);
        level.start();

        assertThat(ghost.getInterval()).isNotNull();
    }
}