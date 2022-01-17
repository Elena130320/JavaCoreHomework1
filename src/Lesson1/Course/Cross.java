package Lesson1.Course;

import Lesson1.Team.TeamMembers;

public class Cross extends Obstacle {

    public Cross(int difficulty) {

        super(difficulty);
    }
    @Override
    public void Challenge(TeamMembers members) {

        members.run(super.getDifficulty());
    }
}
