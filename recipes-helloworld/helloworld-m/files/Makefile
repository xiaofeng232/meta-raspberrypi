# Makefile（注意命令行前的制表符）

CC ?= $(CROSS_COMPILE)gcc
CFLAGS ?= -Wall -O2
TARGET = helloworld-m

all: $(TARGET)

$(TARGET): helloworld.c
	$(CC) $(CFLAGS) $(LDFLAGS) -o $@ $<

clean:
	rm -f $(TARGET)

install: $(TARGET)
	install -d $(DESTDIR)$(bindir)
	install -m 0755 $(TARGET) $(DESTDIR)$(bindir)