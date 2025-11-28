package model;

import java.util.ArrayList;

/**
 * Represents a list of Milestone objects.
 * Provides methods to add, remove, edit, and retrieve milestones.
 *
 * author SEP Group 1
 * @version 1.0 (28/11-2025)
 */
public class MilestoneList
{
  private ArrayList<Milestone> milestones;

  /**
   * Constructs an empty MilestoneList.
   */
  public MilestoneList()
  {
    milestones = new ArrayList<>();
  }

  /**
   * Returns the number of milestones in the list.
   *
   * @return the number of milestones
   */
  public int getAmountOfMilestones()
  {
    return milestones.size();
  }

  /**
   * Adds a milestone to the list.
   *
   * @param milestone the milestone to add
   */
  public void addMilestone(Milestone milestone)
  {
    milestones.add(milestone);
  }

  /**
   * Removes a specific milestone from the list.
   *
   * @param milestone the milestone to remove
   */
  public void removeMilestone(Milestone milestone)
  {
    milestones.remove(milestone);
  }

  /**
   * Removes a milestone at the specified index.
   *
   * @param index the index of the milestone to remove
   * @throws IndexOutOfBoundsException if the index is invalid
   */
  public void removeMilestone(int index)
  {
    milestones.remove(index);
  }

  /**
   * Removes the first milestone found with the specified title.
   *
   * @param title the title of the milestone to remove
   */
  public void removeMilestoneByTitle(String title)
  {
    for (int i = 0; i < milestones.size(); i++)
    {
      if (milestones.get(i).getTitle().equals(title))
      {
        milestones.remove(i);
        break;
      }
    }
  }

  /**
   * Edits the first milestone found with the specified title.
   * Updates the title and point amount of the milestone.
   *
   * @param title the current title of the milestone
   * @param newTitle the new title to set
   * @param newPointAmount the new point amount to set
   */
  public void editMilestoneByTitle(String title, String newTitle, int newPointAmount)
  {
    for (int i = 0; i < milestones.size(); i++)
    {
      Milestone milestone = milestones.get(i);
      if (milestone.getTitle().equals(title))
      {
        milestone.setTitle(newTitle);
        milestone.setPointAmount(newPointAmount);
        break;
      }
    }
  }

  /**
   * Returns the first milestone found with the specified title.
   *
   * @param title the title to search for
   * @return the milestone if found, or null if no matching milestone exists
   */
  public Milestone getMilestone(String title)
  {
    for (int i = 0; i < milestones.size(); i++)
    {
      if (milestones.get(i).getTitle().equals(title))
      {
        return milestones.get(i);
      }
    }
    return null;
  }

  /**
   * Returns the milestone at the specified index.
   *
   * @param index the index of the milestone
   * @return the milestone at the given index
   * @throws IndexOutOfBoundsException if the index is invalid
   */
  public Milestone getMilestone(int index)
  {
    return milestones.get(index);
  }
}