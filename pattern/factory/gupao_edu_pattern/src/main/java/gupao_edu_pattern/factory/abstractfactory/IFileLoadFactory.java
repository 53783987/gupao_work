package gupao_edu_pattern.factory.abstractfactory;

import gupao_edu_pattern.factory.service.ICloundDiskLoad;
import gupao_edu_pattern.factory.service.IFTPLoad;
import gupao_edu_pattern.factory.service.INASLoad;

/**
 * @ClassName:
 * @Description:
 * @Auther: zhouych
 * @Date: 2019/3/7 15:13
 */
public interface IFileLoadFactory {

    IFTPLoad createFTPLoad();

    INASLoad createNASLoad();

    ICloundDiskLoad createCloundDiskLoad();
}
