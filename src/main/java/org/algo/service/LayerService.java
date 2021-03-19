package org.algo.service;

import java.util.List;

import org.algo.model.mongodb.CustomLayer;

public interface LayerService {
	public void update(CustomLayer layer);
	public List<CustomLayer> getCustomLayerList();
	public CustomLayer getCustomLayer(String uid);
	public void deleteCustomLayerById(String uid);
}
