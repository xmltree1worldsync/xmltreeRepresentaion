package com.onews.xmltree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onews.xmltree.service.XMLTreeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/treeapi")
public class XMLTreeController {
	
	public static final Logger logger = LoggerFactory.getLogger(XMLTreeController.class);	 
	
	@Autowired
	public XMLTreeService xmlTreeService; //service to do all retrieval/manipulation of data
	
	
	
	

}
