package com.example.presentation.listtask

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.presentation.R
import com.example.presentation.databinding.FragmentListTaskBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListTaskFragment : Fragment() {
    private var _binding: FragmentListTaskBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = ListTaskFragment()
    }

    private val viewModel: ListTaskViewModel by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.myToolbar.inflateMenu(R.menu.menu_main)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListTaskBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
