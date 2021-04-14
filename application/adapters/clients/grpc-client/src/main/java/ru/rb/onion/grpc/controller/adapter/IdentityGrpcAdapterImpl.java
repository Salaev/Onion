package ru.rb.onion.grpc.controller.adapter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.rb.onion.domain.api.IdentityAdapter;
import ru.rb.onion.domain.entity.Identity;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Slf4j
@Component("identity_rus")
public class IdentityGrpcAdapterImpl implements IdentityAdapter {

    @Override
    public Identity getId(String name) {
        log.debug("GetId grpc request: name - {}", name);
        var result = new Identity(ThreadLocalRandom.current().nextLong(1000,2000));
        log.debug("GetId grpc response: Identity - {}", result);
        return result;
    }
}
