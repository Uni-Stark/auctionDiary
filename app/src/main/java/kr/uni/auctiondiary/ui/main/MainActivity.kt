package kr.uni.auctiondiary.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.InternalCoroutinesApi
import kr.uni.auctiondiary.R
import kr.uni.auctiondiary.databinding.ActivityMainBinding
import kr.uni.auctiondiary.util.BaseActivity
import javax.inject.Inject


@AndroidEntryPoint
@InternalCoroutinesApi
class MainActivity : BaseActivity() {
    @Inject
    lateinit var viewModel: MainViewModel
    lateinit var binding: ActivityMainBinding

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