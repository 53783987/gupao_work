package gupao.edu.pattern.factory.service.impl;

import gupao.edu.pattern.factory.service.IFileLoad;

/**
 * @ClassName:   NAS上传下载
 * @Description:
 * @Auther: zhouych
 * @Date: 2019/3/7 14:40
 */
public class NASLoad implements IFileLoad {

    @Override
    public void upload() {
        System.out.println("NAS 上传成功");
    }

    @Override
    public void download() {
        System.out.println("NAS 下载成功");
    }
}
