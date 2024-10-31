package top.crushtj;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import top.crushtj.dao.UserDao;
import top.crushtj.service.UserService;

public class BeanFactoryTest {
    public static void main(String[] args) {
        // 创建一个新的 bean 工厂
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 为给定的 bean 工厂创建一个新的 XML bean 定义读取器
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

        // 从指定的 XML 文件加载 bean 定义
        reader.loadBeanDefinitions("beans.xml");

        // 获取名为 "userService" 的 bean 并将其转换为 UserService 类型
        UserService userService = (UserService) beanFactory.getBean("userService");

        //获取名为userDao的bean并将其转换为UserDao类型
        UserDao userDao = (UserDao) beanFactory.getBean("userDao");

        // 将 userService bean 打印到控制台
        System.out.println("UserService Bean: " + userService);

        //将userDao bean打印到控制台
        System.out.println("UserDao Bean: " + userDao);
    }
}