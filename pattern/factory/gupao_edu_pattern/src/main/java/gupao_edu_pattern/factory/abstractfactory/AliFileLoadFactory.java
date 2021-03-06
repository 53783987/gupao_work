package gupao_edu_pattern.factory.abstractfactory;

import gupao_edu_pattern.factory.service.ICloundDiskLoad;
import gupao_edu_pattern.factory.service.IFTPLoad;
import gupao_edu_pattern.factory.service.INASLoad;
import gupao_edu_pattern.factory.service.impl.ali.AliCloundDiskLoad;
import gupao_edu_pattern.factory.service.impl.ali.AliFTPLoad;
import gupao_edu_pattern.factory.service.impl.ali.AliNASLoad;

/**
 * @ClassName:
 * @Description:
 * @Auther: zhouych
 * @Date: 2019/3/7 15:26
 */
public class AliFileLoadFactory implements IFileLoadFactory {
    @Override
    public IFTPLoad createFTPLoad() {
        return new AliFTPLoad();
    }

    @Override
    public INASLoad createNASLoad() {
        return new AliNASLoad();
    }

    @Override
    public ICloundDiskLoad createCloundDiskLoad() {
        return new AliCloundDiskLoad();
    }
}
