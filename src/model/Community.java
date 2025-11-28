package model;

import java.util.ArrayList;

/**
 * Represents a community that manages shared points and a list of milestones.
 * Provides methods to add, remove, and sort milestones based on the current
 * shared points.
 *
 * author SEP Group 1
 * @version 1.0 (28/11-2025)
 */
public class Community
{
  private int sharedPoints;
  private MilestoneList milestoneList;

  /**
   * Constructs a Community with 0 shared points and an empty MilestoneList.
   */
  public Community()
  {
    sharedPoints = 0;
    milestoneList = new MilestoneList();
  }

  /**
   * Adds points to the shared points of the community.
   *
   * @param sharedPoints the number of points to add
   */
  public void addSharedPoints(int sharedPoints)
  {
    this.sharedPoints += sharedPoints;
  }

  /**
   * Removes points from the shared points of the community.
   *
   * @param sharedPoints the number of points to remove
   * @throws IllegalArgumentException if there are not enough points to remove
   */
  public void removeSharedPoints(int sharedPoints)
  {
    if (this.sharedPoints - sharedPoints < 0)
    {
      throw new IllegalArgumentException("There is not enough points to be removed");
    }
    this.sharedPoints -= sharedPoints;
  }

  /**
   * Sets the total shared points of the community.
   *
   * @param sharedPoints the new shared points value
   */
  public void setSharedPoints(int sharedPoints)
  {
    this.sharedPoints = sharedPoints;
  }

  /**
   * Returns the total shared points of the community.
   *
   * @return the number of shared points
   */
  public int getSharedPoints()
  {
    return sharedPoints;
  }

  /**
   * Returns the list of milestones associated with the community.
   *
   * @return the milestone list
   */
  public MilestoneList getMilestoneList()
  {
    return milestoneList;
  }

  /**
   * Returns a list of milestones that are not yet achievable based on
   * the current shared points, sorted by point amount in ascending order.
   *
   * @return a sorted ArrayList of unachievable milestones
   */
  public ArrayList<Milestone> getSortedMilestonesByAchieveability()
  {
    ArrayList<Milestone> sortedList = new ArrayList<>();

    for (int i = 0; i < milestoneList.getAmountOfMilestones(); i++)
    {
      Milestone milestone = milestoneList.getMilestone(i);
      if (milestone.getPointAmount() > sharedPoints)
      {
        sortedList.add(milestone);
      }
    }

    for (int i = 0; i < sortedList.size(); i++)
    {
      for (int j = 0; j < sortedList.size()-1 -i; j++)
      {
        Milestone milestone1 = sortedList.get(j);
        Milestone milestone2 = sortedList.get(j+1);
        if (milestone1.getPointAmount() > milestone2.getPointAmount())
        {
          sortedList.set(j, milestone2);
          sortedList.set(j + 1, milestone1);
        }
      }
    }
    return sortedList;
  }
}