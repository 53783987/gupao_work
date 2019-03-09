package gupao.edu.pattern.test.factory.factorymethod;

import gupao.edu.pattern.factory.factorymethod.CloudDiskFactory;
import gupao.edu.pattern.factory.factorymethod.FTPLoadFactory;
import gupao.edu.pattern.factory.factorymethod.IFileLoadFactory;
import gupao.edu.pattern.factory.factorymethod.NASLoadFactory;
import gupao.edu.pattern.factory.service.IFileLoad;

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
