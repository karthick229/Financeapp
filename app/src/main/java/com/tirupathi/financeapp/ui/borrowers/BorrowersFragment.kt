package com.tirupathi.financeapp.ui.borrowers

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.tirupathi.financeapp.BorrowerActivity
import com.tirupathi.financeapp.MainActivity
import com.tirupathi.financeapp.databinding.ActivityMainsBinding
import com.tirupathi.financeapp.databinding.FragmentBorrowersBinding
import com.tirupathi.financeapp.databinding.FragmentNotificationsBinding
import com.tirupathi.financeapp.ui.borrowers.BorrowersViewModel

class BorrowersFragment : Fragment() {

    private var _binding: FragmentBorrowersBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(BorrowersViewModel::class.java)

        _binding = FragmentBorrowersBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val fab: TextView = binding.fab
        val textView: TextView = binding.textNotifications
        fab.setOnClickListener {

            (activity as MainActivity).callintent()
        }

        notificationsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}