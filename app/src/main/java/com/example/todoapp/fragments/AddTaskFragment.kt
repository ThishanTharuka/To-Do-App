package com.example.todoapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.todoapp.R
import com.example.todoapp.databinding.FragmentAddTaskBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

/**
 * A fragment for adding tasks to the to-do list.
 */
class AddTaskFragment : Fragment() {

    private lateinit var binding: FragmentAddTaskBinding
    private lateinit var databaseReference: DatabaseReference
    private lateinit var navController: NavController
    private lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentAddTaskBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init(view)
        registerEvents()
    }

    /**
     * Initialize necessary components and resources.
     * @param view The fragment's view.
     */
    private fun init(view: View) {
        navController = Navigation.findNavController(view)
        auth = FirebaseAuth.getInstance()
        databaseReference =
            FirebaseDatabase.getInstance().reference.child("Tasks")
                .child(auth.currentUser?.uid.toString())
    }

    /**
     * Register click events for the UI components.
     */
    private fun registerEvents() {
        binding.addTaskBtn.setOnClickListener {
            val todoTask = binding.addTaskText.text.toString()

            if (todoTask.isNotEmpty()) {
                onSaveTask(todoTask)
            } else {
                Toast.makeText(context, "Task is empty.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    /**
     * Save a to-do task to the Firebase database.
     * @param todo The to-do task to be saved.
     */
    private fun onSaveTask(todo: String) {
        databaseReference.push().setValue(todo).addOnCompleteListener {
            if (it.isSuccessful) {
                Toast.makeText(context, "Todo saved successfully!", Toast.LENGTH_SHORT).show()
                navController.navigate(R.id.action_addTaskFragment_to_homeFragment)
            } else {
                Toast.makeText(context, it.exception?.message, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
