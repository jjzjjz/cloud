package cn.mldn.actuator;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class MicroCloudGatewayInfo implements InfoContributor {
	@Override
	public void contribute(Builder builder) {
		builder.withDetail("company.name", "mldn");
		builder.withDetail("service.name", "gateway");
		builder.withDetail("version", "1.0"); 
		builder.withDetail("author", "mldn-young");
	}
}
