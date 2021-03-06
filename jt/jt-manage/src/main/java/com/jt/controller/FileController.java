package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jt.service.FileService;
import com.jt.vo.ImageVO;
import com.jt.vo.SysResult;

@RestController
public class FileController {
	
	@Autowired
	private FileService fileService;

	@RequestMapping("/pic/upload")
	public ImageVO uploadFile(MultipartFile uploadFile) {
		
		return fileService.uploadFile(uploadFile);
	}
}
