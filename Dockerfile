FROM ubuntu:latest
LABEL authors="vivekanand"

ENTRYPOINT ["top", "-b"]