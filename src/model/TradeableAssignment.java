package model;

import java.util.Objects;

/**
 * Represents a tradeable assignment that extends the abstract Assignment class.
 * Provides a string representation and equality comparison for tradeable assignments.
 *
 * author SEP Group 1
 * @version 1.0 (28/11-2025)
 */
public class TradeableAssignment extends Assignment
{
  /**
   * Constructs a TradeableAssignment with the specified title, point amount, and description.
   *
   * @param title the title of the assignment
   * @param pointAmount the points associated with the assignment
   * @param description a description of the assignment
   */
  public TradeableAssignment(String title, int pointAmount, String description)
  {
    super(title, pointAmount, description);
  }

  /**
   * Returns a string representation of the tradeable assignment.
   *
   * @return a string containing the title, description, and point amount
   * @see java.lang.Object#toString()
   */
  @Override public String toString()
  {
    return "Title: " + super.getTitle() + " Description: " + super.getDescription() + " Points: " + super.getPointAmount();
  }

  /**
   * Compares this tradeable assignment to another object for equality.
   * Two tradeable assignments are equal if their titles, descriptions, and point amounts are the same.
   *
   * @param obj the object to compare with
   * @return true if the other object is a TradeableAssignment with the same title, description, and point amount
   * @see java.lang.Object#equals(Object)
   */
  @Override public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
      return false;

    TradeableAssignment tradeableAssignment = (TradeableAssignment) obj;

    return super.getPointAmount() == tradeableAssignment.getPointAmount()
        && Objects.equals(super.getTitle(), tradeableAssignment.getTitle())
        && Objects.equals(super.getDescription(), tradeableAssignment.getDescription());
  }
}