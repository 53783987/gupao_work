package gupao.edu.pattern.factory.simplefactory;

import gupao.edu.pattern.factory.service.IFileLoad;

/**
 * @ClassName:
 * @Description:
 * @Auther: zhouych
 * @Date: 2019/3/7 14:45
 */
public class FileLoadFactory {

    public static IFileLoad newInstance(Class<? extends IFileLoad> clazz){

        try {
            if(clazz != null){
                return clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
