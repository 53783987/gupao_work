package gupao_edu_pattern.factory.service.impl.ali;

import gupao_edu_pattern.factory.service.INASLoad;

/**
 * @ClassName:
 * @Description:
 * @Auther: zhouych
 * @Date: 2019/3/7 15:22
 */
public class AliNASLoad implements INASLoad {
    @Override
    public void upload() {
        System.out.println("Ali NAS 文件上传成功");
    }

    @Override
    public void download() {
        System.out.println("Ali NAS 文件下载成功");
    }
}
