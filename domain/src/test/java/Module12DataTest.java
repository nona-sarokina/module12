import jmp.module12.domain.Module12Data;
import junit.framework.TestCase;

/**
 * Created by user on 11.10.2016.
 */

public class Module12DataTest extends TestCase {
    public void testName() {
        String testName = "test name";
        Module12Data data = new Module12Data();
        String firstItem = "first item";
        String secondItem = "second item";
        data.addItem(firstItem);
        data.addItem(secondItem);
        assertEquals(firstItem, data.getItemDescriptions().get(0));
        assertEquals(secondItem, data.getItemDescriptions().get(1));

        assertEquals(2, data.getItemDescriptions().size());
    }
}
