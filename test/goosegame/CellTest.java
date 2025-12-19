package test.goosegame;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import goosegame.cell.*;
import goosegame.*;
public class CellTest {

    @Test
    public void testGooseCellBound() {
        CellGoose goose = new CellGoose(9);
        assertEquals(5, goose.bound(5)); // rebond = valeur du dé
    }

    @Test
    public void testTrapCellCannotLeave() {
        CellTrap trap = new CellTrap(31);
        assertFalse(trap.canLeave());
    }

    @Test
    public void testWaitingCell() {
        CellWaiting waiting = new CellWaiting(19, 2);
        Player p = new Player("Test");
        waiting.setPlayer(p);

        assertFalse(waiting.canLeave()); // 1er tour bloqué
        assertFalse(waiting.canLeave()); // 2e tour bloqué
        assertTrue(waiting.canLeave());  // 3e tour libéré
    }

    @Test
    public void testTeleportCellBound() {
        CellTeleport tele = new CellTeleport(6, 12);
        assertEquals(6, tele.bound(5)); // rebond = nextNum - numCell
    }

    @Test
    public void testNormalCell() {
        NormalCell normal = new NormalCell(10);
        assertEquals(0, normal.bound(4));
        assertTrue(normal.canLeave());
    }
}

