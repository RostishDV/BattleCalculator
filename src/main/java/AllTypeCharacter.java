import java.util.ArrayList;

public class AllTypeCharacter
{
    String name;
    int hits;
    int currentHits;
    int kd;

    ArrayList<String> resists ;
    ArrayList<String> immunities;
    ArrayList<String> statuses;

    public AllTypeCharacter(String name, int hits, int kd)
    {
        this.name = name;
        this.hits = hits;
        this.currentHits = hits;
        this.kd = kd;
        resists = new ArrayList<>();
        immunities = new ArrayList<>();
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

    public void addToImmunities(String immunity)
    {
        immunities.add(immunity);
    }

    public void removeFormImmunities(String immunity)
    {
        if (immunities.contains(immunity))
        {
            immunities.remove(immunity);
        }
    }

    public ArrayList<String> getImmunities()
    {
        return immunities;
    }

    public void addToStatuses(String status)
    {
        statuses.add(status);
    }

    public void removeFormStatuses(String status)
    {
        if (statuses.contains(status))
        {
            statuses.remove(status);
        }
    }

    public ArrayList<String> getStatuses()
    {
        return statuses;
    }

    public void takeDamage(int damage)
    {
        currentHits -= damage;
    }

    public void takeHeal(int heal)
    {
        currentHits += heal;
        if (currentHits > hits)
        {
            currentHits = hits;
        }
    }

    public int getHits()
    {
        return currentHits;
    }
}
