package ru.job4j.chess.firuges.black;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void shouldBeTheSamePositionAfterCreateFigure() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertThat(bishopBlack.position(), is(Cell.C8));
    }

    @Test
    public void shouldBeCopyCorrectBishopWithPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Figure bishopBlackCopy = bishopBlack.copy(Cell.C7);
        assertThat(bishopBlackCopy.position(), is(Cell.C7));
    }

    @Test
    public void shouldFailIfIsNotDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        exception.expect(IllegalStateException.class);
        bishopBlack.way(Cell.C8, Cell.C7);
    }
}