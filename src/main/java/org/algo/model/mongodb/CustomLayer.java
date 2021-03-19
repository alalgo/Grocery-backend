package org.algo.model.mongodb;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Document("layers")
@Data
public class CustomLayer {
	@Id
	private String uid;
	private String name;
	private String desc;
	private Date createTime;
	private List<Marker> markers;
	private List<VectorGraphic> vectorGraphic;
}
