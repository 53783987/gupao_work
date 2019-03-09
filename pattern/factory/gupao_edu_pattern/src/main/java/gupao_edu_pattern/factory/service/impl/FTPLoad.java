package gupao_edu_pattern.factory.service.impl;

import gupao_edu_pattern.factory.service.IFileLoad;

/**
 * @ClassName: ftp上传下载
 * @Description:
 * @Auther: zhouych
 * @Date: 2019/3/7 14:39
 */
public class FTPLoad implements IFileLoad {

    @Override
    public void upload() {
        System.out.println("ftp 上传成功");
    }

    @Override
    public void download() {
        System.out.println("ftp 下载成功");
    }
}
