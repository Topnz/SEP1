package model;

import java.util.Objects;

/**
 * Represents a physical address consisting of a street name,
 * a house number, and a zipcode.
 *
 * @author SEP Group 1
 * @version 1.0 (28/11-2025)
 */
public class Address
{
  private String streetName;
  private String houseNumber;
  private int zipcode;

  /**
   * Constructs a new Address object and initializes its fields.
   *
   * @param streetName the name of the street
   * @param houseNumber the house number
   * @param zipcode the zipcode
   */
  public Address(String streetName, String houseNumber, int zipcode)
  {
    set(streetName, houseNumber, zipcode);
  }

  /**
   * Sets all fields of the address at once.
   *
   * @param streetName the name of the street
   * @param houseNumber the house number
   * @param zipcode the zipcode
   */
  public void set(String streetName, String houseNumber, int zipcode)
  {
    this.streetName = streetName;
    this.houseNumber = houseNumber;
    this.zipcode = zipcode;
  }

  /**
   * Returns the street name.
   *
   * @return the street name
   */
  public String getStreetName()
  {
    return streetName;
  }

  /**
   * Returns the house number.
   *
   * @return the house number
   */
  public String getHouseNumber()
  {
    return houseNumber;
  }

  /**
   * Returns the zipcode.
   *
   * @return the zipcode
   */
  public int getZipcode()
  {
    return zipcode;
  }

  /**
   * Returns the full formatted address.
   *
   * @return the full address as a string
   */
  public String getFullAddress()
  {
    return streetName +" " + houseNumber + ", " + zipcode;
  }

  /**
   * Compares this address with another object for equality.
   *
   * @param obj the object to compare with
   * @return true if the objects are considered equal, false otherwise
   * @see java.lang.Object#equals(Object)
   */
  @Override public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Address address = (Address) obj;
    return zipcode == address.zipcode && Objects.equals(streetName,
        address.streetName) && Objects.equals(houseNumber, address.houseNumber);
  }
}