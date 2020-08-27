package cs.kornkamon.android.newapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import cs.kornkamon.android.newapp.database.DatabaseDAO
import cs.kornkamon.android.newapp.databinding.FragmentContactBinding

class ContactViewModel(
    val database: DatabaseDAO,
    private val binding: FragmentContactBinding,
    application: Application
) : AndroidViewModel(application) {
}