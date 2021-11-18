package com.example.myapplication

data class Item(var title :String, var description: String)

object Supplier{
    val items = listOf<Item>(
        Item("Parker Pen","Parker Pen is great to use"),
        Item("Realme 3 pro","Realme 3 pro is great to use"),
        Item("LG Smart Tv","LG Smart Tv is great to use"),
        Item("Shoe Rack ","Shoe Rack is great to use"),
        Item("Dinning table","Dinning table is great to use"),
        Item("Curtain","Curtain is great to use"),
        Item("Lamp","Lamp is great to use"),
        Item("Realme Charger","Realme Charger is great to use"),
        Item("Flower Pot","Flower Pot is great to use"),
        Item("Hp Laptop Pavilion Series","Hp Laptop Pavilion Series is great to use"),
        Item("HP original Battery","HP original Battery is great to use"),
        Item("Boat HeadPhones","Boat HeadPhones is great to use"),
        Item("Diwali Lights 40 feet","Diwali Lights 40 feet is great to use"),
        Item("Cinthol Soaps","Cinthol Soaps is great to use"),
        Item("Fire TV Stick","Fire TV Stick is great to use"),
        Item("Classmate Registers","Classmate Registersis great to use")

    )

}