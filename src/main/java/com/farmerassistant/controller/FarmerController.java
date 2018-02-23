package com.farmerassistant.controller;

import com.farmerassistant.model.Farmer;
import com.farmerassistant.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wang.donga on 2018/2/23.
 */
@Controller
@RequestMapping(value = "/farmer")
public class FarmerController {
    @Autowired
    private FarmerService farmerService;

    @RequestMapping(value = "/register",produces = {"application/json;charset=UTF-8"})
    public boolean farmerRegister(Farmer farmer){
        int addResult = farmerService.addFarmer(farmer);
        return addResult==1?true:false;
    }
}
