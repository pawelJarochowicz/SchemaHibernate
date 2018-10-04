package nba.schema.hibernate;

import lombok.Getter;
import lombok.Setter;

public class Team_stats {

    @Getter @Setter private int team_stats_id;
    @Getter @Setter private int off_points;
    @Getter @Setter private int def_points;
    @Getter @Setter private int off_rating;
    @Getter @Setter private int def_rating;
    @Getter @Setter private int champ_rating;
    @Getter @Setter private int organisation;
    @Getter @Setter private int team_id;


}
