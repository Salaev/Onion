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
  private static volatile io.grpc.MethodDescriptor<SaveUserRequest,
      SaveUserResponse> getSaveRusUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveRusUser",
      requestType = SaveUserRequest.class,
      responseType = SaveUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SaveUserRequest,
      SaveUserResponse> getSaveRusUserMethod() {
    io.grpc.MethodDescriptor<SaveUserRequest, SaveUserResponse> getSaveRusUserMethod;
    if ((getSaveRusUserMethod = UserServiceApiGrpc.getSaveRusUserMethod) == null) {
      synchronized (UserServiceApiGrpc.class) {
        if ((getSaveRusUserMethod = UserServiceApiGrpc.getSaveRusUserMethod) == null) {
          UserServiceApiGrpc.getSaveRusUserMethod = getSaveRusUserMethod = 
              io.grpc.MethodDescriptor.<SaveUserRequest, SaveUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ru.rb.onion.grpc.controller.proto.UserServiceApi", "saveRusUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SaveUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SaveUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceApiMethodDescriptorSupplier("saveRusUser"))
                  .build();
          }
        }
     }
     return getSaveRusUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetUserRequest,
      GetUserResponse> getGetRusUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRusUser",
      requestType = GetUserRequest.class,
      responseType = GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetUserRequest,
      GetUserResponse> getGetRusUserMethod() {
    io.grpc.MethodDescriptor<GetUserRequest, GetUserResponse> getGetRusUserMethod;
    if ((getGetRusUserMethod = UserServiceApiGrpc.getGetRusUserMethod) == null) {
      synchronized (UserServiceApiGrpc.class) {
        if ((getGetRusUserMethod = UserServiceApiGrpc.getGetRusUserMethod) == null) {
          UserServiceApiGrpc.getGetRusUserMethod = getGetRusUserMethod = 
              io.grpc.MethodDescriptor.<GetUserRequest, GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ru.rb.onion.grpc.controller.proto.UserServiceApi", "getRusUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceApiMethodDescriptorSupplier("getRusUser"))
                  .build();
          }
        }
     }
     return getGetRusUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SaveUserRequest,
      SaveUserResponse> getSaveEngUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveEngUser",
      requestType = SaveUserRequest.class,
      responseType = SaveUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SaveUserRequest,
      SaveUserResponse> getSaveEngUserMethod() {
    io.grpc.MethodDescriptor<SaveUserRequest, SaveUserResponse> getSaveEngUserMethod;
    if ((getSaveEngUserMethod = UserServiceApiGrpc.getSaveEngUserMethod) == null) {
      synchronized (UserServiceApiGrpc.class) {
        if ((getSaveEngUserMethod = UserServiceApiGrpc.getSaveEngUserMethod) == null) {
          UserServiceApiGrpc.getSaveEngUserMethod = getSaveEngUserMethod = 
              io.grpc.MethodDescriptor.<SaveUserRequest, SaveUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ru.rb.onion.grpc.controller.proto.UserServiceApi", "saveEngUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SaveUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SaveUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceApiMethodDescriptorSupplier("saveEngUser"))
                  .build();
          }
        }
     }
     return getSaveEngUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetUserRequest,
      GetUserResponse> getGetEngUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEngUser",
      requestType = GetUserRequest.class,
      responseType = GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetUserRequest,
      GetUserResponse> getGetEngUserMethod() {
    io.grpc.MethodDescriptor<GetUserRequest, GetUserResponse> getGetEngUserMethod;
    if ((getGetEngUserMethod = UserServiceApiGrpc.getGetEngUserMethod) == null) {
      synchronized (UserServiceApiGrpc.class) {
        if ((getGetEngUserMethod = UserServiceApiGrpc.getGetEngUserMethod) == null) {
          UserServiceApiGrpc.getGetEngUserMethod = getGetEngUserMethod = 
              io.grpc.MethodDescriptor.<GetUserRequest, GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ru.rb.onion.grpc.controller.proto.UserServiceApi", "getEngUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceApiMethodDescriptorSupplier("getEngUser"))
                  .build();
          }
        }
     }
     return getGetEngUserMethod;
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
    public void saveRusUser(SaveUserRequest request,
                            io.grpc.stub.StreamObserver<SaveUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveRusUserMethod(), responseObserver);
    }

    /**
     */
    public void getRusUser(GetUserRequest request,
                           io.grpc.stub.StreamObserver<GetUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRusUserMethod(), responseObserver);
    }

    /**
     */
    public void saveEngUser(SaveUserRequest request,
                            io.grpc.stub.StreamObserver<SaveUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveEngUserMethod(), responseObserver);
    }

    /**
     */
    public void getEngUser(GetUserRequest request,
                           io.grpc.stub.StreamObserver<GetUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEngUserMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveRusUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                SaveUserRequest,
                SaveUserResponse>(
                  this, METHODID_SAVE_RUS_USER)))
          .addMethod(
            getGetRusUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GetUserRequest,
                GetUserResponse>(
                  this, METHODID_GET_RUS_USER)))
          .addMethod(
            getSaveEngUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                SaveUserRequest,
                SaveUserResponse>(
                  this, METHODID_SAVE_ENG_USER)))
          .addMethod(
            getGetEngUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GetUserRequest,
                GetUserResponse>(
                  this, METHODID_GET_ENG_USER)))
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
    public void saveRusUser(SaveUserRequest request,
                            io.grpc.stub.StreamObserver<SaveUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveRusUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRusUser(GetUserRequest request,
                           io.grpc.stub.StreamObserver<GetUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRusUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveEngUser(SaveUserRequest request,
                            io.grpc.stub.StreamObserver<SaveUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveEngUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEngUser(GetUserRequest request,
                           io.grpc.stub.StreamObserver<GetUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEngUserMethod(), getCallOptions()), request, responseObserver);
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
    public SaveUserResponse saveRusUser(SaveUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveRusUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public GetUserResponse getRusUser(GetUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRusUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public SaveUserResponse saveEngUser(SaveUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveEngUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public GetUserResponse getEngUser(GetUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEngUserMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<SaveUserResponse> saveRusUser(
        SaveUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveRusUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GetUserResponse> getRusUser(
        GetUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRusUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SaveUserResponse> saveEngUser(
        SaveUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveEngUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GetUserResponse> getEngUser(
        GetUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEngUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_RUS_USER = 0;
  private static final int METHODID_GET_RUS_USER = 1;
  private static final int METHODID_SAVE_ENG_USER = 2;
  private static final int METHODID_GET_ENG_USER = 3;

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
        case METHODID_SAVE_RUS_USER:
          serviceImpl.saveRusUser((SaveUserRequest) request,
              (io.grpc.stub.StreamObserver<SaveUserResponse>) responseObserver);
          break;
        case METHODID_GET_RUS_USER:
          serviceImpl.getRusUser((GetUserRequest) request,
              (io.grpc.stub.StreamObserver<GetUserResponse>) responseObserver);
          break;
        case METHODID_SAVE_ENG_USER:
          serviceImpl.saveEngUser((SaveUserRequest) request,
              (io.grpc.stub.StreamObserver<SaveUserResponse>) responseObserver);
          break;
        case METHODID_GET_ENG_USER:
          serviceImpl.getEngUser((GetUserRequest) request,
              (io.grpc.stub.StreamObserver<GetUserResponse>) responseObserver);
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
      return UserService.getDescriptor();
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
              .addMethod(getSaveRusUserMethod())
              .addMethod(getGetRusUserMethod())
              .addMethod(getSaveEngUserMethod())
              .addMethod(getGetEngUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
