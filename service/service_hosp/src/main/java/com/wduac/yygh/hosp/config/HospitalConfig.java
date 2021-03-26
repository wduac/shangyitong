package com.wduac.yygh.hosp.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wduac
 * @date 2021/3/25 - 21:13
 */

@Configuration
@MapperScan("com.wduac.yygh.hosp.mapper")
public class HospitalConfig {
}
