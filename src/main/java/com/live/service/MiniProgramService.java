package com.live.service;

import com.alibaba.fastjson.JSONObject;

public interface MiniProgramService {

    JSONObject getUserInfo(String code);

    JSONObject notPowerOpenid(String code);
}
