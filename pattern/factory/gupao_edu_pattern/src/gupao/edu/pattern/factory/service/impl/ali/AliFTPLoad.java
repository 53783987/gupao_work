package gupao.edu.pattern.factory.service.impl.ali;

import gupao.edu.pattern.factory.service.IFTPLoad;

/**
 * @ClassName:
 * @Description:
 * @Auther: zhouych
 * @Date: 2019/3/7 15:20
 */
public class AliFTPLoad implements IFTPLoad {
    @Override
    public void upload() {
        System.out.println("Ali FTP 文件上传成功");
    }

    @Override
    public void download() {
        System.out.println("Ali FTP 文件下载成功");
    }
}
