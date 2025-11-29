import javafx.application.Application;
import javafx.stage.Stage;
import model.Community;
import model.Milestone;
import model.MilestoneList;

import java.util.ArrayList;

public class SystemKloeverly extends Application
{
  public void start(Stage primaryStage)
  {
    Community community = new Community();

    community.setSharedPoints(300);

    MilestoneList ms = community.getMilestoneList();

    ms.addMilestone(new Milestone("Mad", 500));
    ms.addMilestone(new Milestone("Træning", 200));
    ms.addMilestone(new Milestone("Udstyr", 800));
    ms.addMilestone(new Milestone("Transport", 300));
    ms.addMilestone(new Milestone("Fællesskab", 100));
    ms.addMilestone(new Milestone("Events", 600));
    ms.addMilestone(new Milestone("Projekt", 400));
    ms.addMilestone(new Milestone("Planlægning", 150));
    ms.addMilestone(new Milestone("Undervisning", 250));
    ms.addMilestone(new Milestone("Aktiviteter", 350));
    ms.addMilestone(new Milestone("Rekruttering", 450));
    ms.addMilestone(new Milestone("Kampagner", 700));
    ms.addMilestone(new Milestone("Samarbejde", 550));
    ms.addMilestone(new Milestone("Innovation", 650));
    ms.addMilestone(new Milestone("Miljøtiltag", 750));
    ms.addMilestone(new Milestone("Samarbejde", 550));
    ms.addMilestone(new Milestone("Innovation", 650));
    ms.addMilestone(new Milestone("Miljøtiltag", 750));

    ArrayList<Milestone> msSorted = community.getSortedMilestonesByAchieveability();

    for (int i = 0; i < msSorted.size(); i++)
    {
      System.out.println(msSorted.get(i));
    }
  }



}
