package ru.rb.onion;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.rb.onion.domain.api.IdentityAdapter;
import ru.rb.onion.domain.entity.Identity;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Slf4j
@Component("identity_eng")
public class IdentityRabbitAdapterImpl implements IdentityAdapter {

    @Override
    public Identity getId(String name) {
        log.debug("GetId rabbit request: name - {}", name);
        var result = new Identity(ThreadLocalRandom.current().nextLong(10,100));
        log.debug("GetId rabbit response: Identity - {}", result);
        return result;
    }


}
