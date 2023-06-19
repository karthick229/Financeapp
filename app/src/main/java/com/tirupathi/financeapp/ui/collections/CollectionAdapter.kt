package com.tirupathi.financeapp.ui.collections

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tirupathi.financeapp.R

class CollectionAdapter : RecyclerView.Adapter<CollectionAdapter.ViewHolder>() {

    private val name = arrayOf("sujata",
        "sujata", "sujata", "sujata",
        "sujata", "sujata", "sujata",
        "sujata")

    private val amount = arrayOf("5000", "5000",
        "5000", "5000",
        "5000", "5000",
        "5000", "5000")

    private val del = arrayOf("DL-1",
        "DL-1", "DL-1", "DL-1",
        "DL-1", "DL-1", "DL-1",
        "DL-1")
    private val due = arrayOf("sujata",
        "sujata", "sujata", "sujata",
        "sujata", "sujata", "sujata",
        "sujata")

    private val date = arrayOf("5000", "5000",
        "5000", "5000",
        "5000", "5000",
        "5000", "5000")

    private val pay = arrayOf("DL-1",
        "DL-1", "DL-1", "DL-1",
        "DL-1", "DL-1", "DL-1",
        "DL-1")

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var name: TextView
        var amount: TextView
        var dl: TextView
        var due: TextView
        var date: TextView
        var pay: Button

        init {
            name = itemView.findViewById(R.id.text_view_loan_name)
            amount = itemView.findViewById(R.id.text_loan_amount)
            dl = itemView.findViewById(R.id.text_view_collection)
            due = itemView.findViewById(R.id.text_view_loan_due)
            date = itemView.findViewById(R.id.text_view_loan_date)
            pay = itemView.findViewById(R.id.pay)

           /* itemView.setOnClickListener {
                var position: Int = getAdapterPosition()
                val context = itemView.context
                val intent = Intent(context, DetailPertanyaan::class.java).apply {
                    putExtra("NUMBER", position)
                    putExtra("CODE", itemKode.text)
                    putExtra("CATEGORY", itemKategori.text)
                    putExtra("CONTENT", itemIsi.text)
                }
                context.startActivity(intent)
            }*/
        }
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.collection_item, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.name.text = name[i]
        viewHolder.amount.text = amount[i]
        viewHolder.dl.text = del[i]
        viewHolder.due.text = del[i]
        viewHolder.date.text = del[i]
        viewHolder.pay.text = del[i]

    }

    override fun getItemCount(): Int {
        return name.size
    }


}