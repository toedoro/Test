:: mvn clean install spring-boot:run -Dmaven.test.skip=true -Drun.jvmArguments="-Xmx64M"
call mvn clean install -Dmaven.test.skip=true -Drun.jvmArguments="-Xmx64M" 
java -jar target\bisaya-order-1.0.jar