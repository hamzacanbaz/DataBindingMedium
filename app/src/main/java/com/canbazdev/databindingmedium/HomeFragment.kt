package com.canbazdev.databindingmedium

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.canbazdev.databindingmedium.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding get() = _binding!!
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        binding.lifecycleOwner = this
        binding.viewmodel = viewModel
        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        binding.character = Character("Vera", "Pollux", R.drawable.bob)
        binding.numberList = listOf(1, 2, 3, 4, 5)
        binding.customPadding = 10
        super.onViewCreated(view, savedInstanceState)
    }

}

@BindingAdapter("customPadding")
fun setCustomPadding(view: View, padding: Int) {
    view.setPadding(padding * 20, padding, padding * 20, padding)
}