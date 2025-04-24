package com.ssafy.debug.model.dao;

import java.util.List;

import com.ssafy.debug.model.dto.FruitDto;

public interface FruitDao {
	// 과일을 등록한다.
	int insertFruit(FruitDto fruitDto);
	// 전체 과일 목록을 가져온다.
	List<FruitDto> selectFruitList();
	// 특정 과일을 가져온다.
	FruitDto selectFruitDetail(int fruitId);
	// 특정 과일을 삭제한다.
	int deleteFruit(int fruitId);
	// 특정 과일을 업데이트한다.
	int updateFruit(FruitDto fruitDto);
}
