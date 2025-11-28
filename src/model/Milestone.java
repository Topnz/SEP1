package model;

import java.util.Objects;

/**
 * Represents a milestone with a title and an associated point value.
 *
 * Each milestone can be used to track progress or achievements.
 * Provides methods to get and set the title and point amount.
 *
 * author SEP Group 1
 * @version 1.0 (28/11-2025)
 */
public class Milestone
{
  private String title;
  private int pointAmount;

  /**
   * Constructs a new Milestone with the specified title and point amount.
   *
   * @param title the title of the milestone
   * @param pointAmount the number of points associated with the milestone
   */
  public Milestone(String title, int pointAmount)
  {
    this.title = title;
    this.pointAmount = pointAmount;
  }

  /**
   * Sets the title of the milestone.
   *
   * @param title the new title
   */
  public void setTitle(String title)
  {
    this.title = title;
  }

  /**
   * Sets the point amount for the milestone.
   *
   * @param pointAmount the new point amount
   */
  public void setPointAmount(int pointAmount)
  {
    this.pointAmount = pointAmount;
  }

  /**
   * Returns the title of the milestone.
   *
   * @return the milestone title
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * Returns the point amount of the milestone.
   *
   * @return the point amount
   */
  public int getPointAmount()
  {
    return pointAmount;
  }

  /**
   * Returns a string representation of the milestone.
   *
   * @return a string in the format "title - pointAmount"
   * @see java.lang.Object#toString()
   */
  @Override public String toString()
  {
    return title + " - " + pointAmount;
  }

  /**
   * Compares this milestone to another object for equality.
   *
   * @param obj the object to compare with
   * @return true if the other object is a Milestone with the same title and point amount
   * @see java.lang.Object#equals(Object)
   */
  @Override public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
      return false;
    Milestone milestone = (Milestone) obj;
    return pointAmount == milestone.pointAmount && Objects.equals(title,
        milestone.title);
  }

}