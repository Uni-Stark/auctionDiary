package kr.uni.auctiondiary.ui.fragment.diary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import kr.uni.auctiondiary.R
import kr.uni.auctiondiary.databinding.FragmentAuctionDiaryBinding


@AndroidEntryPoint
class FragmentAuctionDiary : Fragment() {
    lateinit var binding: FragmentAuctionDiaryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_auction_diary, container, false)
        binding.apply {
            fm = this@FragmentAuctionDiary
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun initList(){
        val lm = LinearLayoutManager(requireContext())


    }
}