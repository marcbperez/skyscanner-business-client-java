FROM marcbperez/docker-gradle
MAINTAINER marcbperez@users.noreply.github.com

ADD . /home/builder
WORKDIR /home/builder
CMD gradle --continuous
