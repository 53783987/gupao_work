package gupao_edu_pattern.factory.service.impl.tencent;

import gupao_edu_pattern.factory.service.IFTPLoad;

/**
 * @ClassName:
 * @Description:
 * @Auther: zhouych
 * @Date: 2019/3/7 15:20
 */
public class TencentFTPLoad implements IFTPLoad {
    @Override
    public void upload() {
        System.out.println("tencent FTP 文件上传成功");
    }

    @Override
    public void download() {
        System.out.println("tencent FTP 文件下载成功");
    }
}
