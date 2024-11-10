package com.mobileassignment3.exercise4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mobileassignment3.R

class Exercise4Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_exercise4_activity, container, false)

        val movieList = listOf(
            Movie("Joker", 2019, R.drawable.joker),
            Movie("Guardians-Of-The-Galaxy", 2014, R.drawable.guardians),
            Movie("Jaws", 1975, R.drawable.jaws),
            Movie("Shrek", 2001, R.drawable.shrek),
            Movie("Django", 2012, R.drawable.django)
        )

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = MovieAdapter(movieList)

        return view
    }
}