package Lesson1.Team;

import Lesson1.Status;

public class TeamMembers {

        private Status status = Status.noPassDistance;
        private String NameTeamMember;
        private int power;

        public TeamMembers(String NameTeamMember, int power) {
            this.NameTeamMember = NameTeamMember;
            this.power = power;
        }

        public Status getStatus() {

            return status;
        }

        public String getNameTeamMember() {

            return NameTeamMember;
        }


        public void jump(int courseDifficulty) {
            if (checkPower(courseDifficulty)) {
                changeStatus(Status.passDistance, " преодолел");
            } else {
                changeStatus(Status.noPassDistance, " не преодолел");
            }
        }

        public void run(int courseDifficulty) {
            if (checkPower(courseDifficulty)) {
                changeStatus(Status.passDistance, " пробежал");
            } else {
                changeStatus(Status.noPassDistance, "  не пробежал");
            }
        }

        public void shoot(int courseDifficulty) {
            if (checkPower(courseDifficulty)) {
                changeStatus(Status.passDistance, " выбил все мишени");
            } else {
                changeStatus(Status.noPassDistance, " не выбил все мишени");
            }
        }

        private boolean checkPower(int courseDifficulty) {
            return power > courseDifficulty || power == courseDifficulty;
        }

        private void changeStatus(Status newStatus, String message) {
            status = newStatus;
            System.out.println(NameTeamMember + message);

        }

}