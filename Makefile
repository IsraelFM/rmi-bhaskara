red=`tput setaf 1`
green=`tput setaf 2`
white=`tput setaf 7`
blue=`tput setaf 4`

javac\:cliente:
	javac ClienteCalc/*.java

javac\:servidor:
	javac ServidorCalc/*.java

javac\:cliente_servidor:
	make javac:cliente && make javac:servidor

limpaClasses:
	find . -type f -path "*" -name "*.class" -delete

javac:
	make limpaClasses && make javac:cliente_servidor

java\:cliente:
	java ClienteCalc/Cliente

java\:servidor:
	java ServidorCalc/Servidor

help:
	@ echo "$(green) make javac			$(white) Compila cliente e servidor"
	@ echo "$(green) make java:cliente		$(white) Inicia cliente"
	@ echo "$(green) make java:servidor		$(white) Inicia servidor"