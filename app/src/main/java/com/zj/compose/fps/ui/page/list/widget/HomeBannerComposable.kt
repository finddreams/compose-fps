package com.zj.compose.fps.ui.page.list.widget

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.zj.compose.fps.ui.page.list.BannerList


@Composable
fun HomeBannerComposable(item: BannerList) {
    HomeBannerSection(item)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeBannerSection(data: BannerList) {
    val bannerState = remember {
        PagerState(data.list.size)
    }
    HorizontalPager(state = bannerState, pageCount = data.list.size,) {
        val cover = data.list[it].cover
        Box {
            NetworkImage(
                url = cover,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
        }

    }
}