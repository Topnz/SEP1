package model;

/**
 * Represents an abstract person with a name and an address.
 *
 * Subclasses must implement {@link #toString()} and {@link #equals(Object)}.
 *
 * author SEP Group 1
 * @version 1.0 (28/11-2025)
 */
public abstract class Person
{
  private Address address;
  private Name name;

  /**
   * Constructs a Person with the specified name and address.
   *
   * @param name the person's name
   * @param address the person's address
   * @throws IllegalArgumentException if either name or address is null
   */
  public Person(Name name, Address address)
  {
    if (address == null)
      throw new IllegalArgumentException("Address cannot be null");
    if (name == null)
      throw new IllegalArgumentException("There must be a name");
    this.name = name.copy();
    this.address = address;
  }

  /**
   * Sets the person's first and last name.
   *
   * @param firstName the new first name
   * @param lastName the new last name
   */
  public void setName(String firstName, String lastName)
  {
    name.setFirstName(firstName);
    name.setLastName(lastName);
  }

  /**
   * Sets the person's address.
   *
   * @param address the new address
   * @throws IllegalArgumentException if the provided address is null
   */
  public void setAddress(Address address)
  {
    if (address == null)
      throw new IllegalArgumentException("Address cannot be null");
    this.address = address;
  }

  /**
   * Returns the person's full name.
   *
   * @return the full name
   */
  public String getFullName()
  {
    return name.getFullName();
  }

  /**
   * Returns the person's address.
   *
   * @return the address
   */
  public Address getAddress()
  {
    return address;
  }

  /**
   * Returns the person's full address.
   *
   * @return the formatted full address
   */
  public String getFullAddress()
  {
    return address.getFullAddress();
  }

  /**
   * Returns a string representation of the person.
   *
   * @return a string describing the person
   * @see java.lang.Object#toString()
   */
  @Override public abstract String toString();

  /**
   * Compares this person with another object for equality.
   *
   * @param obj the object to compare with
   * @return true if equal; false otherwise
   * @see java.lang.Object#equals(Object)
   */
  @Override public abstract boolean equals(Object obj);

}