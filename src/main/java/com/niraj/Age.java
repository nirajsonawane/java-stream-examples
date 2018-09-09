package com.niraj;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@Data
@ToString
public class Age {

	private Integer year;
	private Integer month;
	
}
