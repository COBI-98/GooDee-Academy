package com.esh.home.util;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.esh.home.MyAbstractTest;
import com.esh.start.util.FileManager;

public class FileManagerTest extends MyAbstractTest{

	@Autowired
	private FileManager fileManager;

	@Test
	public void saveFileTest() throws Exception {
		fileManager.saveFile("resources/upload/test");
		System.out.println("finish----");
	}
}
