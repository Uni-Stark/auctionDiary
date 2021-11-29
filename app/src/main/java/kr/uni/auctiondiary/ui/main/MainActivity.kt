package kr.uni.auctiondiary.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint
import kr.uni.auctiondiary.R
import kr.uni.auctiondiary.databinding.ActivityMainBinding
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            activity = this@MainActivity
        }

        tabLayoutSetting()
    }

    private fun tabLayoutSetting() {

        /**
         * viewpager에 adapter를 먼저 세팅시켜야지 Exception이 안생긴다.
         */

        binding.mainViewPager.apply {
            adapter = MainViewPagerAdapter(context as FragmentActivity)
        }

        val tabList = listOf("임장노트", "게시판", "경매정보", "세팅")
        TabLayoutMediator(binding.mainTabContainer, binding.mainViewPager) { tab, position ->
            tab.text = tabList[position]
        }.attach()
    }
}