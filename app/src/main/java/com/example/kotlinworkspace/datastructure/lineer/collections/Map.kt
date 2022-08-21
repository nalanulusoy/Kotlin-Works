package com.example.kotlinworkspace.datastructure.lineer


/**
 * Created by Nalan Ulusoy on 21,Ağustos,2022
 */
/* public fun <K, V> hashMapOf(vararg pairs: Pair<K, V>):
HashMap<K, V> = HashMap<K, V>
Collection package inside
The default implementation of Map –
LinkedHashMap – preserves the order of elements insertion when iterating the map.
 In turn, an alternative implementation – HashMap – says nothing about the elements order.
*/
fun main() {
    val favoriteCityList = mutableMapOf("London" to 1, "Newyork" to 3, "Toronto" to
            2) // readable and writable it is not allow same key with different value
    // it is possible diffrenet key same value
    favoriteCityList["Budapeşte"] = 4
    favoriteCityList["Budapeşte"] = 5
    favoriteCityList["Madrid"] = 3
    println(favoriteCityList) //{London=1, Newyork=3, Toronto=2, Budapeşte=5, Madrid=3}
    val map = mapOf("London" to 1, "Newyork" to 3) //only readable
    println(map) //{London=1, Newyork=3}

    val hashMap = hashMapOf("London" to 1, "Newyork" to 3, "Toronto" to
            2)
    hashMap["Berlin"] = 4
    hashMap["Roma"] = 5
    println(hashMap) //{London=1, Newyork=3, Toronto=2, Berlin=4, Roma=5}

    val linkedMap = hashMapOf("London" to 1, "Newyork" to 3, "Toronto" to
            2)
    linkedMap["Berlin"] = 4
    linkedMap["Roma"] = 5
    println(linkedMap) //{London=1, Newyork=3, Toronto=2, Berlin=4, Roma=5}

    val filteredMap = linkedMap.filter { (key, value) -> key.endsWith("1") && value > 10}
     println(filteredMap)
}