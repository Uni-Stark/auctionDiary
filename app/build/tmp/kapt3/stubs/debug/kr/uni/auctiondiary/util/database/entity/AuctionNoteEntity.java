package kr.uni.auctiondiary.util.database.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@androidx.room.Entity(tableName = "AUCTION_NOTE")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r\u00a8\u0006#"}, d2 = {"Lkr/uni/auctiondiary/util/database/entity/AuctionNoteEntity;", "", "idx", "", "picturePath", "", "simplePlace", "detailPlcae", "tag", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDetailPlcae", "()Ljava/lang/String;", "setDetailPlcae", "(Ljava/lang/String;)V", "getIdx", "()I", "setIdx", "(I)V", "getPicturePath", "setPicturePath", "getSimplePlace", "setSimplePlace", "getTag", "setTag", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class AuctionNoteEntity {
    @androidx.room.ColumnInfo(name = "NOTE_IDX")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int idx;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "PICTURE_PATH")
    private java.lang.String picturePath;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "SIMPLE_PLACE")
    private java.lang.String simplePlace;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "DETAIL_PLACE")
    private java.lang.String detailPlcae;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "TAG")
    private java.lang.String tag;
    
    @org.jetbrains.annotations.NotNull()
    public final kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity copy(int idx, @org.jetbrains.annotations.NotNull()
    java.lang.String picturePath, @org.jetbrains.annotations.NotNull()
    java.lang.String simplePlace, @org.jetbrains.annotations.NotNull()
    java.lang.String detailPlcae, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public AuctionNoteEntity(int idx, @org.jetbrains.annotations.NotNull()
    java.lang.String picturePath, @org.jetbrains.annotations.NotNull()
    java.lang.String simplePlace, @org.jetbrains.annotations.NotNull()
    java.lang.String detailPlcae, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getIdx() {
        return 0;
    }
    
    public final void setIdx(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPicturePath() {
        return null;
    }
    
    public final void setPicturePath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSimplePlace() {
        return null;
    }
    
    public final void setSimplePlace(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDetailPlcae() {
        return null;
    }
    
    public final void setDetailPlcae(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTag() {
        return null;
    }
    
    public final void setTag(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}