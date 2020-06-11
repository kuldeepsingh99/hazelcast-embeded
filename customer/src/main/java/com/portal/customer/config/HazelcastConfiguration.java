package com.portal.customer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

@Configuration
public class HazelcastConfiguration {

	@Bean
	public HazelcastInstance hazelCastInstance() {
		Config config = new Config();
		 config.getNetworkConfig().getJoin().getTcpIpConfig().setEnabled(false);
		 config.getNetworkConfig().getJoin().getMulticastConfig().setEnabled(false);
		 config.getNetworkConfig().getJoin().getKubernetesConfig().setEnabled(true);
		return Hazelcast.newHazelcastInstance();
	}
}
