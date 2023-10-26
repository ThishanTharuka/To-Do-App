package com.example.todoapp.utils

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapp.databinding.EachTodoItemBinding

/**
 * An adapter for managing the to-do task list in a RecyclerView.
 * @property list The list of to-do tasks to be displayed.
 */
class ToDoAdapter(private val list: MutableList<ToDoData>) :
    RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>() {

    private var listener: ToDoAdapterClicksInterface? = null

    /**
     * Set the click listener for the adapter.
     * @param listener The listener to handle item click events.
     */
    fun setListener(listener: ToDoAdapterClicksInterface) {
        this.listener = listener
    }

    /**
     * A view holder for each to-do task item.
     * @param binding The binding for the view of each task item.
     */
    class ToDoViewHolder(val binding: EachTodoItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val binding =
            EachTodoItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ToDoViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        with(holder) {
            with(list[position]) {
                binding.todoTask.text = this.task

                binding.deleteTask.setOnClickListener {
                    listener?.onDeleteTaskBtnClicked(this, position)
                }
            }
        }
    }

    /**
     * Interface for handling click events on to-do tasks in the adapter.
     */
    interface ToDoAdapterClicksInterface {
        /**
         * Handle the click event when the "Delete" button is clicked for a to-do task.
         * @param toDoData The to-do task to be deleted.
         * @param position The position of the task in the list.
         */
        fun onDeleteTaskBtnClicked(toDoData: ToDoData, position: Int)
    }
}
