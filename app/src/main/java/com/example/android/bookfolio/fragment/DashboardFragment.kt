package com.example.android.bookfolio.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.bookfolio.R
import com.example.android.bookfolio.adapter.DashboardRecyclerAdapter

/**
 * A simple [Fragment] subclass.
 */
class DashboardFragment : Fragment() {
    lateinit var recyclerDashboard: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter :DashboardRecyclerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)

        recyclerDashboard = view.findViewById(R.id.dashboard)

        layoutManager = LinearLayoutManager(activity)

        recyclerAdapter =DashboardRecyclerAdapter(activity as Context, bookList)

        recyclerDashboard.adapter = recyclerAdapter

        recyclerDashboard.layoutManager = layoutManager

        recyclerDashboard.addItemDecoration{
            DividerItemDecoration{
                recyclerDashboard.context,
                (layoutManager as LinearLayoutManager).orientation
            }
        }
        return view
    }



}
