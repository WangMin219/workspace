package com.wh.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wh.bean.Emm_position;
import com.wh.dao.Emm_positionMapper;
import com.wh.service.Emm_positionService;

@Service
public class Emm_positionServiceImp implements Emm_positionService {

	@Autowired
	private Emm_positionMapper emm_positionMapper;

	@Override
	public List<Emm_position> getAllPosition() {
		return emm_positionMapper.getAllPosition();
	}

	@Override
	public Emm_position getPositionByID(int positionId) {
		return emm_positionMapper.selectByPrimaryKey(positionId);
	}

	@Override
	public void emm_position_update(Emm_position emm_position) {
		emm_positionMapper.updateByPrimaryKey(emm_position);
	}
	
	
}
