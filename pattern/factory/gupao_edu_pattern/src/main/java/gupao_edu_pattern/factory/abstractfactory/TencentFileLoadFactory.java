package gupao_edu_pattern.factory.abstractfactory;

import gupao_edu_pattern.factory.service.ICloundDiskLoad;
import gupao_edu_pattern.factory.service.IFTPLoad;
import gupao_edu_pattern.factory.service.INASLoad;
import gupao_edu_pattern.factory.service.impl.tencent.TencentCloundDiskLoad;
import gupao_edu_pattern.factory.service.impl.tencent.TencentFTPLoad;
import gupao_edu_pattern.factory.service.impl.tencent.TencentNASLoad;

/**
 * @ClassName:
 * @Description:
 * @Auther: zhouych
 * @Date: 2019/3/7 15:26
 */
public class TencentFileLoadFactory implements IFileLoadFactory {
    @Override
    public IFTPLoad createFTPLoad() {
        return new TencentFTPLoad();
    }

    @Override
    public INASLoad createNASLoad() {
        return new TencentNASLoad();
    }

    @Override
    public ICloundDiskLoad createCloundDiskLoad() {
        return new TencentCloundDiskLoad();
    }
}
