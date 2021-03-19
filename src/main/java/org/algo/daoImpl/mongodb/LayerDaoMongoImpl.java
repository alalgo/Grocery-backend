package org.algo.daoImpl.mongodb;

import java.util.List;

import javax.annotation.Resource;

import org.algo.dao.LayerDao;
import org.algo.model.mongodb.CustomLayer;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
@Component
public class LayerDaoMongoImpl implements LayerDao {
    @Resource
    private MongoTemplate mongoTemplate;
	@Override
	public void update(CustomLayer layer) {
		CustomLayer dblayer = this.findLayerById(layer.getUid());
		if(dblayer != null) {
			layer.setCreateTime(dblayer.getCreateTime());
			mongoTemplate.remove(dblayer);			
		}
		mongoTemplate.save(layer);
	}

	@Override
	public List<CustomLayer> find() {
		return mongoTemplate.findAll(CustomLayer.class);
	}

	@Override
	public CustomLayer findLayerById(String uid) {
		Query query = new Query(Criteria.where("uid").is(uid));
		return mongoTemplate.findOne(query, CustomLayer.class);
	}

	@Override
	public void deleteLayerById(String uid) {
		Query query = new Query(Criteria.where("uid").is(uid));
		mongoTemplate.remove(query, CustomLayer.class);
	}
}
