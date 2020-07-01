import java.util.ArrayList;

public class AllTypeCharacter
{
    String name;
    int hits;
    int kd;

    ArrayList<String> resists ;
    ArrayList<String> immunities;
    ArrayList<String> spells;
    ArrayList<String> statuses;

    public AllTypeCharacter(String name, int hits, int kd)
    {
        this.name = name;
        this.hits = hits;
        this.kd = kd;
        resists = new ArrayList<>();
        immunities = new ArrayList<>();
        spells = new ArrayList<>();
        statuses = new ArrayList<>();
    }

    public void addToResists(String resist)
    {
        resists.add(resist);
    }

    public void removeFromResists(String resist)
    {
        if (resists.contains(resist))
        {
            resists.remove(resist);
        }
    }

    public ArrayList<String> getResists()
    {
        return resists;
    }



}
