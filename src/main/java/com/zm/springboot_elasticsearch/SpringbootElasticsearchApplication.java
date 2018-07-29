package com.zm.springboot_elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot默认是使用两种技术来和ES交互
 * 1、Jest(默认不生效  需要导入Jest的包)
 * 2、SprigData ElasticSearch
 *      1、使用Client  需要指定cluster 的nodes
 *      2、elasticsearchTemplate 来操作es
 *      3、自己写一个类 实现ElasticsearchRepository接口
 *
 */
@SpringBootApplication
public class SpringbootElasticsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootElasticsearchApplication.class, args);
    }
}
