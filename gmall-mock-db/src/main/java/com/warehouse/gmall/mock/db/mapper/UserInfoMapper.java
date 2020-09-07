package com.warehouse.gmall.mock.db.mapper;

import com.warehouse.gmall.mock.db.bean.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 */
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    @Update("truncate table user_info")
    public  void truncateUserInfo();

}
