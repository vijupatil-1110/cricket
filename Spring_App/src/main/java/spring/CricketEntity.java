package spring;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CricketEntity {

	 @Id
	 private Long ID;

	 private String Name;
	 private Long Matchs_Played;
	 private Long Runs;
	 private Long Wickets;
}
