package kr.uni.auctiondiary.ui.fragment.diary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import kr.uni.auctiondiary.R
import kr.uni.auctiondiary.databinding.FragmentAuctionDiaryBinding
import java.util.*
import javax.inject.Inject


@AndroidEntryPoint
class FragmentAuctionDiary : Fragment() {
    @Inject
    lateinit var viewModel: AuctionDiaryViewModel
    lateinit var binding: FragmentAuctionDiaryBinding
    lateinit var adapter: AuctionDiaryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_auction_diary, container, false)
        binding.apply {
            fm = this@FragmentAuctionDiary
            lifecycleOwner = this@FragmentAuctionDiary
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initList()
    }

    /**----------------------------------
     *
     *    RecyclerView Setting 해주기
     *
    ----------------------------------*/
    private fun initList() {
        val lm = LinearLayoutManager(requireContext())
        adapter = AuctionDiaryAdapter()
        binding.list.adapter = adapter
        binding.list.layoutManager = lm

        lifecycleScope.launch { // lifeCycleScope안에서 돌게 하기
            viewModel.fetchAuctionNoteData().observe(viewLifecycleOwner) { data ->
                // Data Null Check 후 없다면 없다는 표시 내보내기
                // 현재는 isNotEmpty를 사용하여 Empty가 아니면 데이터를 세팅해줌
                // else에다가 데이터가 없으면 아무것도 없다는 표시를 내보내주게 하기
                if (data.isNotEmpty()) {
                    adapter.submitList(data)
                    listSetOnMainThread(SHOW_LIST)
                } else {
                    listSetOnMainThread(SHOW_EMPTY_LIST)
                }
            }
        }
    }

    private fun listSetOnMainThread(state: Int) {
        activity?.runOnUiThread {
            when (state) {
                SHOW_LIST -> {
                    binding.list.visibility = View.VISIBLE
                    binding.noAuctionListContainer.visibility = View.GONE
                }
                SHOW_EMPTY_LIST -> {
                    binding.list.visibility = View.GONE
                    binding.noAuctionListContainer.visibility = View.VISIBLE
                }
            }
        }
    }

    companion object {
        private const val SHOW_LIST = 1001
        private const val SHOW_EMPTY_LIST = 1002
    }


}