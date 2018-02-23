package com.farmerassistant.serviceimpl;

import com.farmerassistant.mapper.FarmerMapper;
import com.farmerassistant.model.Farmer;
import com.farmerassistant.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wang.donga on 2018/2/23.
 */
@Service(value = "farmerService")
public class FarmerServiceImpl implements FarmerService {
    @Autowired
    private FarmerMapper farmerMapper;
    @Override
    public int addFarmer(Farmer farmer) {
        return farmerMapper.insert(farmer);
    }
}
