package com.warehouse.gmall.mock.db.service;

import com.warehouse.gmall.mock.db.bean.CommentInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品评论表 服务类
 * </p>
 *
 */
public interface CommentInfoService extends IService<CommentInfo> {

    public  void genComments(Boolean ifClear);

}
