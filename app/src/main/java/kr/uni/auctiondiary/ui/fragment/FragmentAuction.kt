package kr.uni.auctiondiary.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import kr.uni.auctiondiary.R
import kr.uni.auctiondiary.databinding.FragmentAuctionBinding

class FragmentAuction : Fragment() {
    private lateinit var binding: FragmentAuctionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_auction, container, false)
        return binding.root
    }
}