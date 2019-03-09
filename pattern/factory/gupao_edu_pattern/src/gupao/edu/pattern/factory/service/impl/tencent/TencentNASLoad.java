package gupao.edu.pattern.factory.service.impl.tencent;

import gupao.edu.pattern.factory.service.INASLoad;

/**
 * @ClassName:
 * @Description:
 * @Auther: zhouych
 * @Date: 2019/3/7 15:22
 */
public class TencentNASLoad implements INASLoad {
    @Override
    public void upload() {
        System.out.println("tencent NAS 文件上传成功");
    }

    @Override
    public void download() {
        System.out.println("tencent NAS 文件下载成功");
    }
}
