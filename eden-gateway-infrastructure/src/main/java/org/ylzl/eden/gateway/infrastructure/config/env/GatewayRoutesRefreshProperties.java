package org.ylzl.eden.gateway.infrastructure.config.env;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 网关路由刷新配置
 *
 * @author gyl
 * @since 2.4.x
 */
@Data
@ConfigurationProperties(prefix = "spring.cloud.gateway.refresh-routes")
public class GatewayRoutesRefreshProperties {

	private final NacosConfig nacosConfig = new NacosConfig();

	@Data
	public static class NacosConfig {
		private String dataId;
	}
}
