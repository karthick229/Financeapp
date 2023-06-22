package com.tirupathi.financeapp.activity
import android.app.ActionBar
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.tirupathi.financeapp.R

import com.tirupathi.financeapp.databinding.ActivityDlTransactionsBinding
import java.util.Locale


class DLTransactionsActivity : AppCompatActivity(), View.OnClickListener {
    //private val mTableLayout: TableLayout? = null
    //var mProgressBar: ProgressDialog? = null

    var Dueno = arrayOf(
        "1", "2", "3", "4", "5",
        "6", "7", "8", "9", "10"
    )
    var Duedate = arrayOf(
        "15/06/2023", "15/06/2023", "15/06/2023", "15/06/2023", "15/06/2023",
        "15/06/2023", "15/06/2023", "15/06/2023", "15/06/2023", "15/06/2023"
    )
    var amount = arrayOf(
        "0", "0", "0", "0", "0",
        "0", "0", "0", "0", "0"
    )
    var paid_date = arrayOf(
        "", "", "", "", "",
        "", "", "", "", ""
    )

    var collected_by = arrayOf(
        "", "", "", "", "",
        "", "", "", "", ""
    )
    private lateinit var binding:ActivityDlTransactionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDlTransactionsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val actionBar = supportActionBar
        actionBar!!.title =getString(com.tirupathi.financeapp.R.string.transactions)
        addHeaders();
        addData();
    }

    private fun getTextView(
        id: Int,
        title: String,
        color: Int,
        typeface: Int,
        bgColor: Int
    ): TextView? {
        val tv = TextView(this)
        tv.id = id
        tv.text = title.uppercase(Locale.getDefault())
        tv.setTextColor(color)
        tv.setPadding(40, 40, 40, 40)
        tv.setTypeface(Typeface.DEFAULT, typeface)
        tv.setBackgroundColor(bgColor)
        tv.layoutParams = getLayoutParams()
        tv.setOnClickListener(this@DLTransactionsActivity)
        return tv
    }

    private fun getLayoutParams(): TableLayout.LayoutParams {
        val params = TableLayout.LayoutParams(
            TableLayout.LayoutParams.WRAP_CONTENT,
            TableLayout.LayoutParams.WRAP_CONTENT
        )
        //params.setMargins(2, 0, 0, 2)
        return params
    }

    private fun getTblLayoutParams(): TableLayout.LayoutParams {
        return TableLayout.LayoutParams(
            TableLayout.LayoutParams.WRAP_CONTENT,
            TableLayout.LayoutParams.WRAP_CONTENT
        )
    }

    /**
     * This function add the headers to the table
     */
    fun addHeaders() {
        val tl = findViewById<TableLayout>(R.id.table)
//        val layoutParams = TableLayout.LayoutParams(
//            TableLayout.LayoutParams.WRAP_CONTENT,
//            TableLayout.LayoutParams.WRAP_CONTENT
//        )
//
        val row = TableRow(this)
        row.setBackgroundColor(Color.DKGRAY)
        tl.addView(row, getLayoutParams())
//
        addToTableRow("Name", row, Color.WHITE)
        addToTableRow("Age", row, Color.WHITE)
        addToTableRow("Location", row, Color.WHITE)


////
        val tr = TableRow(this)
//            //tr.layoutParams = getLayoutParams()
       // tr.addView(getTextView(0, "Due No", Color.WHITE, Typeface.BOLD, Color.BLUE))
//        tr.addView(getTextView(0, "Due Date", Color.WHITE, Typeface.BOLD, Color.BLUE))
//        tr.addView(getTextView(0, "Amount", Color.WHITE, Typeface.BOLD, Color.BLUE))
//        tr.addView(getTextView(0, "Paid Date", Color.WHITE, Typeface.BOLD, Color.BLUE))
//        tr.addView(getTextView(0, "Collected By", Color.WHITE, Typeface.BOLD, Color.BLUE))
//        tl.addView(tr, getLayoutParams())
    }
    private fun addToTableRow(str: String, row: TableRow, color: Int) {
        val t = TextView(this)
        t.setTextColor(color)
        t.text = str
        row.addView(t)
    }
    /**
     * This function add the data to the table
     */
    fun addData() {
        val dueno: Int = Dueno.size
        val tl = findViewById<TableLayout>(R.id.table)
        for (i in 0 until dueno) {
            val tr = TableRow(this)
            tr.layoutParams = getLayoutParams()
            tr.addView(
                getTextView(
                    i + 1,
                    Dueno[i],
                    Color.WHITE,
                    Typeface.NORMAL,
                    ContextCompat.getColor(this, R.color.black)
                )
            )
            tr.addView(
                getTextView(
                    i + dueno,
                    Duedate[i],
                    Color.WHITE,
                    Typeface.NORMAL,
                    ContextCompat.getColor(this, R.color.black)
                )
            )
            tr.addView(
                getTextView(
                    i + dueno,
                    amount[i],
                    Color.WHITE,
                    Typeface.NORMAL,
                    ContextCompat.getColor(this, R.color.black)
                )
            )
            tr.addView(
                getTextView(
                    i + dueno,
                    paid_date[i],
                    Color.WHITE,
                    Typeface.NORMAL,
                    ContextCompat.getColor(this, R.color.black)
                )
            )
            tr.addView(
                getTextView(
                    i + dueno,
                    collected_by[i],
                    Color.WHITE,
                    Typeface.NORMAL,
                    ContextCompat.getColor(this, R.color.black)
                )
            )
            tl.addView(tr, getTblLayoutParams())
        }
    }

    override fun onClick(v: View) {
        val id = v.id
        val tv = findViewById<TextView>(id)
        if (null != tv) {
            Log.i("onClick", "Clicked on row :: $id")
            Toast.makeText(
                this,
                "Clicked on row :: " + id + ", Text :: " + tv.text,
                Toast.LENGTH_SHORT
            ).show()
        }
    }

}