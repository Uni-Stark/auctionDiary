package kr.uni.auctiondiary.ui.fragment.diary

import android.content.Context
import android.content.Context.LOCATION_SERVICE
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.FragmentScoped
import kotlinx.coroutines.InternalCoroutinesApi
import kr.uni.auctiondiary.util.database.AppDatabase
import kr.uni.auctiondiary.util.database.dao.AuctionNoteDao
import kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity
import kr.uni.auctiondiary.util.database.repo.AuctionNoteRepo
import javax.inject.Inject

@FragmentScoped
class AuctionDiaryViewModel @Inject constructor(@ApplicationContext context: Context) :
    ViewModel() {
    @OptIn(InternalCoroutinesApi::class)
    private val database = AuctionNoteRepo(context)


    /**
     *  @return_LiveData_for_automatically_refresh_recycler_view
     */
    @InternalCoroutinesApi
    fun fetchAuctionNoteData(): LiveData<List<AuctionNoteEntity>> =
        database.fetchAll()


    fun getCurrentLocation(context: Context): String {
        val locationManager = context.getSystemService(LOCATION_SERVICE)
        // GPS 마저 해야함
        return ""
    }
}