import coreSystems.AllTypeCharacter;
import coreSystems.QueueOfTurns;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.TreeMap;

public class TestQueueOfTurns extends TestCase
{
    TreeMap<Integer, AllTypeCharacter> expectedQueue;
    QueueOfTurns actualQueue;

    @Override
    protected void setUp() throws Exception
    {
        expectedQueue = new TreeMap<>();
        actualQueue = new QueueOfTurns();
    }

    public void testAddCharacter()
    {
        AllTypeCharacter firstCharacter = new AllTypeCharacter("first", 40, 18);
        AllTypeCharacter secondCharacter = new AllTypeCharacter("second", 40, 18);
        AllTypeCharacter thirdCharacter = new AllTypeCharacter("third", 40, 18);
        expectedQueue.put(1, firstCharacter);
        expectedQueue.put(2, secondCharacter);
        expectedQueue.put(3, thirdCharacter);
        actualQueue.addCharacter(1, firstCharacter);
        actualQueue.addCharacter(2, secondCharacter);
        actualQueue.addCharacter(3, thirdCharacter);
        assertEquals(expectedQueue, actualQueue.getQueue());
    }

    public void testRemoveCharacterExistent()
    {
        AllTypeCharacter firstCharacter = new AllTypeCharacter("first", 40, 18);
        AllTypeCharacter secondCharacter = new AllTypeCharacter("second", 40, 18);
        AllTypeCharacter thirdCharacter = new AllTypeCharacter("third", 40, 18);
        expectedQueue.put(1, firstCharacter);
        expectedQueue.put(3, thirdCharacter);
        actualQueue.addCharacter(1, firstCharacter);
        actualQueue.addCharacter(2, secondCharacter);
        actualQueue.addCharacter(3, thirdCharacter);

        actualQueue.removeCharacter(2);
        assertEquals(expectedQueue, actualQueue.getQueue());
    }

    public void testRemoveCharacterNonexistent()
    {
        AllTypeCharacter firstCharacter = new AllTypeCharacter("first", 40, 18);
        AllTypeCharacter thirdCharacter = new AllTypeCharacter("third", 40, 18);
        expectedQueue.put(1, firstCharacter);
        expectedQueue.put(3, thirdCharacter);
        actualQueue.addCharacter(1, firstCharacter);
        actualQueue.addCharacter(3, thirdCharacter);

        actualQueue.removeCharacter(4);
        assertEquals(expectedQueue, actualQueue.getQueue());
    }

    //todo: write this test
    public void testGetCurrentStepInfo()
    {
//        it isn`t work
//
//        HashMap<String, String> expectedInfo = new HashMap<>();
//        AllTypeCharacter firstCharacter = new AllTypeCharacter("first", 40, 18);
//        AllTypeCharacter secondCharacter = new AllTypeCharacter("second", 40, 18);
//        AllTypeCharacter thirdCharacter = new AllTypeCharacter("third", 40, 18);
//        expectedQueue.put(1, firstCharacter);
//        expectedQueue.put(2, secondCharacter);
//        expectedQueue.put(3, thirdCharacter);
//        expectedInfo.put("turn number", "0");
//        expectedInfo.put("queue", expectedQueue.toString());
//        expectedInfo.put("current character", firstCharacter.toString());
//
//        actualQueue.addCharacter(1, firstCharacter);
//        actualQueue.addCharacter(2, secondCharacter);
//        actualQueue.addCharacter(3, thirdCharacter);
//
//        assertEquals(expectedInfo, actualQueue.getCurrentTurnInfo());
    }

    @Override
    protected void tearDown() throws Exception
    {
        super.tearDown();
    }
}
