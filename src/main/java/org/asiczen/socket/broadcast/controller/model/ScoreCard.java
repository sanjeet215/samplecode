package org.asiczen.socket.broadcast.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ScoreCard {

	private String totalRuns;
	private String totalOvers;
	private String battingTeamName;
	private String bowlingTeamName;
}
