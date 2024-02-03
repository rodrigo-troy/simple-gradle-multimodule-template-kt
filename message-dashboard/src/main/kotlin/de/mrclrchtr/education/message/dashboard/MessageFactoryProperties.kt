package de.mrclrchtr.education.message.dashboard

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

/**
 * Created with IntelliJ IDEA.
$ Project: simple-gradle-multimodule
 * User: rodrigotroy
 * Date: 02-02-24
 * Time: 21:10
 */
@Component
@ConfigurationProperties(prefix = "message.factory")
class MessageFactoryProperties {
    lateinit var path: String
    lateinit var protocol: String
    lateinit var host: String
    lateinit var port: Integer
}
