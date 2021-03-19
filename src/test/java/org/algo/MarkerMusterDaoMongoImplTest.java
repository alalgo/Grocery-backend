package org.algo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.algo.dao.LayerDao;
import org.algo.model.mongodb.CustomLayer;
import org.algo.model.mongodb.Marker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = GroceryBackendApplication.class)
@Slf4j
public class MarkerMusterDaoMongoImplTest {
	@Autowired
	private LayerDao markerMusterDao;
	@Test
	public void saveTest() {
		CustomLayer layer = new CustomLayer();
		layer.setName("餐馆1");
		layer.setDesc("所有餐馆评分");
		layer.setCreateTime(new Date());

		List<Marker> markers = new ArrayList<Marker>();
		Marker marker= new Marker();
		marker.setLat(123.4);
		marker.setLng(34.2);
		markers.add(marker);
		layer.setMarkers(markers);
		markerMusterDao.update(layer);
	}
	@Test
	public void findTest() {
		System.out.println("result:" + markerMusterDao.find());
	}
}
