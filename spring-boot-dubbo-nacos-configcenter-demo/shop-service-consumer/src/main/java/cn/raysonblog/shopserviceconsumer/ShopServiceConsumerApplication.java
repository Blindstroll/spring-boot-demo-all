package cn.raysonblog.shopserviceconsumer;

import cn.raysonblog.shopserviceprovider.service.RpcShopService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * �������controllerд��һ�𣬷���򵥲�����ʾ��
 *
 * @author raysonfang
 */
@SpringBootApplication
@RestController
public class ShopServiceConsumerApplication {
    @Reference
    RpcShopService shopService;

    /**
     * ע��ԭ�� ����Ӧ����ڣ�ֻ������һ��RequestMapping ����ᱨ��
     */
  /*  @RequestMapping(name = "/sayHello", method = RequestMethod.GET)
    public String sayHello(){
        return shopService.sayHello("Hello Dubbo Nacos!����ԭ������������������ע��Java�����ɻ���ID:raysonfang��");
    }*/

    /**
     * Nacos config�������� ��ȡ������Ϣ ���Խӿ�
     * @return
     */
    @RequestMapping(name = "/getConfig", method = RequestMethod.GET)
    public String getConfig(){
        return shopService.getConfigServiceName("����ԭ������������������ע��Java�����ɻ���ID:raysonfang��");
    }

    public static void main(String[] args) {
        SpringApplication.run(ShopServiceConsumerApplication.class, args);
    }

}
