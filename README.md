# Spring Boot 3 features

## Observation Class Spring Boot 3.0

The Observation class in Spring Boot 3.0 is a class that represents a single observation made by a monitoring system. It is part of the Spring Boot Actuator module, which provides production-ready features to help you monitor and manage your application.

The Observation class is used to store data about a single observation made by a monitoring system, such as the name of the metric being observed, the value of the metric, and the time at which the observation was made. It also includes metadata about the observation, such as the type of metric being observed and any tags or labels associated with the observation.

The Observation class is used to represent observations made by the Spring Boot Actuator module's metrics endpoint, which allows you to monitor various aspects of your application's performance, such as memory usage, CPU utilization, and response times. You can use the Observation class to access the data about a specific observation, or you can use it to query the monitoring system for a set of observations that meet certain criteria, such as a specific metric name or time range.

Overall, the Observation class is a useful tool for monitoring and managing your application with Spring Boot Actuator, providing a way to store and access data about observations made by a monitoring system.

http://localhost:8080/actuator/metrics

http://localhost:8080/actuator/metrics/getCustomers

Example:
```json
{
  "name": "getCustomers",
  "baseUnit": "seconds",
  "measurements": [
    {
      "statistic": "COUNT",
      "value": 14
    },
    {
      "statistic": "TOTAL_TIME",
      "value": 0.0006
    },
    {
      "statistic": "MAX",
      "value": 0.0000666
    }
  ],
  "availableTags": [
    {
      "tag": "error",
      "values": [
        "none"
      ]
    }
  ]
}
```

## Spring Native

Spring Native is a framework for building cloud-native applications with the Spring framework. It is an extension of the Spring framework that enables developers to build applications that can run natively on GraalVM, a high-performance runtime that allows you to run applications written in a variety of languages, including Java, JavaScript, Ruby, and Python, on the Java Virtual Machine (JVM).

Spring Native uses the Spring framework to provide a set of APIs and tools for building cloud-native applications that can be deployed on GraalVM. It enables developers to build applications that are optimized for performance and scalability, and that can take advantage of the features and capabilities of GraalVM, such as fast startup times, low memory footprint, and the ability to run multiple languages on the same runtime.

Spring Native provides a set of annotations and tools for building cloud-native applications with the Spring framework, including support for building microservices, cloud-native applications, and serverless functions. It also provides a set of tools for building and deploying applications to various cloud platforms, such as Kubernetes and OpenShift.

Overall, Spring Native is a powerful tool for building cloud-native applications with the Spring framework, enabling developers to take advantage of the features and capabilities of GraalVM and deploy their applications on cloud platforms.

### Installation of GraalVM

https://blogs.oracle.com/java/post/go-native-with-spring-boot-3-and-graalvm

### Command to compile in GraalVM
```bash
mvn -Pnative -DskipTests native:compile
```

## ProblemDetail Class

The ProblemDetail class in Spring Boot 3 is a class that represents a problem or error that has occurred in an application. It is part of the Spring Boot Actuator module, which provides production-ready features to help you monitor and manage your application.

The ProblemDetail class is used to represent a problem or error that has occurred in an application, such as a runtime exception or a validation error. It includes information about the problem, such as the type of problem, a description of the problem, and any additional details or context that may be relevant to understanding or resolving the problem.

The ProblemDetail class is often used in combination with the Spring Boot Actuator's error endpoint, which allows you to view and monitor errors that have occurred in your application. You can use the ProblemDetail class to access the data about a specific error, or you can use it to query the error endpoint for a set of errors that meet certain criteria, such as a specific error type or time range.

Overall, the ProblemDetail class is a useful tool for monitoring and managing errors in your application with Spring Boot Actuator, providing a way to store and access data about problems or errors that have occurred in your application.

## 