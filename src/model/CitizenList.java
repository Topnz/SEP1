package model;

import java.util.ArrayList;

public class CitizenList
{
  private ArrayList<Citizen> citizens;

  public CitizenList()
  {
    this.citizens  = new ArrayList<>();
  }

  public int getAmountOfCitizens()
  {
    return citizens.size();
  }

  public void addCitizen(Citizen citizen)
  {
    citizens.add(citizen);
  }

  public void removeCitizen(Citizen citizen)
  {
    citizens.remove(citizen);
  }

  public void removeCitizen(int index)
  {
    citizens.remove(index);
  }

  public Citizen getCitizen(int index)
  {
    return citizens.get(index);
  }

  public Citizen getCitizenByFullName(String fullName)
  {
    if (fullName == null)
    {
      throw new NullPointerException("You must enter a name");
    }

    for (int i = 0; i < citizens.size(); i++)
    {
      if (citizens.get(i).getFullName().equals(fullName))
      {
        return getCitizen(i);
      }
    }
    throw new IllegalArgumentException("There is not a person with this name");
  }


  //Not implemented
  public ArrayList<Citizen> getCitizensBySearch(String search)
  {
    return null;
  }

  //Not implemented
  public ArrayList<TradeableAssignment> getTradeableAssignmentBySearch(Citizen citizen, String search)
  {
    return null;
  }

  //Not implemented
  public ArrayList<TradeableAssignment> getTradeableAssignments(Citizen citizen)
  {
    return null;
  }

  public int getTotalPersonalPoints()
  {
    int sum = 0;
    for (int i = 0; i < citizens.size(); i++)
    {
      sum += citizens.get(i).getPersonalPoints();
    }
    return  sum;
  }

  public void resetAllPersonalPoints()
  {
    for (int i = 0; i < citizens.size(); i++)
    {
      citizens.get(i).setPersonalPoints(0);
    }
  }
}