package ru.job4j.chess;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.KingBlack;
import ru.job4j.chess.firuges.black.KnightBlack;
import ru.job4j.chess.firuges.black.PawnBlack;
import ru.job4j.chess.firuges.black.QueenBlack;
import ru.job4j.chess.firuges.black.RookBlack;
import ru.job4j.chess.firuges.white.BishopWhite;
import ru.job4j.chess.firuges.white.KingWhite;
import ru.job4j.chess.firuges.white.KnightWhite;
import ru.job4j.chess.firuges.white.PawnWhite;
import ru.job4j.chess.firuges.white.QueenWhite;
import ru.job4j.chess.firuges.white.RookWhite;

public class LogicTest {

    Logic logic = new Logic();

    @Before
    public void before() {
        buildBlackTeam();
        buildWhiteTeam();
    }

    @Test
    public void shouldSuccessMoveFigure() {
        // first moving pawn black
        logic.move(Cell.D7, Cell.D6);
        // moving bishop black
        boolean isMove = logic.move(Cell.C8, Cell.E6);
        assertThat(isMove, is(true));
    }

    @Test
    public void shouldDoesntMoveFigure() {
        boolean isMove = logic.move(Cell.C8, Cell.E6);
        assertThat(isMove, is(false));
    }

    private void buildBlackTeam() {
        logic.add(new PawnBlack(Cell.A7));
        logic.add(new PawnBlack(Cell.B7));
        logic.add(new PawnBlack(Cell.C7));
        logic.add(new PawnBlack(Cell.D7));
        logic.add(new PawnBlack(Cell.E7));
        logic.add(new PawnBlack(Cell.F7));
        logic.add(new PawnBlack(Cell.G7));
        logic.add(new PawnBlack(Cell.H7));
        logic.add(new RookBlack(Cell.A8));
        logic.add(new KnightBlack(Cell.B8));
        logic.add(new BishopBlack(Cell.C8));
        logic.add(new QueenBlack(Cell.D8));
        logic.add(new KingBlack(Cell.E8));
        logic.add(new BishopBlack(Cell.F8));
        logic.add(new KnightBlack(Cell.G8));
        logic.add(new RookBlack(Cell.H8));
    }

    public void buildWhiteTeam() {
        logic.add(new PawnWhite(Cell.A2));
        logic.add(new PawnWhite(Cell.B2));
        logic.add(new PawnWhite(Cell.C2));
        logic.add(new PawnWhite(Cell.D2));
        logic.add(new PawnWhite(Cell.E2));
        logic.add(new PawnWhite(Cell.F2));
        logic.add(new PawnWhite(Cell.G2));
        logic.add(new PawnWhite(Cell.H2));
        logic.add(new RookWhite(Cell.A1));
        logic.add(new KnightWhite(Cell.B1));
        logic.add(new BishopWhite(Cell.C1));
        logic.add(new QueenWhite(Cell.D1));
        logic.add(new KingWhite(Cell.E1));
        logic.add(new BishopWhite(Cell.F1));
        logic.add(new KnightWhite(Cell.G1));
        logic.add(new RookWhite(Cell.H1));
    }
}