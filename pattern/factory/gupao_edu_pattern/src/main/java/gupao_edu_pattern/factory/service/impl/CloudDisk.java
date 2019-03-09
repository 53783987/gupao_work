package gupao_edu_pattern.factory.service.impl;

import gupao_edu_pattern.factory.service.IFileLoad;

/**
 * @ClassName:   云盘上传下载
 * @Description:
 * @Auther: zhouych
 * @Date: 2019/3/7 14:42
 */
public class CloudDisk implements IFileLoad {

    @Override
    public void upload() {
        System.out.println("CloudDisk 上传成功");
    }

    @Override
    public void download() {
        System.out.println("CloudDisk 下载成功");
    }
}
