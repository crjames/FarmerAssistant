package com.farmerassistant.mapper;

import com.farmerassistant.model.Farmer;
import org.springframework.stereotype.Component;

@Component(value = "farmerMapper")
public interface FarmerMapper {
    int deleteByPrimaryKey(Long farmerId);

    int insert(Farmer record);

    int insertSelective(Farmer record);

    Farmer selectByPrimaryKey(Long farmerId);

    int updateByPrimaryKeySelective(Farmer record);

    int updateByPrimaryKey(Farmer record);
}