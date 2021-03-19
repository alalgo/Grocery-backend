package org.algo.dao;

import java.util.List;

import org.algo.model.mongodb.CustomLayer;

public interface LayerDao {
	public void update(CustomLayer layer);
	public List<CustomLayer> find();
	public CustomLayer findLayerById(String uid);
	public void deleteLayerById(String uid);
}
