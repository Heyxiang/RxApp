package com.gzfgeh.nbapp.Model;

import com.gzfgeh.nbapp.Common.HostType;

/**
 * Description:
 * Created by guzhenfu on 2016/11/2 19:47.
 */

public class BaseModel {
    protected RetrofitService service;

    public BaseModel() {
        this.service = RetrofitManager.getInstance(HostType.JU_HE_NEWS).getRetrofitService();
    }
}
