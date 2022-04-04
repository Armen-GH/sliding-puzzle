package puzzle.state;

import org.junit.jupiter.api.Test;

import java.util.EnumSet;

import static org.junit.jupiter.api.Assertions.*;

class PuzzleStateTest {

    PuzzleState state1 = new PuzzleState(); // the original initial state

    PuzzleState state2 = new PuzzleState(new Position(1, 1),
            new Position(1, 1),
            new Position(1, 1),
            new Position(1, 2)); // a goal state

    PuzzleState state3 = new PuzzleState(new Position(1, 1),
                new Position(2, 0),
                new Position(1, 1),
                new Position(0, 2)); // a non-goal state

    PuzzleState state4 = new PuzzleState(new Position(0, 0),
                new Position(1, 0),
                new Position(0, 1),
                new Position(0, 0)); // a dead-end state with no legal moves

}
