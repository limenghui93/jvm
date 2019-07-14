package com.lmh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiansheng on 2019/7/14.
 */
@RestController
public class JvmController {


	@RequestMapping("/jvm")
	public Object jvm(){
		List list = new ArrayList();
		for (int i = 0; i < 20000; i++) {
			list.add(i);
		}
		return list;
	}
}
