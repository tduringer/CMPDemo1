package com.trintduringer.cmp_demo1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform