package gupao.edu.pattern.test.factory.simplefactory;

import gupao.edu.pattern.factory.service.IFileLoad;
import gupao.edu.pattern.factory.service.impl.CloudDisk;
import gupao.edu.pattern.factory.service.impl.FTPLoad;
import gupao.edu.pattern.factory.service.impl.NASLoad;
import gupao.edu.pattern.factory.simplefactory.FileLoadFactory;

/**
 * @ClassName:
 * @Description:
 * @Auther: zhouych
 * @Date: 2019/3/7 14:48
 */
public class FileLoadFactoryTest {

    public static void main(String[] args) {
        execute(FileLoadFactory.newInstance(FTPLoad.class));
        execute(FileLoadFactory.newInstance(NASLoad.class));
        execute(FileLoadFactory.newInstance(CloudDisk.class));
    }

    public static void execute(IFileLoad fileLoad){
        fileLoad.upload();
        fileLoad.download();
    }
}
