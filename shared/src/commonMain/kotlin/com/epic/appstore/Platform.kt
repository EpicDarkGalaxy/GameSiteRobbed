package com.epic.appstore

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform