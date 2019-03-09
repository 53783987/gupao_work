package gupao_edu_pattern.factory.factorymethod;

import gupao_edu_pattern.factory.service.impl.FTPLoad;
import gupao_edu_pattern.factory.service.IFileLoad;

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
