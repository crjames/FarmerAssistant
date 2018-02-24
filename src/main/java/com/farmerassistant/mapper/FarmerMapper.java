package main.java.com.farmerassistant.mapper;

import main.java.com.farmerassistant.model.Farmer;

public interface FarmerMapper {
    int deleteByPrimaryKey(Long farmerId);

    int insert(Farmer record);

    int insertSelective(Farmer record);

    Farmer selectByPrimaryKey(Long farmerId);

    int updateByPrimaryKeySelective(Farmer record);

    int updateByPrimaryKey(Farmer record);
}