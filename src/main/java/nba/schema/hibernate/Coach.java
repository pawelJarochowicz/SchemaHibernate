package nba.schema.hibernate;


import lombok.Getter;
import lombok.Setter;

public class Coach {

    @Getter @Setter private int coach_id;
    @Getter @Setter private String first_name;
    @Getter @Setter private String last_name;
    @Getter @Setter private int team_id;
    @Getter @Setter private int age;
}
