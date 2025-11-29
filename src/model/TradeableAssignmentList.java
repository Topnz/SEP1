package model;

import java.util.ArrayList;

/**
 * Represents a list of tradeable assignments provided by a specific citizen.
 * Provides methods to add, remove, and retrieve tradeable assignments.
 *
 * author SEP Group 1
 * @version 1.0 (28/11-2025)
 */
public class TradeableAssignmentList
{
  private Citizen citizenProvider;
  private ArrayList<TradeableAssignment> tradeableAssignments;

  /**
   * Constructs a TradeableAssignmentList for the given citizen provider.
   *
   * @param citizenProvider the citizen providing the tradeable assignments
   * @throws IllegalArgumentException if the provided citizenProvider is null
   */
  public TradeableAssignmentList(Citizen citizenProvider)
  {
    if (citizenProvider == null)
    {
      throw new IllegalArgumentException("Citizen can't be null");
    }
    this.citizenProvider = citizenProvider;
    tradeableAssignments = new ArrayList<>();
  }

  /**
   * Returns the number of tradeable assignments in the list.
   *
   * @return the number of tradeable assignments
   */
  public int getAmountOfTradeableAssignments()
  {
    return tradeableAssignments.size();
  }

  /**
   * Adds a tradeable assignment to the list.
   *
   * @param assignment the assignment to add
   * @throws IllegalArgumentException if the assignment is null or not a TradeableAssignment
   */
  public void addTradeableAssignment(Assignment assignment)
  {
    if (assignment == null)
    {
      throw new IllegalArgumentException("Assignment cant be null");
    }
    if (!(assignment instanceof TradeableAssignment))
    {
      throw new IllegalArgumentException("Assignment is not a TradeableAssignment");
    }

    TradeableAssignment tradeableAssignment = (TradeableAssignment) assignment;

    tradeableAssignments.add(tradeableAssignment);
  }

  /**
   * Removes the specified tradeable assignment from the list.
   *
   * @param tradeableAssignment the assignment to remove
   */
  public void removeTradeableAssignment(TradeableAssignment tradeableAssignment)
  {
    tradeableAssignments.remove(tradeableAssignment);
  }

  /**
   * Removes the tradeable assignment at the specified index.
   *
   * @param index the index of the assignment to remove
   * @throws IndexOutOfBoundsException if the index is invalid
   */
  public void removeTradeableAssignment(int index)
  {
    tradeableAssignments.remove(index);
  }

  /**
   * Returns the tradeable assignment at the specified index.
   *
   * @param index the index of the assignment
   * @return the tradeable assignment at the given index
   * @throws IndexOutOfBoundsException if the index is invalid
   */
  public TradeableAssignment getTradeableAssignment(int index)
  {
    return tradeableAssignments.get(index);
  }

  /**
   * Returns a list of tradeable assignments that match the given search string.
   * Currently not implemented and returns null.
   *
   * @param search the search string to filter assignments
   * @return an ArrayList of tradeable assignments matching the search, or null
   */
  public ArrayList<TradeableAssignment> getTradeableAssignmentsBySearch(String search)
  {
    return null;
  }

  /**
   * Returns the list of tradeable assignments.
   *
   * @return an {@link ArrayList} containing all TradeableAssignment objects
   */
  public ArrayList<TradeableAssignment> getArrayList()
  {
    return tradeableAssignments;
  }
}