package ru.rb.onion.grpc.controller.adapter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.rb.onion.domain.api.IdentityAdapter;
import ru.rb.onion.domain.entity.Identity;

import java.util.Random;

@Slf4j
@Component("identity_rus")
public class IdentityGrpcAdapterImpl implements IdentityAdapter {
    public final Random random;

    public IdentityGrpcAdapterImpl() {
        this.random = new Random();
    }

    @Override
    public Identity getId(String name) {
        log.debug("GetId grpc request: name - {}", name);
        var result = new Identity(random.nextLong());
        log.debug("GetId grpc response: Identity - {}", result);
        return result;
    }
}
