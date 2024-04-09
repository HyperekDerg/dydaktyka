SOURCES = $(wildcard *.java)
CLASSES = $(SOURCES:%.java=%.class)
RUN = Main

all: $(CLASSES)

.PHONY: run
run:
	java $(RUN)

%.class: %.java
	javac $<

.PHONY: clean
clean:
	rm -rf *.class *~
