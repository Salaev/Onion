package ru.rb.onion.grpc.controller;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Qualifier;
import ru.rb.onion.UserCase;
import ru.rb.onion.UserRusCase;
import ru.rb.onion.domain.entity.User;
import ru.rb.onion.grpc.controller.mappers.SaveUserMapper;
import ru.rb.onion.grpc.controller.proto.*;

@Slf4j
@GrpcService
public class UserController extends UserServiceApiGrpc.UserServiceApiImplBase {
    private final  UserCase userRusCase;
    private final UserCase userEngCase;
    private final SaveUserMapper saveUserMapper;

    public UserController(@Qualifier("user-rus-case")UserCase userRusCase, @Qualifier("user-eng-case") UserCase userEngCase, SaveUserMapper saveUserMapper) {
        this.userRusCase = userRusCase;
        this.userEngCase = userEngCase;
        this.saveUserMapper = saveUserMapper;
    }

    @Override
    public void saveRusUser(SaveUserRequest request, StreamObserver<SaveUserResponse> responseObserver) {
        saveUser(request, responseObserver, userRusCase);
    }

    @Override
    public void getRusUser(GetUserRequest request, StreamObserver<GetUserResponse> responseObserver) {
        getUser(request, responseObserver, userRusCase);
    }

    @Override
    public void saveEngUser(SaveUserRequest request, StreamObserver<SaveUserResponse> responseObserver) {
        saveUser(request, responseObserver, userEngCase);
    }

    @Override
    public void getEngUser(GetUserRequest request, StreamObserver<GetUserResponse> responseObserver) {
        getUser(request, responseObserver, userEngCase);
    }

    private void saveUser(SaveUserRequest request, StreamObserver<SaveUserResponse> responseObserver, UserCase userCase) {
        try {
            log.debug("saveUser request: name - {}", request.getName());
            final int idUser = userCase.saveUser(saveUserMapper.toDomain(request));
            responseObserver.onNext(SaveUserResponse.newBuilder()
                    .setId(idUser)
                    .build());
            responseObserver.onCompleted();
            log.debug("saveUser successful: id - {}", idUser);
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }

    private void getUser(GetUserRequest request, StreamObserver<GetUserResponse> responseObserver, UserCase userCase) {
        try {
            log.debug("getUser request: name - {}", request.getName());
            final User user = userCase.getUser(request.getName());
            responseObserver.onNext(GetUserResponse.newBuilder()
                    .setName(user.getName())
                    .setAge(user.getAge())
                    .setIdentity(user.getId().getId())
                    .build());
            responseObserver.onCompleted();
            log.debug("getUser response: user - {}", user);
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }
}
