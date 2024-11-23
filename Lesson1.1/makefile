SRC_DIR := src
OUT_DIR := out
DOC_DIR := doc

JC := javac
JDOC := javadoc

JSRC := -sourcepath ./$(SRC_DIR)
JCLASS := -cp ./$(OUT_DIR)
JCDEST := -d $(OUT_DIR)
JDOCDEST := -d $(DOC_DIR)
MAIN_SOURCE := ru/gb/jcore/sample/Main
MAIN_CLASS := ru.gb.jcore.sample.Main

all:
	@echo "Компиляция исходных файлов..."
	$(JC) $(JSRC) $(JCDEST) $(SRC_DIR)/$(MAIN_SOURCE).java

clean:
	@echo "Очистка каталога..."
	rm -rf $(OUT_DIR) $(DOC_DIR)

docs:
	@echo "Создание документации..."
	$(JDOC) $(JSRC) $(JCLASS) -subpackages ru -d $(DOC_DIR)

run:
	@echo "Запуск программы..."
	cd $(OUT_DIR) && java $(MAIN_CLASS)