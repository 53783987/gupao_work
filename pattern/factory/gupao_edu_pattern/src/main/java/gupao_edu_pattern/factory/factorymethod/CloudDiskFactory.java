package gupao_edu_pattern.factory.factorymethod;

import gupao_edu_pattern.factory.service.impl.CloudDisk;
import gupao_edu_pattern.factory.service.IFileLoad;

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
