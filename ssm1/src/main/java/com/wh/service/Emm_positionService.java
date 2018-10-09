package com.wh.service;

import java.util.List;

import com.wh.bean.Emm_position;

public interface Emm_positionService {

	List<Emm_position> getAllPosition();

	Emm_position getPositionByID(int positionId);

	void emm_position_update(Emm_position emm_position);

}
