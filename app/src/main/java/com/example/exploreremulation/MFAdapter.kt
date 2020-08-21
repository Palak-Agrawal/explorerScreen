package com.example.exploreremulation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MFAdapter(val mfList : ArrayList<MFData>) : RecyclerView.Adapter<MFAdapter.ViewHolder>() {


    class ViewHolder(mfView : View) : RecyclerView.ViewHolder(mfView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewInflator = LayoutInflater.from(parent?.context).inflate(R.layout.mf_items, parent, false)
            return ViewHolder(viewInflator)
    }

    override fun getItemCount(): Int {
        return mfList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }
}