package nba.schema.hibernate;

import lombok.Getter;
import lombok.Setter;

public class Player_stats {

    @Getter @Setter private int player_stats_id;
    @Getter @Setter private int points;
    @Getter @Setter private int rebounds;
    @Getter @Setter private int assists;
    @Getter @Setter private int off_rat;
    @Getter @Setter private int def_rat;
    @Getter @Setter private int three_points;
    @Getter @Setter private int clutch;
    @Getter @Setter private int goat;
    @Getter @Setter private int player_id;
}
