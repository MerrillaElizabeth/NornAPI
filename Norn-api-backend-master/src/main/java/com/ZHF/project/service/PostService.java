package com.ZHF.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ZHF.project.model.entity.Post;

/**
 * 帖子服务
 *
 * @author ZHF
 *  
 */
public interface PostService extends IService<Post> {

    /**
     * 校验
     *
     * @param post
     * @param add 是否为创建校验
     */
    void validPost(Post post, boolean add);
}
