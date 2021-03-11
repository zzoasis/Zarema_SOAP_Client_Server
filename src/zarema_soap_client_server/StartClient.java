package zarema_soap_client_server;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// Используем библиотеки Apache CXF для реализации SOAP-клиента
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class StartClient {

    public static void main(String[] args) {
        try {
            Properties prop = new Properties(); // Переменная для доступа к файлу с настройкой
            prop.load(new FileInputStream("sca.config")); // Загружаем данные с файла настроек
            String serverEndpoint = prop.getProperty("server.endpoint"); // Считываем параметр с данных файла настроек

            // ПОДКЛЮЧАЕМСЯ К SOAP-СЕРВЕРУ
            JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
            factoryBean.setServiceClass(ICommunicationWithClient.class);
            factoryBean.setAddress(serverEndpoint);
            ICommunicationWithClient soapService = (ICommunicationWithClient) factoryBean.create();

            // Вызов удаленного метода на сервере через web-технологию SOAP
            Answer answer = soapService.solution(24, 58, 7); //a, b, x

            if (answer != null) {
                System.out.println(answer);
            } else {
                System.out.println("Нет решения!");
            }

        } catch (IOException e) {
            System.err.println("Ошибка клиента!");
        }
    }
}
