package com.lixianch.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * created by lixianch on 2023/2/15
 */
@Configuration
@Import(TradeConfig.class)
public class OrderConfig {
}
