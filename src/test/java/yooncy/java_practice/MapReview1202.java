package yooncy.java_practice;

import java.util.ArrayList;
import java.util.List;

public class MapReview1202 {

    public static void main(String[] args) {
        List<String> names = List.of("윤찬영",
                "정해준",
                "권상윤",
                "문인혁",
                "허재",
                "이호연",
                "윤태우",
                "김성락",
                "전지예",
                "황승혁",
                "이채현",
                "황효진",
                "김민성",
                "박현지",
                "문성희",
                "추민영");
        ArrayList<String> team1 = new ArrayList<>();
        ArrayList<String> team2 = new ArrayList<>();
        ArrayList<String> team3 = new ArrayList<>();
        ArrayList<String> team4 = new ArrayList<>();
        ArrayList<ArrayList<String>> teams = new ArrayList<>();
        teams.add(team1);
        teams.add(team2);
        teams.add(team3);
        teams.add(team4);

        int teamNum = 0;
        for (String name : names) {
            ArrayList<String> team = teams.get(teamNum);
            team.add(name);
            if (team.size() == 4) {
                teamNum += 1;
            }
        }


//        for (int i = 0; i < names.size(); i++) {
//            if (i < 4) {
//                team1.add(names.get(i));
//            }
//            else if (i < 8) {
//                team2.add(names.get(i));
//            }
//            else if (i < 12) {
//                team3.add(names.get(i));
//            }
//            else {
//                team4.add(names.get(i));
//            }
//        }


    }

}
