package gupao.edu.pattern.factory.abstractfactory;


import gupao.edu.pattern.factory.service.ICloundDiskLoad;
import gupao.edu.pattern.factory.service.IFTPLoad;
import gupao.edu.pattern.factory.service.INASLoad;
import gupao.edu.pattern.factory.service.impl.ali.AliCloundDiskLoad;
import gupao.edu.pattern.factory.service.impl.ali.AliFTPLoad;
import gupao.edu.pattern.factory.service.impl.ali.AliNASLoad;

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
