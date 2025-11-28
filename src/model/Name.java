package model;

import java.util.Objects;

/**
 * Represents a person's name including first and last name.
 *
 * @author SEP Group 1
 * @version 1.0 (28/11-2025)
 */
public class Name
{
  private String firstName;
  private String lastName;

  /**
   * Constructs a new Name object and initializes its fields.
   *
   * @param firstName the first name
   * @param lastName the last name
   */
  public Name(String firstName, String lastName)
  {
    setFirstName(firstName);
    setLastName(lastName);
  }

  /**
   * Sets the first name.
   *
   * @param firstName the first name
   */
  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  /**
   * Sets the last name.
   *
   * @param lastName the last name
   */
  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  /**
   * Returns the first name.
   *
   * @return the first name
   */
  public String getFirstName()
  {
    return firstName;
  }

  /**
   * Returns the last name.
   *
   * @return the last name
   */
  public String getLastName()
  {
    return lastName;
  }

  /**
   * Returns the full name consisting of first name and last name.
   *
   * @return the full name
   */
  public String getFullName()
  {
    return firstName + " " + lastName;
  }

  /**
   * Creates and returns a copy of this Name object.
   *
   * @return a new Name object with the same values
   */
  public Name copy()
  {
    return new Name(firstName, lastName);
  }

  /**
   * Compares this Name object to another for equality.
   *
   * @param obj the object to compare with
   * @return true if both Name objects have identical field values, false otherwise
   * @see java.lang.Object#equals(Object)
   */
  @Override public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }

    Name name = (Name) obj;

    return Objects.equals(firstName, name.firstName) && Objects.equals(lastName,
        name.lastName);
  }
}