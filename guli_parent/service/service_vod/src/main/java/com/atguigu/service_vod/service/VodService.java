package com.atguigu.service_vod.service;

import com.atguigu.commonutils.R;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface VodService {
    //上传视频到阿里云
    String uploadVideoAly(MultipartFile file) ;
    //删除多个阿里云视频的方法
    void removeMoreAlyVideo(List videoIdList);
    R removeOneAlyVideo(String id);
}
