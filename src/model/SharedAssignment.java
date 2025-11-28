package model;

import java.util.Objects;

/**
 * Represents a shared assignment with a completion status and due date.
 * Extends the abstract Assignment class.
 *
 * author SEP Group 1
 * @version 1.0 (28/11-2025)
 */
public class SharedAssignment extends Assignment
{
  private boolean isCompleted;
  private Date dueDate;

  /**
   * Constructs a SharedAssignment with the given title, point amount, description, due date, and completion status.
   *
   * @param title the title of the assignment
   * @param pointAmount the points associated with the assignment
   * @param description a description of the assignment
   * @param dueDate the due date of the assignment
   * @param isCompleted the initial completion status of the assignment
   */
  public SharedAssignment(String title, int pointAmount, String description, Date dueDate, boolean isCompleted)
  {
    super(title, pointAmount, description);
    this.dueDate = dueDate;
    this.isCompleted = isCompleted;
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
    this.dueDate = date.copy();
  }

  /**
   * Returns the due date of this assignment.
   *
   * @return the due date
   */
  public Date getDueDate()
  {
    return dueDate;
  }

  /**
   * Returns whether the assignment is completed.
   *
   * @return true if completed, false otherwise
   */
  public boolean isCompleted()
  {
    return isCompleted;
  }

  /**
   * Returns a string representation of the shared assignment, including title, description,
   * points, due date, and completion status.
   *
   * @return a string representing the assignment
   * @see java.lang.Object#toString()
   */
  @Override public String toString()
  {
    return super.getTitle() + " Beskrivelse: " + super.getDescription() +
        " Antal Personlige Point : " + super.getPointAmount() + " Forfaldsdato: "
        + dueDate + " Er opgaven løst?: " + isCompleted;
  }

  /**
   * Compares this shared assignment to another object for equality.
   * Two shared assignments are equal if their title, description, points, completion status,
   * and due date are equal.
   *
   * @param obj the object to compare with
   * @return true if the other object is a SharedAssignment with the same properties
   * @see java.lang.Object#equals(Object)
   */
  @Override public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }

    SharedAssignment sharedAssignment = (SharedAssignment) obj;

    return super.getPointAmount() == sharedAssignment.getPointAmount()
        && Objects.equals(super.getTitle(), sharedAssignment.getTitle())
        && Objects.equals(super.getDescription(), sharedAssignment.getDescription())
        && isCompleted == sharedAssignment.isCompleted
        && Objects.equals(dueDate, sharedAssignment.dueDate);
  }
}