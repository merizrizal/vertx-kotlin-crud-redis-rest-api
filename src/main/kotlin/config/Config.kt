package config

import java.io.FileInputStream
import java.util.Properties

class Config {
    val host: String
    val password: String
    val database: String

    init {
        val props = Properties()
        props.load(FileInputStream("env.properties"))

        host = props.getProperty("redis.host")
        password = props.getProperty("redis.password")
        database = props.getProperty("redis.database")
    }
}