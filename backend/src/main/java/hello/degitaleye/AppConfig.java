package hello.degitaleye;

import com.deepl.api.Translator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class AppConfig {
    @Value("${deepL-admin-key}")
    private String deeplKey;


    @Bean
    public Translator getTranslator() {
        return new Translator(deeplKey);
    }

    @Bean
    public RestClient getRestClient() {
        return RestClient.create();
    }

}
