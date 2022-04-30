package homework.lesson9.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class WebClientConfiguration {

    @Bean
    fun webClientConfig(): WebClient {
        return WebClient.builder()
            .baseUrl("http://localhost:9000")
            .build()
    }
}