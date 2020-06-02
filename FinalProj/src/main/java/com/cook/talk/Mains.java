package com.cook.talk;

import com.cook.talk.model.service.MainService;
import com.cook.talk.model.serviceImpl.MainServiceImpl;

public class Mains {

	public static void main(String[] args) {
		MainService main=new MainServiceImpl();
		main.recipe();
	}

}
