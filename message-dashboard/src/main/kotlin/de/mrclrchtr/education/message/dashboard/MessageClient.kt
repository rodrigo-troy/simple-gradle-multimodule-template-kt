package de.mrclrchtr.education.message.dashboard

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Component

@Component
class MessageClient(
    templateBuilder: RestTemplateBuilder,
    config: MessageFactoryProperties
) {
    private val restTemplate =
        templateBuilder.rootUri("${config.protocol}://${config.host}:${config.port}/${config.path}").build()

    fun getMessagesOfUser(username: String): List<Message> {
        val response = restTemplate.exchange(
            "/$username",
            HttpMethod.GET,
            null,
            object : ParameterizedTypeReference<List<Message>>() {},
        )

        return response.body ?: ArrayList()
    }
}
