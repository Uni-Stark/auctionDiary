package kr.uni.auctiondiary.ui.fragment.diary

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kr.uni.auctiondiary.databinding.ListAuctionNoteBinding
import kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity

class AuctionDiaryAdapter() :
    ListAdapter<AuctionNoteEntity, AuctionDiaryAdapter.ViewHolder>(diffUtil) {


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

        fun bind(data: AuctionNoteEntity) {

            setPlaceName(data.place)
            setTag(data.tag)
            setImage(data.picturePath)
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
        private val diffUtil = object : DiffUtil.ItemCallback<AuctionNoteEntity>() {
            override fun areItemsTheSame(
                oldItem: AuctionNoteEntity, newItem: AuctionNoteEntity
            ): Boolean = oldItem == newItem

            override fun areContentsTheSame(
                oldItem: AuctionNoteEntity, newItem: AuctionNoteEntity
            ): Boolean {
                TODO("Not yet implemented")
            }
        }
    }
}