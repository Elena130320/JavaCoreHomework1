package Lesson1.Course;

import Lesson1.Team.TeamMembers;

public class Shooting extends Obstacle{
    public Shooting(int difficulty) {

        super(difficulty);
    }

    @Override
    public void Challenge(TeamMembers member) {

        member.shoot(super.getDifficulty());
    }
}
