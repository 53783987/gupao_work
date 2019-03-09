package gupao_edu_pattern.factory.factorymethod;

import gupao_edu_pattern.factory.service.IFileLoad;
import gupao_edu_pattern.factory.service.impl.CloudDisk;
import gupao_edu_pattern.factory.service.impl.FTPLoad;
import gupao_edu_pattern.factory.service.impl.NASLoad;
import gupao_edu_pattern.factory.simplefactory.FileLoadFactory;

/**
 * @ClassName:
 * @Description:
 * @Auther: zhouych
 * @Date: 2019/3/7 14:58
 */
public class IFileLoadFactoryTest {

    public static void main(String[] args) {
        execute(new FTPLoadFactory());
        execute(new NASLoadFactory());
        execute(new CloudDiskFactory());
    }

    public static void execute(IFileLoadFactory fileLoadFactory){
        IFileLoad fileLoad = fileLoadFactory.newInstance();
        fileLoad.upload();
        fileLoad.download();
    }
}
