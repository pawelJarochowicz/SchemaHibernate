package nba.schema.hibernate;

import lombok.Getter;
import lombok.Setter;

public class Coach_stats {

    @Getter @Setter private int coach_stats_id;
    @Getter @Setter private int experience;
    @Getter @Setter private int wins_rat;
    @Getter @Setter private int offensive;
    @Getter @Setter private int defensive;
    @Getter @Setter private int champs_rat;
    @Getter @Setter private int coach_id;
}
