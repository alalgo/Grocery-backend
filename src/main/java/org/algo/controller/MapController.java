package org.algo.controller;

import java.util.List;

import org.algo.model.mongodb.CustomLayer;
import org.algo.service.LayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/map")
public class MapController {
	@Autowired
	private LayerService layerService;
	@PostMapping(value="/updateLayer")
	public void updateLayer(@RequestBody CustomLayer layer) {
		layerService.update(layer);
	}
	@GetMapping("/getAllLayers")
	public List<CustomLayer> getAllLayers(){
		return layerService.getCustomLayerList();
	}
	@GetMapping("/getLayerById")
	public CustomLayer getLayerById(String uid){
		return layerService.getCustomLayer(uid);
	}	
	@GetMapping("/deleteById")
	public void deleteById(String uid) {
		layerService.deleteCustomLayerById(uid);
	}
}
