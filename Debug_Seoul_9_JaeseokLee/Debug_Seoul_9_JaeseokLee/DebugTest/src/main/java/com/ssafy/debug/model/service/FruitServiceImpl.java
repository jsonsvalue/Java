package com.ssafy.debug.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.debug.model.dao.FruitDao;
import com.ssafy.debug.model.dto.FruitDto;

@Service
public class FruitServiceImpl implements FruitService {
	
	@Autowired
    private FruitDao fruitDao;
	
	// 특정 과일을 등록한다.
    @Override
    public int registFruit(FruitDto fruitDto) {
        fruitDao.insertFruit(fruitDto);
        return 1;
    }
    
    // 전체 과일 목록을 가져온다.
    @Override
    public List<FruitDto> getFruitList() {
        return fruitDao.selectFruitList();
    }
    
    // 특정 과일의 상세 데이터를 가져온다.
    @Override
    public FruitDto getFruitDetail(int fruitId) {
        return fruitDao.selectFruitDetail(fruitId);
    }
    
    // 특정 과일 정보를 삭제한다.
    @Override
    public int deleteFruit(int fruitId) {
        return fruitDao.deleteFruit(fruitId);
    }
    
    // 특정 과일 정보를 업데이트한다.
    @Override
    public int updateFruit(FruitDto fruitDto) {
        return fruitDao.updateFruit(fruitDto);
    }
}
