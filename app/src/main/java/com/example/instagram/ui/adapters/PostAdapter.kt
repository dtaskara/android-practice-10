package com.example.instagram.ui.adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram.R
import com.example.instagram.ui.models.Post

class PostAdapter (
    private val items: List<Post> = listOf(),
    private val onItemClick: (Post) -> Unit
) : RecyclerView.Adapter<PostAdapter.ToDoItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ToDoItemViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(
                R.layout.layout_post, parent, false)
    )


    override fun onBindViewHolder(holder: ToDoItemViewHolder, position: Int) {
        holder.bindToDoItem(items[position])
    }

    override fun getItemCount() = items.size

    inner class ToDoItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        fun bindToDoItem(item: Post) {

//            view.name.text = item.name
//            view.number.text = item.number
//            view.quantity.text = "Места:" +  item.quantity ;
//            view.road.text = item.city + " - " + item.toCity ;
//            view.leaveDate.text = item.leaveDate ;
//            view.arriveDate.text = item.arriveDate ;

            view.setOnClickListener {
                onItemClick(item)
            }

        }
    }
}