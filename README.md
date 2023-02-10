## GraalVM Native Support

Generate a spring boot 3 native app either in a docker image or an executable using graalVM.

You need a java graalVM distribution:
```shell
sdk install java 22.3.r17-nik
```

To create a docker image containing the native executable:
```shell
./gradlew bootBuildImage
```

Then, you can start the app with a container:
```shell
docker-compose -f docker-compose-spring-native.yaml up -d
```

Alternatively to create locally the native executable only run:
```shell
./gradlew clean nativeCompile
```

Then you can run the local app executable:
```shell
./build/native/nativeCompile/spring-native
```

Hit app endpoints with:
```shell
curl http://localhost:8080/api/books/
```

To run your existing tests in a native image, run the following goal:
```shell
./gradlew nativeTest
```

Start spring boot app using jar:
```shell
./gradlew bootRun
```

ref:
- https://docs.spring.io/spring-boot/docs/current/reference/html/native-image.html
