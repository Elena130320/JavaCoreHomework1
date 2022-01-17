package Lesson1.Course;

import Lesson1.Status;
import Lesson1.Team.TeamMembers;
import Lesson1.Team.Team;


public class Course {

    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {

        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (TeamMembers member: team.getMembers()) {
            for (Obstacle obs :obstacles) {
                obs.Challenge(member);
                if (member.getStatus()== Status.noPassDistance){
                    break;
                }
            }
        }
    }

}
