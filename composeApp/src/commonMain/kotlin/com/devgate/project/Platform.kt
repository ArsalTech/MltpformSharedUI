package com.devgate.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform