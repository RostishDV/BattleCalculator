import junit.framework.TestCase;

import java.util.ArrayList;


public class TestAllTypeCharacter
        extends TestCase
{
    AllTypeCharacter allTypeCharacter;
    ArrayList<String> expectedResists;

    @Override
    protected void setUp() throws Exception
    {
        allTypeCharacter = new AllTypeCharacter("Test1", 40, 18);
        expectedResists = new ArrayList<>();
        expectedResists.add("fire");
        expectedResists.add("necrotic");
        expectedResists.add("Piercing");
    }

    public void testAddToResists()
    {
        expectedResists.stream().forEach(allTypeCharacter::addToResists);
        assertEquals(expectedResists, allTypeCharacter.getResists());
    }

    //remove existent resist
    public void testRemoveFromResistsExistent()
    {
        expectedResists.stream().forEach(allTypeCharacter::addToResists);
        allTypeCharacter.removeFromResists(expectedResists.get(2));
        expectedResists.remove(2);
        assertEquals(expectedResists, allTypeCharacter.getResists());
    }

    //remove nonexistent resist
    public void testRemoveFromResistsNonexistent()
    {
        expectedResists.stream().forEach(allTypeCharacter::addToResists);
        allTypeCharacter.removeFromResists("cold");
        assertEquals(expectedResists, allTypeCharacter.getResists());
    }

    @Override
    protected void tearDown() throws Exception
    {
        super.tearDown();
    }
}
