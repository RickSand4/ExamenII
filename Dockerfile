FROM ubuntu:latest
LABEL authors="shino"

ENTRYPOINT ["top", "-b"]