package Lesson1.Team;

import Lesson1.Status;


public class Team {
    private TeamMembers[] members;
    private final String teamName;

    public Team(String teamName, TeamMembers... members) {
        this.members = members;
        this.teamName = teamName;

    }

    public void showResults() {
        System.out.println(teamName + "проходила полосу препятствий");

        for (TeamMembers member: members) {
           if (member.getStatus() == Status.noPassDistance) {
                showNoPass(member);
            } else {
                showPass(member);
            }
        }

    }

    private void showNoPass(TeamMembers member) {
        System.out.println(member.getNameTeamMember() + " не прошел полосу препятствий");
    }

    private void showPass(TeamMembers member) {

        System.out.println(member.getNameTeamMember() + " прошел полосу препятствий");
    }

    public TeamMembers[] getMembers() {

        return members;
    }


}
