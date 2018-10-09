package com.wh.service;

import java.util.List;

import com.wh.bean.Menu;

public interface JurisdictionService {
	List<Menu> getJurisdiction_Pare(int id);

	List<Menu> getJurisdiction_Son(int id);
}
