package model;

/**
 * Represents an abstract assignment with a title, point amount, description,
 * and date of creation. Provides methods to get and set assignment details.
 *
 * author SEP Group 1
 * @version 1.0 (28/11-2025)
 */
public abstract class Assignment
{
  private String title;
  private int pointAmount;
  private String description;

  /**
   * Constructs an Assignment with the specified title, point amount, and description.
   *
   * @param title the title of the assignment
   * @param pointAmount the points associated with the assignment
   * @param description a description of the assignment
   */
  public Assignment(String title, int pointAmount, String description)
  {
    this.title = title;
    this.pointAmount = pointAmount;
    this.description = description;
  }

  /**
   * Sets the title of the assignment.
   *
   * @param title the new title
   */
  public void setTitle(String title)
  {
    this.title = title;
  }

  /**
   * Sets the point amount of the assignment.
   *
   * @param pointAmount the new point amount
   */
  public void setPointAmount(int pointAmount)
  {
    this.pointAmount = pointAmount;
  }

  /**
   * Sets the description of the assignment.
   *
   * @param description the new description
   */
  public void setDescription(String description)
  {
    this.description = description;
  }

  /**
   * Returns the title of the assignment.
   *
   * @return the title
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * Returns the point amount of the assignment.
   *
   * @return the point amount
   */
  public int getPointAmount()
  {
    return pointAmount;
  }

  /**
   * Returns the description of the assignment.
   *
   * @return the description
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * Returns a string representation of the assignment.
   *
   * @return the string representation
   * @see java.lang.Object#toString()
   */
  public abstract String toString();

  /**
   * Compares this assignment to another object for equality.
   *
   * @param obj the object to compare with
   * @return true if the other object is equal to this assignment
   * @see java.lang.Object#equals(Object)
   */
  public abstract boolean equals(Object obj);
}