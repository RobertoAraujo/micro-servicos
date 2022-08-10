package com.poshyweb.folhadepagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@RibbonClient(name = "worker", configuration = FolhaDePagamentoApplication.class)
@EnableFeignClients
@SpringBootApplication
public class FolhaDePagamentoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FolhaDePagamentoApplication.class, args);
    }

}
