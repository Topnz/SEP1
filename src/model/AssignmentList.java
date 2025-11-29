package model;

import java.util.ArrayList;

public class AssignmentList
{
  private ArrayList<Assignment> assignments;

  public AssignmentList()
  {
    this.assignments = new ArrayList<>();
  }

  public int getAmountOfAssignments()
  {
    return assignments.size();
  }

  public void addAssignment(Assignment assignment)
  {
    assignments.add(assignment);
  }

  public void removeAssignment(Assignment assignment)
  {
    assignments.remove(assignment);
  }

  public void removeAssignment(int index)
  {
    assignments.remove(index);
  }

  public Assignment getAssignment(int index)
  {
    return assignments.get(index);
  }


  //Not implemented
  public ArrayList<Assignment> getAssignmentsBySearch(String search)
  {
    return null;
  }

  //Not implemented
  public ArrayList<GreenAssignment> getGreenAssignments()
  {
    return null;
  }

  //Not implemented
  public ArrayList<SharedAssignment> getSharedAssignments()
  {
    return  null;
  }

  public Assignment getAssignmentByTitle(String title)
  {
    return  null;
  }

  public ArrayList<Assignment> getCompletedAssignments()
  {
    return  null;
  }

  public void editSharedAssignmentByTitle(String title, String newTitle, int newPointAmount, String newDescription, Date newDueDate, boolean isCompleted)
  {

  }

  public void editGreenAssignmentByTitle(String title, String newTitle, int newPointAmount, String newDescription, Date newDueDate, boolean isCompleted, int newTimesCompleted)
  {

  }
}



