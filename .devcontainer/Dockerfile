ARG TARGET_JAVA_VERSION=19

FROM openjdk:${TARGET_JAVA_VERSION}-jdk-alpine

ENV LC_ALL C.UTF-8

ARG USER_ID="10000"
ARG GROUP_ID="10000"
ARG USER_NAME="vscode"

RUN apk add --update-cache --no-cache \
    bash \
    git \
    && addgroup -g "${GROUP_ID}" "${USER_NAME}" \
    && adduser -u "${USER_ID}" -G "${USER_NAME}" -D "${USER_NAME}" -h "/home/${USER_NAME}" -s /bin/bash

WORKDIR /workspaces

USER ${USER_NAME}

RUN echo 'PS1="\[\e]0;\u@\h: \w\a\]\n\[\033[01;32m\]\u@\h\[\033[00m\]:\[\033[01;34m\]\w\[\033[00m\] \[\033[01;33m\](in container)\[\033[00m\]\n$ "' >> "/home/${USER_NAME}/.bashrc"
