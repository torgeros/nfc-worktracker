package ca.mcgill.nfcworktracker.create

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ca.mcgill.nfcworktracker.databinding.FragmentCreateFailureBinding

class FailureFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentCreateFailureBinding.inflate(layoutInflater)
        return binding.root
    }
}
