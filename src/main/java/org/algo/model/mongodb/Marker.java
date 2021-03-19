package org.algo.model.mongodb;

import lombok.Data;

@Data
public class Marker {
	private double lng;
	private double lat;
	private String name;
	private String desc;
	private String belongMuster;
}
