package model;

import java.util.Objects;

/**
 * Represents a citizen with personal points and a list of tradeable assignments.
 * Extends the abstract Person class.
 *
 * author SEP Group 1
 * @version 1.0 (28/11-2025)
 */
public class Citizen extends Person
{
  private int personalPoints;
  private TradeableAssignmentList tradeableAssignmentList;

  /**
   * Constructs a Citizen with the given name and address.
   *
   * @param name the Name object representing the citizen's name
   * @param address the Address object representing the citizen's address
   */
  public Citizen(Name name, Address address)
  {
    super(name, address);
    this.tradeableAssignmentList = new TradeableAssignmentList(this);
  }

  /**
   * Returns the citizen's personal points.
   *
   * @return the personal points
   */
  public int getPersonalPoints()
  {
    return personalPoints;
  }

  /**
   * Adds points to the citizen's personal points.
   *
   * @param personalPoints the points to add
   */
  public void addPersonalPoints(int personalPoints)
  {
    this.personalPoints += personalPoints;
  }

  /**
   * Removes points from the citizen's personal points.
   *
   * @param personalPoints the points to remove
   * @throws IllegalArgumentException if there are not enough points to remove
   */
  public void removePersonalPoints(int personalPoints)
  {
    if(this.personalPoints - personalPoints < 0)
    {
      throw new IllegalArgumentException("There is not enough points to be removed");
    }
    this.personalPoints -= personalPoints;
  }

  /**
   * Sets the citizen's personal points to a specific value.
   *
   * @param personalPoints the new personal points
   */
  public void setPersonalPoints(int personalPoints)
  {
    this.personalPoints = personalPoints;
  }

  /**
   * Returns the citizen's list of tradeable assignments.
   *
   * @return the TradeableAssignmentList for this citizen
   */
  public TradeableAssignmentList getTradeableAssignmentList()
  {
    return tradeableAssignmentList;
  }

  /**
   * Returns a string representation of the citizen, including full name and personal points.
   *
   * @return a string representing the citizen
   * @see java.lang.Object#toString()
   */
  public String toString()
  {
    return super.getFullName() + " Personlige point: " + personalPoints;
  }

  /**
   * Compares this citizen to another object for equality.
   * Two citizens are equal if their personal points and tradeable assignment lists are equal.
   *
   * @param obj the object to compare with
   * @return true if the other object is a Citizen with the same personal points and tradeable assignments
   * @see java.lang.Object#equals(Object)
   */
  @Override public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
      return false;

    Citizen citizen = (Citizen) obj;

    return personalPoints == citizen.personalPoints
        && Objects.equals(tradeableAssignmentList, citizen.tradeableAssignmentList);
  }
}