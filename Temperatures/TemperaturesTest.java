import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;

public class TemperaturesTest {
  @Test
  public void containsArray() {
    Temperatures temp = new Temperatures();
    ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();

    weeklyTemperatures.add(78);
    weeklyTemperatures.add(67);
    weeklyTemperatures.add(89);
    weeklyTemperatures.add(94);
    assertEquals(0, weeklyTemperatures);
  }
}