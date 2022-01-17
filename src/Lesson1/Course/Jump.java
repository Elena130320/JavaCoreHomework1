package Lesson1.Course;

import Lesson1.Team.TeamMembers;

public class Jump extends Obstacle {
    public Jump(int difficulty) {

        super(difficulty);
    }

    @Override
    public void Challenge(TeamMembers member) {

        member.jump(super.getDifficulty());
    }

}
