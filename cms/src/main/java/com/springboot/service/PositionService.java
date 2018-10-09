package com.springboot.service;

import com.springboot.dao.PositionMapper;
import com.springboot.dataobject.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/10/1 0001.
 */

@Service
public class PositionService {
    @Autowired
    private PositionMapper positionMapper;

    public List<Position> selectAllPosition() {
        return positionMapper.getAllPosition();
    }

    public Boolean isExistPosition(String positionName) {
        boolean flag = false;
        Position position = positionMapper.isExistPostion(positionName);
        if (position != null) {
            flag = true;
        }
        return flag;
    }

    @Transactional
    public Boolean insertPosition(Position position) {
        Integer result = positionMapper.insertPosition(position);
        boolean flag = false;
        if (result != 0) {
            flag = true;
        }
        return flag;
    }

    public Position selectPositionByName(String positionName) {
        return positionMapper.searchPosition(positionName);
    }

    public Position selectPositionByNameAndLevel(Position position) {
        return positionMapper.selectPositionByNameAndLevel(position);
    }

    @Transactional
    public Boolean updatePosition(Position position) {
        boolean flag = false;
        Integer result = positionMapper.updatePosition(position);
        if (result != 0) {
            flag = true;
        }
        return flag;
    }

    @Transactional
    public boolean deletPosition(Integer id) {
        boolean flag = false;
        Integer result = positionMapper.deletePositionById(id);
        if (result == 1) {
            flag = true;
        }
        return flag;
    }
}
