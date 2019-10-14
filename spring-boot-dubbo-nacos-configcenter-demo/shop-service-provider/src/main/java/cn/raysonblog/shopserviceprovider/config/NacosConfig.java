package cn.raysonblog.shopserviceprovider.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * ��Nacos�ⲿ��ȡ����, �޸����ã��Զ���ˢ��Ӧ�õ�����
 *
 * @author raysonfang
 */
@NacosPropertySource(dataId = "rayson", autoRefreshed = true)
@Data
@Component
public class NacosConfig {

    @NacosValue(value = "${service.name:1}", autoRefreshed = true)
    private String serviceName;
}
