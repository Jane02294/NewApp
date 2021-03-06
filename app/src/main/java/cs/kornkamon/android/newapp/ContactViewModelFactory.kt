package cs.kornkamon.android.newapp

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import cs.kornkamon.android.newapp.database.DatabaseDAO
import cs.kornkamon.android.newapp.databinding.FragmentContactBinding

class ContactViewModelFactory (
    private val dataSource: DatabaseDAO,
    private val binding: FragmentContactBinding,
    private val application: Application
) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ContactViewModel::class.java)) {
            return ContactViewModel(dataSource, binding, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}