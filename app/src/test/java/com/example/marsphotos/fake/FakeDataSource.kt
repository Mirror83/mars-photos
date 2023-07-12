package com.example.marsphotos.fake

import com.example.marsphotos.network.MarsPhoto

object FakeDataSource {
    const val idOne = "img1"
    const val idTwo = "img2"
    const val imgSrcOne = "url.1"
    const val imgSrcTwo = "url.2"
    val photosList: List<MarsPhoto> = listOf(
        MarsPhoto(idOne, imgSrcOne),
        MarsPhoto(idTwo, imgSrcTwo),
    )
}