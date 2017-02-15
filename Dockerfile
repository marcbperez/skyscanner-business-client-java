FROM ubuntu:16.04
MAINTAINER marcbperez@github.com

ADD . /home/builder
WORKDIR /home/builder

# Install software-properties-common for add-apt-repository.
RUN apt-get update && apt-get install -y software-properties-common
# Add third-party APT repositories.
RUN add-apt-repository -y ppa:cwchien/gradle

# Install a minimal Java runtime, gradle and groovy.
RUN apt-get update && apt-get install -y default-jdk gradle=3.3-0ubuntu1

# Run the continuous build.
CMD gradle --continuous
