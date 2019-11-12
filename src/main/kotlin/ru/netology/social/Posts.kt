package ru.netology.social

import java.util.*

class Post(val id: Int,
           val ownerID: Int,
           val fromID: Int,
           val createdBy: Int,
           val date: Date,
           val text: String,
           val replyOwnerID: Int,
           val replyPostID: Int,
           val friendsOnly: Boolean,
           val comments: Comments,
           val likes: Likes,
           val reposts: Reposts,
           val viewsCount: Int,
           val postType: String,
    //attachments,
    //geo,
           val canPin: Boolean,
           val canDelete: Boolean,
           val canEdit: Boolean,
           val isPinned: Boolean
){

}