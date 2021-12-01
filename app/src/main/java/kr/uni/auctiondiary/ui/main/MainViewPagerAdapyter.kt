package kr.uni.auctiondiary.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import kotlinx.coroutines.InternalCoroutinesApi
import kr.uni.auctiondiary.ui.fragment.FragmentAuction
import kr.uni.auctiondiary.ui.fragment.FragmentBoard
import kr.uni.auctiondiary.ui.fragment.diary.FragmentAuctionDiary
import kr.uni.auctiondiary.ui.fragment.FragmentSetting

@InternalCoroutinesApi
class MainViewPagerAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {

    //Framgent의 개수를 넣어주기
    override fun getItemCount(): Int = 4


    // 0부터 순서대로 tabLayout에 들어갈 Fragment넣어주기
    override fun createFragment(position: Int): Fragment =
        when (position) {
            0 -> FragmentAuctionDiary()
            1 -> FragmentBoard()
            2 -> FragmentAuction()
            else -> FragmentSetting()
        }
}