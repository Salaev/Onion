package ru.rb.onion.grpc.controller;

import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import ru.rb.onion.UserRusCase;
import ru.rb.onion.domain.entity.User;
import ru.rb.onion.grpc.controller.mappers.SaveUserMapper;
import ru.rb.onion.grpc.controller.proto.*;

@Slf4j
@GrpcService
public class UserController extends UserServiceApiGrpc.UserServiceApiImplBase {
    private final UserRusCase userCase;
    private final SaveUserMapper saveUserMapper;


    public UserController(UserRusCase userCase, SaveUserMapper saveUserMapper) {
        this.userCase = userCase;
        this.saveUserMapper = saveUserMapper;
    }

    @Override
    public void saveUser(SaveUserRequest request, StreamObserver<SaveUserResponse> responseObserver) {
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

    @Override
    public void getUser(GetUserRequest request, StreamObserver<GetUserResponse> responseObserver) {
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
