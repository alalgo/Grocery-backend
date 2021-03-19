package org.algo.model.mongodb;

import java.util.List;

import lombok.Data;
@Data
public class VectorGraphic {
	private String city;
	/**
	 * 类型，Polygon、Polyline、BezierCurve等
	 */
	private String type;
	/**
	 * 轮廓线条颜色 
	 */
	private String strokeColor;
	/**
	 * 轮廓线条透明度
	 */	
	private String strokeOpacity;
	/**
	 * 轮廓线条宽度 
	 */	
	private String strokeWeight;
	/**
	 * 轮廓线样式：实线:solid、虚线:dashed 
	 */	
	private String strokeStyle;
	/**
	 * 填充颜色
	 */	
	private String fillColor;
	/**
	 * 填充透明度
	 */	
	private String fillOpacity;
	/**
	 * 节点坐标数组
	 */	
	private List<Marker> markers;
}
