# Use Jenkins inbound-agent with JDK11 as a base image
FROM jenkins/jenkins:lts-jdk11

USER root

# Installing necessary dependencies for building ORT
RUN apt-get update && \
    apt-get install -y git software-properties-common curl unzip

# Setting JAVA_HOME environment variable
ENV JAVA_HOME /opt/java/openjdk


# Clone ORT repository and build ORT
RUN git clone https://github.com/oss-review-toolkit/ort.git && \
    cd ort && \
    ./gradlew installDist


# Add ORT to PATH
ENV PATH="/opt/ort/cli/build/install/ort/bin:${PATH}"

USER jenkins
