package gupao.edu.pattern.factory.factorymethod;

import gupao.edu.pattern.factory.service.IFileLoad;
import gupao.edu.pattern.factory.service.impl.CloudDisk;

/**
 * @ClassName: 云盘工厂
 * @Description:
 * @Auther: zhouych
 * @Date: 2019/3/7 14:56
 */
public class CloudDiskFactory implements IFileLoadFactory {

    @Override
    public IFileLoad newInstance() {
        return new CloudDisk();
    }
}
