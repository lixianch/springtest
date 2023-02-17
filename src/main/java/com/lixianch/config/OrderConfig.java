package com.lixianch.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * created by lixianch on 2023/2/15
 */
@Configuration
@Import(TradeConfig.class)
@PropertySource(value = "config1.properties", ignoreResourceNotFound = true)
public class OrderConfig {
}
