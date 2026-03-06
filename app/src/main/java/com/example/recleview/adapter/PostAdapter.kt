package com.example.recleview.adapter

import android.renderscript.ScriptGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recleview.Post.Post
import com.example.recleview.databinding.PostItemBinding

class PostAdapter(var postlist: List<Post>): RecyclerView.Adapter<PostAdapter.MyVewHolder>() {

    inner class MyVewHolder(val binding: PostItemBinding): RecyclerView.ViewHolder(binding.root)
}