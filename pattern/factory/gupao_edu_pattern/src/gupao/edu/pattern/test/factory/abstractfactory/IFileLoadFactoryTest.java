package gupao.edu.pattern.test.factory.abstractfactory;

import gupao.edu.pattern.factory.abstractfactory.AliFileLoadFactory;
import gupao.edu.pattern.factory.abstractfactory.IFileLoadFactory;
import gupao.edu.pattern.factory.abstractfactory.TencentFileLoadFactory;
import gupao.edu.pattern.factory.service.IFileLoad;

/**
 * @ClassName:
 * @Description:
 * @Auther: zhouych
 * @Date: 2019/3/7 15:29
 */
public class IFileLoadFactoryTest {

    public static void main(String[] args) {
        execute(new AliFileLoadFactory());
        execute(new TencentFileLoadFactory());

    }

    public static void execute(IFileLoadFactory fileLoadFactory){
        fileLoadExecute(fileLoadFactory.createFTPLoad());
        fileLoadExecute(fileLoadFactory.createNASLoad());
        fileLoadExecute(fileLoadFactory.createCloundDiskLoad());

    }

    public static void fileLoadExecute(IFileLoad fileLoad){
        fileLoad.upload();
        fileLoad.download();
    }
}
