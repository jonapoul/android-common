package com.jonapoul.common.ui.recyclerview

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * A base implementation of the [RecyclerView.ViewHolder] class, exposing a single method to be
 * called when the view is being bound to an item of type [ItemType].
 */
abstract class CommonViewHolder<ItemType>(root: View) : RecyclerView.ViewHolder(root) {
    protected val context: Context
        get() = itemView.context

    abstract fun bindTo(item: ItemType)
}
