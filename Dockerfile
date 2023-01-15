FROM alpine
RUN mkdir mydir
COPY * mydir/
CMD ["ls", "mydir"]
