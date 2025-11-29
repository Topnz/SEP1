package model;

import java.util.Objects;

/**
 * Represents a green assignment with completion status, times completed, and a due date.
 * Extends the abstract Assignment class.
 *
 * @author SEP Group 1
 * @version 1.0 (29/11-2025)
 */
public class GreenAssignment extends Assignment
{
  private boolean isCompleted;
  private int timesCompleted;
  private Date dueDate;

  /**
   * Constructs a GreenAssignment with the specified title, point amount,
   * description, due date, and the number of times completed.
   *
   * @param title the title of the assignment
   * @param pointAmount the points associated with the assignment
   * @param description a description of the assignment
   * @param dueDate the due date of the assignment
   * @param timesCompleted the number of times the assignment has been completed
   */
  public GreenAssignment(String title, int pointAmount, String description, Date dueDate, int timesCompleted)
  {
    super(title, pointAmount, description);
    this.dueDate = dueDate;
    this.timesCompleted = timesCompleted;
  }

  /**
   * Sets the completion status of this assignment.
   *
   * @param isCompleted true if the assignment is completed, false otherwise
   */
  public void setComplete(boolean isCompleted)
  {
    this.isCompleted = isCompleted;
  }

  /**
   * Sets the due date for this assignment.
   *
   * @param date the new due date
   */
  public void setDueDate(Date date)
  {
    this.dueDate = dueDate.copy();
  }

  /**
   * Sets the number of times the assignment has been completed.
   *
   * @param timesCompleted the new times completed count
   */
  public void setTimesCompleted(int timesCompleted)
  {
    this.timesCompleted = timesCompleted;
  }

  /**
   * Returns the due date of this assignment.
   *
   * @return a copy of the due date
   */
  public Date getDueDate()
  {
    return dueDate.copy();
  }

  /**
   * Returns the number of times this assignment has been completed.
   *
   * @return the times completed
   */
  public int getTimesCompleted()
  {
    return timesCompleted;
  }

  /**
   * Returns a string representation of the green assignment, including title,
   * description, points, due date, and times completed.
   *
   * @return a string representing the assignment
   * @see java.lang.Object#toString()
   */
  @Override public String toString()
  {
    return super.getTitle() + " Beskrivelse: " + super.getDescription() +
        " Antal Fællespoint: " + super.getPointAmount() + " Forfaldsdato: "
        + dueDate + " Antal gange klaret: " + timesCompleted;
  }

  /**
   * Compares this green assignment to another object for equality.
   * Two green assignments are equal if their completion status, times completed,
   * and due dates are the same.
   *
   * @param obj the object to compare with
   * @return true if the other object is a GreenAssignment with the same properties
   * @see java.lang.Object#equals(Object)
   */
  @Override public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
      return false;
    GreenAssignment that = (GreenAssignment) obj;
    return isCompleted == that.isCompleted
        && timesCompleted == that.timesCompleted && Objects.equals(dueDate,
        that.dueDate);
  }
}