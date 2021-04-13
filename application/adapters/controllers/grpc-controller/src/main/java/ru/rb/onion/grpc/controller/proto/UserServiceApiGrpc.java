package ru.rb.onion.grpc.controller.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: userService.proto")
public final class UserServiceApiGrpc {

  private UserServiceApiGrpc() {}

  public static final String SERVICE_NAME = "ru.rb.onion.grpc.controller.proto.UserServiceApi";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.rb.onion.grpc.controller.proto.SaveUserRequest,
      ru.rb.onion.grpc.controller.proto.SaveUserResponse> getSaveUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveUser",
      requestType = ru.rb.onion.grpc.controller.proto.SaveUserRequest.class,
      responseType = ru.rb.onion.grpc.controller.proto.SaveUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.rb.onion.grpc.controller.proto.SaveUserRequest,
      ru.rb.onion.grpc.controller.proto.SaveUserResponse> getSaveUserMethod() {
    io.grpc.MethodDescriptor<ru.rb.onion.grpc.controller.proto.SaveUserRequest, ru.rb.onion.grpc.controller.proto.SaveUserResponse> getSaveUserMethod;
    if ((getSaveUserMethod = UserServiceApiGrpc.getSaveUserMethod) == null) {
      synchronized (UserServiceApiGrpc.class) {
        if ((getSaveUserMethod = UserServiceApiGrpc.getSaveUserMethod) == null) {
          UserServiceApiGrpc.getSaveUserMethod = getSaveUserMethod = 
              io.grpc.MethodDescriptor.<ru.rb.onion.grpc.controller.proto.SaveUserRequest, ru.rb.onion.grpc.controller.proto.SaveUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ru.rb.onion.grpc.controller.proto.UserServiceApi", "saveUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.rb.onion.grpc.controller.proto.SaveUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.rb.onion.grpc.controller.proto.SaveUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceApiMethodDescriptorSupplier("saveUser"))
                  .build();
          }
        }
     }
     return getSaveUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.rb.onion.grpc.controller.proto.GetUserRequest,
      ru.rb.onion.grpc.controller.proto.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUser",
      requestType = ru.rb.onion.grpc.controller.proto.GetUserRequest.class,
      responseType = ru.rb.onion.grpc.controller.proto.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.rb.onion.grpc.controller.proto.GetUserRequest,
      ru.rb.onion.grpc.controller.proto.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<ru.rb.onion.grpc.controller.proto.GetUserRequest, ru.rb.onion.grpc.controller.proto.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = UserServiceApiGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceApiGrpc.class) {
        if ((getGetUserMethod = UserServiceApiGrpc.getGetUserMethod) == null) {
          UserServiceApiGrpc.getGetUserMethod = getGetUserMethod = 
              io.grpc.MethodDescriptor.<ru.rb.onion.grpc.controller.proto.GetUserRequest, ru.rb.onion.grpc.controller.proto.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ru.rb.onion.grpc.controller.proto.UserServiceApi", "getUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.rb.onion.grpc.controller.proto.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.rb.onion.grpc.controller.proto.GetUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceApiMethodDescriptorSupplier("getUser"))
                  .build();
          }
        }
     }
     return getGetUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceApiStub newStub(io.grpc.Channel channel) {
    return new UserServiceApiStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceApiBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceApiFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceApiImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveUser(ru.rb.onion.grpc.controller.proto.SaveUserRequest request,
        io.grpc.stub.StreamObserver<ru.rb.onion.grpc.controller.proto.SaveUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveUserMethod(), responseObserver);
    }

    /**
     */
    public void getUser(ru.rb.onion.grpc.controller.proto.GetUserRequest request,
        io.grpc.stub.StreamObserver<ru.rb.onion.grpc.controller.proto.GetUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.rb.onion.grpc.controller.proto.SaveUserRequest,
                ru.rb.onion.grpc.controller.proto.SaveUserResponse>(
                  this, METHODID_SAVE_USER)))
          .addMethod(
            getGetUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ru.rb.onion.grpc.controller.proto.GetUserRequest,
                ru.rb.onion.grpc.controller.proto.GetUserResponse>(
                  this, METHODID_GET_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceApiStub extends io.grpc.stub.AbstractStub<UserServiceApiStub> {
    private UserServiceApiStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceApiStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected UserServiceApiStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceApiStub(channel, callOptions);
    }

    /**
     */
    public void saveUser(ru.rb.onion.grpc.controller.proto.SaveUserRequest request,
        io.grpc.stub.StreamObserver<ru.rb.onion.grpc.controller.proto.SaveUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUser(ru.rb.onion.grpc.controller.proto.GetUserRequest request,
        io.grpc.stub.StreamObserver<ru.rb.onion.grpc.controller.proto.GetUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceApiBlockingStub extends io.grpc.stub.AbstractStub<UserServiceApiBlockingStub> {
    private UserServiceApiBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceApiBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected UserServiceApiBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceApiBlockingStub(channel, callOptions);
    }

    /**
     */
    public ru.rb.onion.grpc.controller.proto.SaveUserResponse saveUser(ru.rb.onion.grpc.controller.proto.SaveUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.rb.onion.grpc.controller.proto.GetUserResponse getUser(ru.rb.onion.grpc.controller.proto.GetUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceApiFutureStub extends io.grpc.stub.AbstractStub<UserServiceApiFutureStub> {
    private UserServiceApiFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceApiFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected UserServiceApiFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceApiFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.rb.onion.grpc.controller.proto.SaveUserResponse> saveUser(
        ru.rb.onion.grpc.controller.proto.SaveUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.rb.onion.grpc.controller.proto.GetUserResponse> getUser(
        ru.rb.onion.grpc.controller.proto.GetUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_USER = 0;
  private static final int METHODID_GET_USER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceApiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceApiImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_USER:
          serviceImpl.saveUser((ru.rb.onion.grpc.controller.proto.SaveUserRequest) request,
              (io.grpc.stub.StreamObserver<ru.rb.onion.grpc.controller.proto.SaveUserResponse>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((ru.rb.onion.grpc.controller.proto.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<ru.rb.onion.grpc.controller.proto.GetUserResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserServiceApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceApiBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.rb.onion.grpc.controller.proto.UserService.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserServiceApi");
    }
  }

  private static final class UserServiceApiFileDescriptorSupplier
      extends UserServiceApiBaseDescriptorSupplier {
    UserServiceApiFileDescriptorSupplier() {}
  }

  private static final class UserServiceApiMethodDescriptorSupplier
      extends UserServiceApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceApiMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceApiFileDescriptorSupplier())
              .addMethod(getSaveUserMethod())
              .addMethod(getGetUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
