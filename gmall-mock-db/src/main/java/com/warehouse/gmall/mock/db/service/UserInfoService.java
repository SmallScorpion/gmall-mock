package com.warehouse.gmall.mock.db.service;

import com.warehouse.gmall.mock.db.bean.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 */
public interface UserInfoService extends IService<UserInfo> {

    public void  genUserInfos(Boolean ifClear);

}
