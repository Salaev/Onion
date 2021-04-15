package ru.rb.onion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.rb.onion.domain.api.IdentityAdapter;
import ru.rb.onion.domain.api.UserRepositoryAdapter;
import ru.rb.onion.domain.entity.User;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserRusCaseTest {
    @Mock
    private UserRepositoryAdapter adapter;
    @Mock
    private IdentityAdapter identityAdapter;

    @Test
    void getUser() {
        Mockito.when(adapter.get("123")).thenReturn(null);
        UserCase userCase = new UserRusCase(adapter, identityAdapter);
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                userCase.getUser("123"));
    }
}