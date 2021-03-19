package org.algo.serviceImpl;

import java.util.List;

import org.algo.dao.LayerDao;
import org.algo.model.mongodb.CustomLayer;
import org.algo.service.LayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LayerServiceImpl implements LayerService {
	@Autowired
	private LayerDao layerDao;
	@Override
	public void update(CustomLayer layer) {
		layerDao.update(layer);
	}

	@Override
	public List<CustomLayer> getCustomLayerList() {
		List<CustomLayer> customLayers= layerDao.find();		
		for(CustomLayer customLayer:customLayers) {
			customLayer.setMarkers(null);
			customLayer.setVectorGraphic(null);
		}
		return customLayers;
	}

	@Override
	public CustomLayer getCustomLayer(String uid) {
		return layerDao.findLayerById(uid);
	}

	@Override
	public void deleteCustomLayerById(String uid) {
		layerDao.deleteLayerById(uid);
	}

}
