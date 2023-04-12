---
description: EntityPortalEvent
---

# EntityPortalEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityTeleportEvent

                =>  org.bukkit.event.entity.EntityPortalEvent

### 类描述

> Called when a non-player entity is about to teleport because it is in
> 
> contact with a portal.
> 
> For players see {@link org.bukkit.event.player.PlayerPortalEvent}
> 
> <br>
> 
> 当某个非玩家实体步入传送门准备传送时触发。
> 
> 如欲监听玩家传送，可参见 `PlayerPortalEvent` 事件。

### 方法列表

#### setSearchRadius

方法声明: public void setSearchRadius(int searchRadius)

方法签名: (I)V

> Set the Block radius to search in for available portals.
> 
> @param searchRadius the radius in which to search for a portal from the
> 
> location
> 
> <br>
> 
> 该方法用于设置搜寻可用传送门时扫描的半径。
> 
> @param searchRadius 搜寻可用传送门时扫描的半径。
> 
> <br>
> 
> 译注：对末地传送门而言，参见 `MineCraft Wiki` 中的相关页面 [https://minecraft.fandom.com/wiki/End_portal#Behavior](https://minecraft.fandom.com/wiki/End_portal#Behavior) 可知，末地黑曜石平台位置是固定的，中心点坐标永远是 (100, 48, 0) 。无论从哪个末地传送门进入末地，玩家都会以面朝西方的姿态出现在较此中心点高一格的位置，即 (100,49,0) 。因此不需要对传送门坐标进行“搜寻”。
> 
> 对下界传送门而言，参见 `MineCraft Wiki` 中的相关页面 [https://minecraft.fandom.com/wiki/Nether_portal#Portal_search](https://minecraft.fandom.com/wiki/Nether_portal#Portal_search) 可知，玩家踏入下界传送门以后，，会将玩家 `x` 和 `z` 轴坐标除以八，然后以此为中心搜寻一定半径内已有的传送门，如有，则将玩家传送到那里。如没有，则另取位置新建传送门。本方法即用于设置搜寻的半径。

#### getSearchRadius

方法声明: public int getSearchRadius()

方法签名: ()I

> Gets the search radius value for finding an available portal.
> 
> @return the currently set search radius
> 
> <br>
> 
> 该方法用于获取搜寻可用传送门时扫描的半径。
> 
> @return 搜寻可用传送门时扫描的半径。
> 
> <br>
> 
> 译注：对末地传送门而言，参见 `MineCraft Wiki` 中的相关页面 [https://minecraft.fandom.com/wiki/End_portal#Behavior](https://minecraft.fandom.com/wiki/End_portal#Behavior) 可知，末地黑曜石平台位置是固定的，中心点坐标永远是 (100, 48, 0) 。无论从哪个末地传送门进入末地，玩家都会以面朝西方的姿态出现在较此中心点高一格的位置，即 (100,49,0) 。因此不需要对传送门坐标进行“搜寻”。
> 
> 对下界传送门而言，参见 `MineCraft Wiki` 中的相关页面 [https://minecraft.fandom.com/wiki/Nether_portal#Portal_search](https://minecraft.fandom.com/wiki/Nether_portal#Portal_search) 可知，玩家踏入下界传送门以后，会将玩家 `x` 和 `z` 轴坐标除以八，然后以此为中心搜寻一定半径内已有的传送门，如有，则将玩家传送到那里。如没有，则另取位置新建传送门。本方法即用于获取搜寻的半径。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;