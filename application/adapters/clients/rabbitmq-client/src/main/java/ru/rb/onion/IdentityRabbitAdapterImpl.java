package ru.rb.onion;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.rb.onion.domain.api.IdentityAdapter;
import ru.rb.onion.domain.entity.Identity;

import java.util.Random;

@Slf4j
@Component("identity_eng")
public class IdentityRabbitAdapterImpl implements IdentityAdapter {
    public final Random random;

    public IdentityRabbitAdapterImpl() {
        this.random = new Random();
    }

    @Override
    public Identity getId(String name) {
        log.debug("GetId rabbit request: name - {}", name);
        var result = new Identity(random.nextLong());
        log.debug("GetId rabbit response: Identity - {}", result);
        return result;
    }


}
