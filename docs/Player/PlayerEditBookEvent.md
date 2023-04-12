---
description: PlayerEditBookEvent
---

# PlayerEditBookEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerEditBookEvent

### 类描述

> Called when a player edits or signs a book and quill item. If the event is
>
> cancelled, no changes are made to the BookMeta
>
>
> 
> 当玩家编辑一份书与笔物品堆的内容或在一份书与笔物品堆上签名时触发。
>
> 如果本事件被取消，则涉事物品堆的 `BookMeta` 不会改变。

### 方法列表

#### getPreviousBookMeta

方法声明: public BookMeta getPreviousBookMeta()

方法签名: ()Lorg/bukkit/inventory/meta/BookMeta;

> Gets the book meta currently on the book.
>
> Note: this is a copy of the book meta. You cannot use this object to
>
> change the existing book meta.
>
> @return the book meta currently on the book
>
>
> 
> 该方法用于获取书与笔物品堆的原有 `BookMeta` 。
>
> 该方法的返回值只是物品堆 `BookMeta` 的一份副本。对这份副本进行任何修改都不会对事件中的物品堆造成任何影响。
>
> @return 书与笔物品堆的原有 `BookMeta` 。

#### getNewBookMeta

方法声明: public BookMeta getNewBookMeta()

方法签名: ()Lorg/bukkit/inventory/meta/BookMeta;

> Gets the book meta that the player is attempting to add to the book.
>
> Note: this is a copy of the proposed new book meta. Use {@link
>
> #setNewBookMeta(BookMeta)} to change what will actually be added to the
>
> book.
>
> @return the book meta that the player is attempting to add
>
>
> 
> 该方法用于获取书与笔物品堆修改后的新 `BookMeta` 。
>
> 该方法的返回值只是物品堆 `BookMeta` 的一份副本。修改副本以后，调用 `setNewBookMeta(BookMeta)` 方法可用将修改应用于事件中的物品堆。
>
> @return 书与笔物品堆修改后的新 `BookMeta` 。

#### getSlot

方法声明: public int getSlot()

方法签名: ()I

> Gets the inventory slot number for the book item that triggered this
>
> event.
>
> This is a slot number on the player's hotbar in the range 0-8, or -1 for
>
> off hand.
>
> @return the inventory slot number that the book item occupies
>
> @deprecated books may be signed from off hand
>
>
> 
> 该方法用于获取事件中的书本物品堆所在的槽位序号。
>
> 如果书本物品堆在玩家的快捷物品栏，则序号为 `0-8` ，如果物品堆在玩家副手，则序号为 `-1` 。
>
> @return 书本物品堆所在的槽位序号。
>
> @deprecated 书本物品堆可能位于副手（参见译注）。
>
>
> 
> 译注：最初并没有“签名副手所持的书与笔”这一操作，因此该方法一开始只返回 `0-8` 的槽位序号，后来副手书与笔也可以被签名了，但该方法没有及时更新，仍然只能返回主手的快捷物品栏的槽位序号，因此被标记为过时（不支持副手）。再后来该方法得到了更新，当书与笔位于副手时返回 `-1` ，因此它已经不再处于过时状态了。该方法的文档却未能与时俱进地修改。

#### setNewBookMeta

方法声明: public void setNewBookMeta(@NotNull BookMeta newBookMeta) throws IllegalArgumentException

方法签名: (Lorg/bukkit/inventory/meta/BookMeta;)V

> Sets the book meta that will actually be added to the book.
>
> @param newBookMeta new book meta
>
> @throws IllegalArgumentException if the new book meta is null
>
>
> 
> 该方法用于设置书与笔物品堆的新 `BookMeta` 。此方法参数中的 `BookMeta` 将会在游戏内被实际体现。
>
> @param newBookMeta 新 `BookMeta` 。
>
> @deprecated 如果传入的参数为 `null` ，则抛出 `IllegalArgumentException` 。

#### isSigning

方法声明: public boolean isSigning()

方法签名: ()Z

> Gets whether or not the book is being signed. If a book is signed the
>
> Material changes from BOOK_AND_QUILL to WRITTEN_BOOK.
>
> @return true if the book is being signed
>
>
> 
> 该方法用于获取该书本是否要被签名。如果一本书被签名了，那么其材质将由 `BOOK_AND_QUILL` 变为 `WRITTEN_BOOK` 。
>
> @return 该书本是否要被签名，如果要被签名则返回 `true` 。

#### setSigning

方法声明: public void setSigning(boolean signing)

方法签名: (Z)V

> Sets whether or not the book is being signed. If a book is signed the
>
> Material changes from BOOK_AND_QUILL to WRITTEN_BOOK.
>
> @param signing whether or not the book is being signed.
>
>
> 
> 该方法用于设置该书本是否要被签名。如果一本书被签名了，那么其材质将由 `BOOK_AND_QUILL` 变为 `WRITTEN_BOOK` 。
>
> @param signing 该书本是否要被签名。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V