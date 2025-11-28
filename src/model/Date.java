package model;

import java.time.LocalDate;

/**
 * Represents a calendar date with year, month, and day fields.
 *
 * Provides utility methods for leap year checking, month names,
 * and number of days in the month.
 *
 * author SEP Group 1
 * @version 1.0 (28/11-2025)
 */
public class Date
{
  private int year;
  private int month;
  private int day;

  /**
   * Constructs a Date object representing today's date.
   */
  public Date() {
    LocalDate today = LocalDate.now();
    set(today.getYear(), today.getMonthValue(), today.getDayOfMonth());
  }

  /**
   * Constructs a Date object with the specified year, month, and day.
   *
   * @param year the year
   * @param month the month (1-12)
   * @param day the day of the month
   */
  public Date(int year, int month, int day)
  {
    set(year, month, day);
  }

  /**
   * Sets the year, month, and day of this Date.
   *
   * @param year the year
   * @param month the month (1-12)
   * @param day the day of the month
   */
  public void set(int year, int month, int day)
  {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  /**
   * Returns the year.
   *
   * @return the year
   */
  public int getYear()
  {
    return year;
  }

  /**
   * Returns the month.
   *
   * @return the month (1-12)
   */
  public int getMonth()
  {
    return month;
  }

  /**
   * Returns the day of the month.
   *
   * @return the day
   */
  public int getDay()
  {
    return day;
  }

  /**
   * Checks if the year of this date is a leap year.
   *
   * @return true if it is a leap year, false otherwise
   */
  public boolean isLeapYear()
  {
    int year = this.year;

    if (year % 400 == 0)
    {
      return true;
    }

    if (year % 100 == 0)
    {
      return false;
    }

    return year % 4 == 0;
  }

  /**
   * Returns the number of days in the current month of this Date.
   *
   * @return the number of days in the month
   * @throws IllegalArgumentException if the month is less than 1 or greater than 12
   * @throws IllegalStateException if an unknown month is encountered (should not happen)
   */
  public int numberOfDaysInMonth()
  {
    if (month < 1 || month > 12) {
      throw new IllegalArgumentException("Ukendt måned: " + month);
    }

    switch (month) {
      case 1: //January
      case 3: //March
      case 5: //May
      case 7: //July
      case 8: //August
      case 10: //October
      case 12: //December
        return 31;

      case 4: //April
      case 6://June
      case 9: //September
      case 11: //November
        return 30;

      case 2:
        if (isLeapYear()) {
          return 29;
        } else {
          return 28;
        }

      default:
        throw new IllegalStateException("Ukendt måned: " + month);
    }
  }

  /**
   * Returns the name of the current month.
   *
   * @return the month name as a string
   * @throws IllegalArgumentException if the month is less than 1 or greater than 12
   */
  public String getMonthName()
  {
    switch (month) {
      case 1:  return "Januar";
      case 2:  return "Februar";
      case 3:  return "Marts";
      case 4:  return "April";
      case 5:  return "Maj";
      case 6:  return "Juni";
      case 7:  return "Juli";
      case 8:  return "August";
      case 9:  return "September";
      case 10: return "Oktober";
      case 11: return "November";
      case 12: return "December";

      default:
        throw new IllegalArgumentException("Ukendt måned: " + month);
    }
  }

  /**
   * Returns a copy of this Date object.
   *
   * @return a new Date object with the same year, month, and day
   */
  public Date copy()
  {
    return new Date(year, month, day);
  }

  /**
   * Returns a string representation of this date in YYYY-MM-DD format.
   *
   * @return the formatted date string
   * @see java.lang.Object#toString()
   */
  @Override public String toString()
  {
    return String.format("%04d-%02d-%02d", year, month, day);
  }

  /**
   * Compares this Date object with another object for equality.
   *
   * @param obj the object to compare with
   * @return true if the other object is a Date with the same year, month, and day
   * @see java.lang.Object#equals(Object)
   */
  @Override public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
      return false;
    Date date = (Date) obj;
    return year == date.year && month == date.month && day == date.day;
  }
}