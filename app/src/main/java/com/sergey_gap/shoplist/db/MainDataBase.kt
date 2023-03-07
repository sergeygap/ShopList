package com.sergey_gap.shoplist.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.sergey_gap.shoplist.entities.LibraryItem
import com.sergey_gap.shoplist.entities.NoteItem
import com.sergey_gap.shoplist.entities.ShopListItem
import com.sergey_gap.shoplist.entities.ShopListNameItem


@Database (entities = [LibraryItem::class, NoteItem::class,
    ShopListItem::class, ShopListNameItem::class], version = 1,
    exportSchema = true
)
abstract class MainDataBase : RoomDatabase() {
    abstract fun getDao(): Dao

    companion object{
        @Volatile
        private var INSTANCE: MainDataBase? = null
        fun getDataBase(context: Context): MainDataBase{
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MainDataBase::class.java,
                    "shopping_list_db"
                ).build()
                instance
            }
        }
    }
}