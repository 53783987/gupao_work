package gupao.edu.pattern.factory.factorymethod;

import gupao.edu.pattern.factory.service.IFileLoad;

/**
 * @ClassName:  文件上传下载工厂
 * @Description:
 * @Auther: zhouych
 * @Date: 2019/3/7 14:52
 */
public interface IFileLoadFactory {

    IFileLoad newInstance();
}
