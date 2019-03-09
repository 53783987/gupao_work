package gupao.edu.pattern.factory.abstractfactory;


import gupao.edu.pattern.factory.service.ICloundDiskLoad;
import gupao.edu.pattern.factory.service.IFTPLoad;
import gupao.edu.pattern.factory.service.INASLoad;

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
