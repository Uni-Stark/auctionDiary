package kr.uni.auctiondiary.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import kr.uni.auctiondiary.R
import kr.uni.auctiondiary.databinding.FragmentImjangBinding


class FragmentImjang : Fragment() {
    lateinit var binding: FragmentImjangBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_imjang, container, false)
        binding.apply {
            fm = this@FragmentImjang
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}