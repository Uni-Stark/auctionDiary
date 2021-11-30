package kr.uni.auctiondiary.ui.main

import android.content.Context
import androidx.lifecycle.ViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.InternalCoroutinesApi
import kr.uni.auctiondiary.util.database.AppDatabase
import kr.uni.auctiondiary.util.database.dao.AuctionNoteDao
import javax.inject.Inject

@ActivityRetainedScoped
class MainViewModel @Inject constructor(@ApplicationContext context: Context) : ViewModel() {

}