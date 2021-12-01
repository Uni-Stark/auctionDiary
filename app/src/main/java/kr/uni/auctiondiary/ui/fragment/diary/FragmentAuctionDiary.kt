package kr.uni.auctiondiary.ui.fragment.diary

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*
import kr.uni.auctiondiary.R
import kr.uni.auctiondiary.databinding.FragmentAuctionDiaryBinding
import kr.uni.auctiondiary.ui.activity.WriteAuctionActivity
import kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity
import kr.uni.auctiondiary.util.database.repo.AuctionNoteRepo
import java.util.*
import javax.inject.Inject


@AndroidEntryPoint
@InternalCoroutinesApi
class FragmentAuctionDiary : Fragment() {
    private val viewModel: AuctionDiaryViewModel by viewModels()
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
            floatingButton.setOnClickListener {
                startActivity(Intent(requireContext(), WriteAuctionActivity::class.java))
            }
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

        CoroutineScope(Dispatchers.IO).launch { // lifeCycleScope안에서 돌게 하기
            //Test Data
//            AuctionNoteRepo(requireContext()).insert(
//                AuctionNoteEntity(
//                    idx = 0,
//                    tag = "t",
//                    place = "PLACE",
//                    picturePath = "PATH"
//                )
//            )
            CoroutineScope(Dispatchers.Main).launch {

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
    }

    private fun listSetOnMainThread(state: Int) {
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

    companion object {
        private const val SHOW_LIST = 1001
        private const val SHOW_EMPTY_LIST = 1002
    }


}