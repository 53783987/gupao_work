package gupao_edu_pattern.factory.service.impl.tencent;

import gupao_edu_pattern.factory.service.ICloundDiskLoad;

/**
 * @ClassName:
 * @Description:
 * @Auther: zhouych
 * @Date: 2019/3/7 15:23
 */
public class TencentCloundDiskLoad implements ICloundDiskLoad {
    @Override
    public void upload() {
        System.out.println("tencent colundDisk 文件上传成功");
    }

    @Override
    public void download() {
        System.out.println("tencent colundDisk 文件下载成功");
    }
}
