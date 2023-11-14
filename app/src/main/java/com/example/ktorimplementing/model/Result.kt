package com.example.ktorimplementing.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.serialization.Serializable

@Serializable
data class Result(
    val access_token: String,
    val auth2FAProvider: String,
    val branchId: String,
    val customerId: String,
    val customerTypeID: String,
    val customerTypeNM: String,
    val deviceIMEI: String,
    val expires: String,
    val expires_in: Int,
    val fullName: String,
    val isFirstLogin: Boolean,
    val isTPINMendatory: Boolean,
    val isquesEnable: Boolean,
    val issued: String,
    val token_type: String,
    val userName: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readInt(),
        parcel.readString() ?: "",
        parcel.readByte() != 0.toByte(),
        parcel.readByte() != 0.toByte(),
        parcel.readByte() != 0.toByte(),
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: ""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(access_token)
        parcel.writeString(auth2FAProvider)
        parcel.writeString(branchId)
        parcel.writeString(customerId)
        parcel.writeString(customerTypeID)
        parcel.writeString(customerTypeNM)
        parcel.writeString(deviceIMEI)
        parcel.writeString(expires)
        parcel.writeInt(expires_in)
        parcel.writeString(fullName)
        parcel.writeByte(if (isFirstLogin) 1 else 0)
        parcel.writeByte(if (isTPINMendatory) 1 else 0)
        parcel.writeByte(if (isquesEnable) 1 else 0)
        parcel.writeString(issued)
        parcel.writeString(token_type)
        parcel.writeString(userName)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Result> {
        override fun createFromParcel(parcel: Parcel): Result {
            return Result(parcel)
        }

        override fun newArray(size: Int): Array<Result?> {
            return arrayOfNulls(size)
        }
    }
}
