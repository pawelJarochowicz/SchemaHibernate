package nba.schema.hibernate;

import lombok.Getter;
import lombok.Setter;

public class Team {

    @Getter @Setter private int team_id;
    @Getter @Setter private String name;
    @Getter @Setter private String city;
    @Getter @Setter private String state;
    @Getter @Setter private String short_name;
}
