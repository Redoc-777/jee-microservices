package com.kalmounabderrahmane.billing;

import lombok.AllArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
@RefreshScope
public class ConsulRestClientConfig {
    private ConsulConfig consulConfig;
    private VaultConfig vaultConfig;

    @GetMapping("/config")
    public Map<String,Object> myconfig() {

        return Map.of("Concul", consulConfig,"vault",vaultConfig);
    }
}
