package com.example.instagram.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram.R
import com.example.instagram.ui.adapters.PostAdapter
import com.example.instagram.ui.models.Post

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
//        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
            val recyclerView = activity?.findViewById(
                R.id.my_recycler_view) as? RecyclerView;
            recyclerView?.layoutManager = LinearLayoutManager(activity)

            val post = Post(1, null, "Almaty", "test", 500, null, null);
            val post1 = Post(1, null, "Almaty", "test", 500, null, null);
            val post2 = Post(1, null, "Almaty", "test", 500, null, null);
            val post3 = Post(1, null, "Almaty", "test", 500, null, null);
            val post4 = Post(1, null, "Almaty", "test", 500, null, null);
            val posts = listOf<Post>(post,
                post1, post2, post3, post4
            );
            recyclerView?.adapter = PostAdapter(posts, onItemClick = {
            });

        })






        return root
    }
}