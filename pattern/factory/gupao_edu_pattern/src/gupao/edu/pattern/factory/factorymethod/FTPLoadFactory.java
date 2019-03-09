package gupao.edu.pattern.factory.factorymethod;

import gupao.edu.pattern.factory.service.IFileLoad;
import gupao.edu.pattern.factory.service.impl.FTPLoad;

/**
 * @ClassName: ftp工厂
 * @Description:
 * @Auther: zhouych
 * @Date: 2019/3/7 14:55
 */
public class FTPLoadFactory implements IFileLoadFactory {

    @Override
    public IFileLoad newInstance() {
        return new FTPLoad();
    }
}
