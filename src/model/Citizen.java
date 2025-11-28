package model;

public class Citizen extends Person
{
  private int personalPoints;
  private TradeableAssignmentList tradeableAssignmentList;

  public Citizen(Name name, Address address)
  {
    super(name, address);
    this.tradeableAssignmentList = new TradeableAssignmentList(this);
  }


}
