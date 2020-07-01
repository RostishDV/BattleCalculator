package coreSystems;

import org.springframework.boot.jackson.JsonComponent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class QueueOfTurns
{
    TreeMap<Integer, AllTypeCharacter> queue;
    int unitCounter;
    ArrayList<Integer> initiativeList;
    int turnCounter;

    public QueueOfTurns()
    {
        turnCounter = 0;
        unitCounter = 0;
        initiativeList = new ArrayList<>();
        queue = new TreeMap<>();
    }

    public void addCharacter(int initiative, AllTypeCharacter character)
    {
        queue.put(initiative, character);
        initiativeList.add(initiative);
        initiativeList.sort(Comparator.reverseOrder());
        unitCounter++;
    }

    public void removeCharacter(int initiative)
    {
        if (queue.containsKey(initiative))
        {
            queue.remove(initiative);
            initiativeList.remove(initiative);
            unitCounter--;
        }
    }

    public HashMap<String, String> getCurrentTurnInfo()
    {
        HashMap<String, String> turnInfo = new HashMap<>();
        turnInfo.put("turn number", Integer.toString(turnCounter));
        turnInfo.put("queue", queue.toString());
        turnInfo.put("current character", queue.get(initiativeList.get(turnCounter)).toString());
        return turnInfo;
    }

    public void nextTurn()
    {
        if(turnCounter < unitCounter)
        {
            turnCounter++;
        }
        else
        {
            turnCounter = 0;
        }
    }

    public TreeMap<Integer, AllTypeCharacter> getQueue()
    {
        return queue;
    }
}
