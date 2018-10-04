package nba.schema.hibernate;

import lombok.Getter;
import lombok.Setter;

public class Player {

    @Getter @Setter private int player_id;
    @Getter @Setter private String first_name;
    @Getter @Setter private String last_name;
    @Getter @Setter private String position;
    @Getter @Setter private int age;
    @Getter @Setter private int team_id;
}
