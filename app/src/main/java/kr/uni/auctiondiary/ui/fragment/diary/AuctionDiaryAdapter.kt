package kr.uni.auctiondiary.ui.fragment.diary

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kr.uni.auctiondiary.databinding.ListAuctionNoteBinding

class AuctionDiaryAdapter() :
    ListAdapter<AuctionDiaryDAO, AuctionDiaryAdapter.ViewHolder>(diffUtil) {


    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): AuctionDiaryAdapter.ViewHolder {

        return ViewHolder(
           ListAuctionNoteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: AuctionDiaryAdapter.ViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    inner class ViewHolder(private val binding: ListAuctionNoteBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: AuctionDiaryDAO) {

            setPlaceName(data.place)
            setTag(data.tag)
            setImage(data.imagePath)
        }

        private fun setPlaceName(name: String) {
            binding.auctionNoteListLocation.text = name
        }

        private fun setTag(tag: String) {
            //Parsing 해줘야함
        }

        private fun setImage(path: String) {
            Glide.with(binding.root.context)
                .load(path)
                // error 처리해줘야함
                // .error()

                .into(binding.auctionNoteListImage)
        }
    }

    companion object {
        private val diffUtil = object : DiffUtil.ItemCallback<AuctionDiaryDAO>() {
            override fun areItemsTheSame(
                oldItem: AuctionDiaryDAO, newItem: AuctionDiaryDAO
            ): Boolean = oldItem == newItem

            override fun areContentsTheSame(
                oldItem: AuctionDiaryDAO, newItem: AuctionDiaryDAO
            ): Boolean {
                TODO("Not yet implemented")
            }
        }
    }
}