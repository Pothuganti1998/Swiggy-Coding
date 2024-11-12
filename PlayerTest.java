import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void testHealthReduction() {
        Player player = new Player("Test", 50, 5, 10);
        player.reduceHealth(10);
        assertEquals(40, player.getHealth());
    }

    @Test
    public void testCalculateAttackDamage() {
        Player player = new Player("Test", 50, 5, 10);
        assertEquals(50, player.calculateAttackDamage(5));
    }
}
