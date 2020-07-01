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
        expectedResists.forEach(allTypeCharacter::addToResists);
        assertEquals(expectedResists, allTypeCharacter.getResists());
    }

    //remove existent resist
    public void testRemoveFromResistsExistent()
    {
        expectedResists.forEach(allTypeCharacter::addToResists);
        allTypeCharacter.removeFromResists(expectedResists.get(2));
        expectedResists.remove(2);
        assertEquals(expectedResists, allTypeCharacter.getResists());
    }

    //remove nonexistent resist
    public void testRemoveFromResistsNonexistent()
    {
        expectedResists.forEach(allTypeCharacter::addToResists);
        allTypeCharacter.removeFromResists("cold");
        assertEquals(expectedResists, allTypeCharacter.getResists());
    }

    //Immunity =================================================================
    public void testAddToImmunities()
    {
        expectedResists.forEach(allTypeCharacter::addToImmunities);
        assertEquals(expectedResists, allTypeCharacter.getImmunities());
    }

    //remove existent immunity
    public void testRemoveFromImmunitiesExistent()
    {
        expectedResists.forEach(allTypeCharacter::addToImmunities);
        allTypeCharacter.removeFormImmunities(expectedResists.get(2));
        expectedResists.remove(2);
        assertEquals(expectedResists, allTypeCharacter.getImmunities());
    }

    //remove nonexistent immunity
    public void testRemoveFromImmunitiesNonexistent()
    {
        expectedResists.forEach(allTypeCharacter::addToImmunities);
        allTypeCharacter.removeFormImmunities("cold");
        assertEquals(expectedResists, allTypeCharacter.getImmunities());
    }

    //status =============================================================

    public void testAddToStatuses()
    {
        expectedResists.forEach(allTypeCharacter::addToStatuses);
        assertEquals(expectedResists, allTypeCharacter.getStatuses());
    }

    //remove existent immunity
    public void testRemoveFromStatusesExistent()
    {
        expectedResists.forEach(allTypeCharacter::addToStatuses);
        allTypeCharacter.removeFormStatuses(expectedResists.get(2));
        expectedResists.remove(2);
        assertEquals(expectedResists, allTypeCharacter.getStatuses());
    }

    //remove nonexistent immunity
    public void testRemoveFromStatusesNonexistent()
    {
        expectedResists.forEach(allTypeCharacter::addToStatuses);
        allTypeCharacter.removeFormStatuses("cold");
        assertEquals(expectedResists, allTypeCharacter.getStatuses());
    }

    @Override
    protected void tearDown() throws Exception
    {
        super.tearDown();
    }
}
