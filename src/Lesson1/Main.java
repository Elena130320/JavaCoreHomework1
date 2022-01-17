package Lesson1;

import Lesson1.Team.Team;
import Lesson1.Team.TeamMembers;
import Lesson1.Course.Cross;
import Lesson1.Course.Jump;
import Lesson1.Course.Shooting;
import Lesson1.Course.Course;

public class Main {

    public static void main (String[] args) {
        Team SportTeam = new Team("SportTeam",
                new TeamMembers("1A", 5),
                new TeamMembers("2B", 5),
                new TeamMembers("3C", 5),
                new TeamMembers("4D", 5));
        Course course = new Course(new Cross(5), new Jump(5), new Shooting(5));

    }

}
