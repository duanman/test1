package com.jt.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ImageVO {

	private Integer error;
	
	private String url;
	
	private Integer width;
	
	private Integer height;
	
	public static ImageVO fail() {
		return new ImageVO(1,null,null,null);
	}
	
	public static ImageVO success(String url,Integer width,Integer height) {
		return new ImageVO(0,url,width,height);
	}
}
